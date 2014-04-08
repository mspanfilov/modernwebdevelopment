package com.transcapital.dit.osok.auction;

import java.time.LocalDateTime;

/**
 * Created by yfain11 on 4/4/14.
 */
public class Product {
    public int id;
    public String title;
    public String thumb;
    public String description;
    public LocalDateTime auctionEndTime;
    public int watchers;
    public double minimalPrice;     // Don't sell unless the bid is more than min price
    public double reservedPrice;   // If a bidder offers reserved price, the auction is closed
}
