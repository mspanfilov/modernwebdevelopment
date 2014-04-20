package com.farata.course.mwd.auction.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private BigDecimal productId;

    private String title;

    private String thumb;

    private String description;

    private BigDecimal quantity;

    private Date auctionEndTime;

    private BigDecimal watchers;

    private BigDecimal minimalPrice;

    private BigDecimal reservedPrice;

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Date getAuctionEndTime() {
        return auctionEndTime;
    }

    public void setAuctionEndTime(Date auctionEndTime) {
        this.auctionEndTime = auctionEndTime;
    }

    public BigDecimal getWatchers() {
        return watchers;
    }

    public void setWatchers(BigDecimal watchers) {
        this.watchers = watchers;
    }

    public BigDecimal getMinimalPrice() {
        return minimalPrice;
    }

    public void setMinimalPrice(BigDecimal minimalPrice) {
        this.minimalPrice = minimalPrice;
    }

    public BigDecimal getReservedPrice() {
        return reservedPrice;
    }

    public void setReservedPrice(BigDecimal reservedPrice) {
        this.reservedPrice = reservedPrice;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productId=").append(productId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", thumb='").append(thumb).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append(", auctionEndTime=").append(auctionEndTime);
        sb.append(", watchers=").append(watchers);
        sb.append(", minimalPrice=").append(minimalPrice);
        sb.append(", reservedPrice=").append(reservedPrice);
        sb.append('}');
        return sb.toString();
    }
}