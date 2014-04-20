CREATE TABLE AUCTION_USER(USER_ID INTEGER NOT NULL PRIMARY KEY,
              USER_NAME VARCHAR(50),
              EMAIL VARCHAR(100),
              GET_OVERBID_NOTIFICATIONS INTEGER);
              
CREATE TABLE PRODUCT(PRODUCT_ID INTEGER NOT NULL PRIMARY KEY,
              TITLE VARCHAR(100) NOT NULL,
              THUMB VARCHAR(100),
              DESCRIPTION VARCHAR(400),
              QUANTITY INTEGER NOT NULL,
              AUCTION_END_TIME DATE NOT NULL,
              WATCHERS INTEGER,
              MINIMAL_PRICE NUMBER(8,2) NOT NULL,
              RESERVED_PRICE NUMBER(8,2) NOT NULL
              );
              
CREATE TABLE BID (BID_ID INTEGER NOT NULL PRIMARY KEY,
                  PRODUCT_ID INTEGER NOT NULL,
                  AMOUNT NUMBER NOT NULL,
                  DESIRED_QUANTITY INTEGER,
                  BIDDER_ID INTEGER NOT NULL,
                  BID_TIME DATE NOT NULL,
                  FOREIGN KEY (PRODUCT_ID)
                       REFERENCES PRODUCT(PRODUCT_ID)
                       ON DELETE CASCADE,
                       
                  FOREIGN KEY (BIDDER_ID)
                        REFERENCES AUCTION_USER(USER_ID)
                        ON DELETE CASCADE
                );
commit;