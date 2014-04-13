package com.transcapital.dit.osok.auction;

import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by panfilov_ms on 08.04.14.
 */
public class Main {

    static List<User> users = new ArrayList<User>();
    static List<Product> products = new ArrayList<Product>();

    public static User findUserById(int id){
        for (User i : users){
            if (i.id == id){
                return i;
            }
        }
        return null;
    }

    public static Product findProductById(int id){
        for (Product i : products){
            if (i.id == id){
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // creating users
        User user1 = new User();
        user1.id = 1;
        user1.name = "John Smith";
        user1.email = "jsmith@gmail.com";
        user1.getOverbidNotifications = true;
        users.add(user1);

        User user2 = new User();
        user2.id = 2;
        user2.name = "Michael Johnson";
        user2.email = "mjohnson@gmail.com";
        user2.getOverbidNotifications = false;
        users.add(user2);

        User user3 = new User();
        user3.id = 3;
        user3.name = "Daniel Williams";
        user3.email = "dwilliams@gmail.com";
        user3.getOverbidNotifications = true;
        users.add(user3);

        // creating products
        Product product1 = new Product();
        product1.id = 1;
        product1.title = "Product1";
        product1.thumb = "images/01.jpg";
        product1.description = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do...";
        product1.quantity = 1;
        product1.auctionEndTime = LocalDateTime.now();
        product1.watchers = 0;
        product1.minimalPrice = new BigDecimal(50);
        product1.reservedPrice = new BigDecimal(100);
        products.add(product1);

        Product product2 = new Product();
        product2.id = 2;
        product2.title = "Product2";
        product2.thumb = "images/02.jpg";
        product2.description = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do...";
        product2.quantity = 1;
        product2.auctionEndTime = LocalDateTime.now();
        product2.watchers = 0;
        product2.minimalPrice = new BigDecimal(50);
        product2.reservedPrice = new BigDecimal(200);
        products.add(product2);

        Product product3 = new Product();
        product3.id = 3;
        product3.title = "Product3";
        product3.thumb = "images/03.jpg";
        product3.description = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do...";
        product3.quantity = 1;
        product3.auctionEndTime = LocalDateTime.now();
        product3.watchers = 0;
        product3.minimalPrice = new BigDecimal(100);
        product3.reservedPrice = new BigDecimal(200);
        products.add(product3);

        // starting auction process
        final List<Bid> bids = new ArrayList<Bid>();
        final AtomicInteger bidNumber = new AtomicInteger();
        bidNumber.set(0);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int BidId = bidNumber.incrementAndGet();
                Bid bid = new Bid();
                bid.id = BidId;
                bid.product = findProductById(1);//findProductById((new Random()).nextInt(3) + 1);
                //bid.amount = (new Random()).nextDouble(currProduct.reservedPrice) + 1;
                bid.desiredQuantity = 1;
                bid.user = findUserById((new Random()).nextInt(3)+1);
                System.out.println("try bid №" + BidId + " bid.user " + bid.user.name);
                bids.add(bid);
            }
        }, 0, 1000);

    }
}
