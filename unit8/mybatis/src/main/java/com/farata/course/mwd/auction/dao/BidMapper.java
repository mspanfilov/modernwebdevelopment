package com.farata.course.mwd.auction.dao;

import com.farata.course.mwd.auction.model.Bid;
import com.farata.course.mwd.auction.model.BidExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidMapper {
    int countByExample(BidExample example);

    int deleteByExample(BidExample example);

    int deleteByPrimaryKey(BigDecimal bidId);

    int insert(Bid record);

    int insertSelective(Bid record);

    List<Bid> selectByExample(BidExample example);

    Bid selectByPrimaryKey(BigDecimal bidId);

    int updateByExampleSelective(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByExample(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByPrimaryKeySelective(Bid record);

    int updateByPrimaryKey(Bid record);
}