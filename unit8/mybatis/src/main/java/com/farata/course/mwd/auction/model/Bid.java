package com.farata.course.mwd.auction.model;

import java.math.BigDecimal;
import java.util.Date;

public class Bid {
    private BigDecimal bidId;

    private BigDecimal productId;

    private Short amount;

    private BigDecimal desiredQuantity;

    private BigDecimal bidderId;

    private Date bidTime;

    public BigDecimal getBidId() {
        return bidId;
    }

    public void setBidId(BigDecimal bidId) {
        this.bidId = bidId;
    }

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public BigDecimal getDesiredQuantity() {
        return desiredQuantity;
    }

    public void setDesiredQuantity(BigDecimal desiredQuantity) {
        this.desiredQuantity = desiredQuantity;
    }

    public BigDecimal getBidderId() {
        return bidderId;
    }

    public void setBidderId(BigDecimal bidderId) {
        this.bidderId = bidderId;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Bid{");
        sb.append("bidId=").append(bidId);
        sb.append(", productId=").append(productId);
        sb.append(", amount=").append(amount);
        sb.append(", desiredQuantity=").append(desiredQuantity);
        sb.append(", bidderId=").append(bidderId);
        sb.append(", bidTime=").append(bidTime);
        sb.append('}');
        return sb.toString();
    }
}