package com.farata.course.mwd.auction.dao;

import com.farata.course.mwd.auction.model.Bid;
import com.farata.course.mwd.auction.model.BidExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BidMapper {
    int countByExample(BidExample example);

    int deleteByExample(BidExample example);

    @Delete({
        "delete from BID",
        "where BID_ID = #{bidId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal bidId);

    @Insert({
        "insert into BID (BID_ID, PRODUCT_ID, ",
        "AMOUNT, DESIRED_QUANTITY, ",
        "BIDDER_ID, BID_TIME)",
        "values (#{bidId,jdbcType=DECIMAL}, #{productId,jdbcType=DECIMAL}, ",
        "#{amount,jdbcType=DECIMAL}, #{desiredQuantity,jdbcType=DECIMAL}, ",
        "#{bidderId,jdbcType=DECIMAL}, #{bidTime,jdbcType=TIMESTAMP})"
    })
    int insert(Bid record);

    int insertSelective(Bid record);

    List<Bid> selectByExample(BidExample example);

    @Select({
        "select",
        "BID_ID, PRODUCT_ID, AMOUNT, DESIRED_QUANTITY, BIDDER_ID, BID_TIME",
        "from BID",
        "where BID_ID = #{bidId,jdbcType=DECIMAL}"
    })
    @ResultMap("BaseResultMap")
    Bid selectByPrimaryKey(BigDecimal bidId);

    int updateByExampleSelective(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByExample(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByPrimaryKeySelective(Bid record);

    @Update({
        "update BID",
        "set PRODUCT_ID = #{productId,jdbcType=DECIMAL},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "DESIRED_QUANTITY = #{desiredQuantity,jdbcType=DECIMAL},",
          "BIDDER_ID = #{bidderId,jdbcType=DECIMAL},",
          "BID_TIME = #{bidTime,jdbcType=TIMESTAMP}",
        "where BID_ID = #{bidId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Bid record);
}