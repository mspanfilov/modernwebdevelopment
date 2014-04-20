package com.farata.course.mwd.auction.dao;

import com.farata.course.mwd.auction.model.AuctionUser;
import com.farata.course.mwd.auction.model.AuctionUserExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AuctionUserMapper {
    int countByExample(AuctionUserExample example);

    int deleteByExample(AuctionUserExample example);

    @Delete({
        "delete from AUCTION_USER",
        "where USER_ID = #{userId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal userId);

    @Insert({
        "insert into AUCTION_USER (USER_ID, USER_NAME, ",
        "EMAIL, GET_OVERBID_NOTIFICATIONS)",
        "values (#{userId,jdbcType=DECIMAL}, #{userName,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{getOverbidNotifications,jdbcType=DECIMAL})"
    })
    int insert(AuctionUser record);

    int insertSelective(AuctionUser record);

    List<AuctionUser> selectByExample(AuctionUserExample example);

    @Select({
        "select",
        "USER_ID, USER_NAME, EMAIL, GET_OVERBID_NOTIFICATIONS",
        "from AUCTION_USER",
        "where USER_ID = #{userId,jdbcType=DECIMAL}"
    })
    @ResultMap("BaseResultMap")
    AuctionUser selectByPrimaryKey(BigDecimal userId);

    int updateByExampleSelective(@Param("record") AuctionUser record, @Param("example") AuctionUserExample example);

    int updateByExample(@Param("record") AuctionUser record, @Param("example") AuctionUserExample example);

    int updateByPrimaryKeySelective(AuctionUser record);

    @Update({
        "update AUCTION_USER",
        "set USER_NAME = #{userName,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "GET_OVERBID_NOTIFICATIONS = #{getOverbidNotifications,jdbcType=DECIMAL}",
        "where USER_ID = #{userId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(AuctionUser record);
}