package com.farata.course.mwd.auction.dao;

import com.farata.course.mwd.auction.model.AuctionUser;
import com.farata.course.mwd.auction.model.AuctionUserExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuctionUserMapper {
    int countByExample(AuctionUserExample example);

    int deleteByExample(AuctionUserExample example);

    int deleteByPrimaryKey(BigDecimal userId);

    int insert(AuctionUser record);

    int insertSelective(AuctionUser record);

    List<AuctionUser> selectByExample(AuctionUserExample example);

    AuctionUser selectByPrimaryKey(BigDecimal userId);

    int updateByExampleSelective(@Param("record") AuctionUser record, @Param("example") AuctionUserExample example);

    int updateByExample(@Param("record") AuctionUser record, @Param("example") AuctionUserExample example);

    int updateByPrimaryKeySelective(AuctionUser record);

    int updateByPrimaryKey(AuctionUser record);
}