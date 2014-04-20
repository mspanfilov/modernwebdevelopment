package com.farata.course.mwd.auction;

import com.farata.course.mwd.auction.dao.AuctionUserMapper;
import com.farata.course.mwd.auction.dao.BidMapper;
import com.farata.course.mwd.auction.dao.ProductMapper;
import com.farata.course.mwd.auction.model.Bid;
import com.farata.course.mwd.auction.model.BidExample;
import com.farata.course.mwd.auction.model.Product;
import com.farata.course.mwd.auction.model.ProductExample;
import oracle.jdbc.pool.OracleConnectionPoolDataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public interface Application {
    public static void main(String[] args) throws SQLException, IOException {
        Properties properties = new Properties();
        InputStream is = Application.class.getClassLoader().getResourceAsStream("db.properties");
        if (is != null) {
            properties.load(is);
        }else {
            System.err.println("Properties file db.properties not found");
            return;
        }
        OracleDataSource oracleDS = new OracleConnectionPoolDataSource();
        oracleDS.setURL(properties.getProperty("db.url"));
        oracleDS.setUser(properties.getProperty("db.user"));
        oracleDS.setPassword(properties.getProperty("db.password"));


        TransactionFactory ts = new JdbcTransactionFactory();
        Environment envt = new Environment("development", ts, oracleDS);
        Configuration cfg = new Configuration(envt);
        cfg.setLazyLoadingEnabled(true);
        cfg.addMapper(ProductMapper.class);
        cfg.addMapper(BidMapper.class);
        cfg.addMapper(AuctionUserMapper.class);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(cfg);

        try (SqlSession session = sf.openSession()) {
            ProductMapper productMapper = session.getMapper(ProductMapper.class);
            BidMapper bidMapper = session.getMapper(BidMapper.class);

            ProductExample productExample = new ProductExample();
            productExample.createCriteria().andProductIdIsNotNull();

            List<Product> productList = productMapper.selectByExample(productExample);
            productList.forEach(product -> {
                System.out.println(product);
                System.out.println("Bids for a product:");
                BidExample bidExample = new BidExample();
                bidExample.createCriteria().andProductIdEqualTo(product.getProductId());
                List<Bid> bidList = bidMapper.selectByExample(bidExample);
                bidList.forEach(bid -> System.out.println("\t"+bid.toString()));
            });
        }

    }
}
