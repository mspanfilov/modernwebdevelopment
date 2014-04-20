package com.farata.course.mwd.auction.dao;

import com.farata.course.mwd.auction.model.Product;
import com.farata.course.mwd.auction.model.ProductExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    @Delete({
        "delete from PRODUCT",
        "where PRODUCT_ID = #{productId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal productId);

    @Insert({
        "insert into PRODUCT (PRODUCT_ID, TITLE, ",
        "THUMB, DESCRIPTION, ",
        "QUANTITY, AUCTION_END_TIME, ",
        "WATCHERS, MINIMAL_PRICE, ",
        "RESERVED_PRICE)",
        "values (#{productId,jdbcType=DECIMAL}, #{title,jdbcType=VARCHAR}, ",
        "#{thumb,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{quantity,jdbcType=DECIMAL}, #{auctionEndTime,jdbcType=TIMESTAMP}, ",
        "#{watchers,jdbcType=DECIMAL}, #{minimalPrice,jdbcType=DECIMAL}, ",
        "#{reservedPrice,jdbcType=DECIMAL})"
    })
    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    @Select({
        "select",
        "PRODUCT_ID, TITLE, THUMB, DESCRIPTION, QUANTITY, AUCTION_END_TIME, WATCHERS, ",
        "MINIMAL_PRICE, RESERVED_PRICE",
        "from PRODUCT",
        "where PRODUCT_ID = #{productId,jdbcType=DECIMAL}"
    })
    @ResultMap("BaseResultMap")
    Product selectByPrimaryKey(BigDecimal productId);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    @Update({
        "update PRODUCT",
        "set TITLE = #{title,jdbcType=VARCHAR},",
          "THUMB = #{thumb,jdbcType=VARCHAR},",
          "DESCRIPTION = #{description,jdbcType=VARCHAR},",
          "QUANTITY = #{quantity,jdbcType=DECIMAL},",
          "AUCTION_END_TIME = #{auctionEndTime,jdbcType=TIMESTAMP},",
          "WATCHERS = #{watchers,jdbcType=DECIMAL},",
          "MINIMAL_PRICE = #{minimalPrice,jdbcType=DECIMAL},",
          "RESERVED_PRICE = #{reservedPrice,jdbcType=DECIMAL}",
        "where PRODUCT_ID = #{productId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Product record);
}