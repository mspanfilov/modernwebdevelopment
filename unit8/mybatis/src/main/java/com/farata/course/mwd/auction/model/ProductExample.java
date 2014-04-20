package com.farata.course.mwd.auction.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(BigDecimal value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andThumbIsNull() {
            addCriterion("THUMB is null");
            return (Criteria) this;
        }

        public Criteria andThumbIsNotNull() {
            addCriterion("THUMB is not null");
            return (Criteria) this;
        }

        public Criteria andThumbEqualTo(String value) {
            addCriterion("THUMB =", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotEqualTo(String value) {
            addCriterion("THUMB <>", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThan(String value) {
            addCriterion("THUMB >", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThanOrEqualTo(String value) {
            addCriterion("THUMB >=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThan(String value) {
            addCriterion("THUMB <", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThanOrEqualTo(String value) {
            addCriterion("THUMB <=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLike(String value) {
            addCriterion("THUMB like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotLike(String value) {
            addCriterion("THUMB not like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbIn(List<String> values) {
            addCriterion("THUMB in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotIn(List<String> values) {
            addCriterion("THUMB not in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbBetween(String value1, String value2) {
            addCriterion("THUMB between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotBetween(String value1, String value2) {
            addCriterion("THUMB not between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIsNull() {
            addCriterion("AUCTION_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIsNotNull() {
            addCriterion("AUCTION_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeEqualTo(Date value) {
            addCriterion("AUCTION_END_TIME =", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotEqualTo(Date value) {
            addCriterion("AUCTION_END_TIME <>", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeGreaterThan(Date value) {
            addCriterion("AUCTION_END_TIME >", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AUCTION_END_TIME >=", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeLessThan(Date value) {
            addCriterion("AUCTION_END_TIME <", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("AUCTION_END_TIME <=", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIn(List<Date> values) {
            addCriterion("AUCTION_END_TIME in", values, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotIn(List<Date> values) {
            addCriterion("AUCTION_END_TIME not in", values, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeBetween(Date value1, Date value2) {
            addCriterion("AUCTION_END_TIME between", value1, value2, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("AUCTION_END_TIME not between", value1, value2, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchersIsNull() {
            addCriterion("WATCHERS is null");
            return (Criteria) this;
        }

        public Criteria andWatchersIsNotNull() {
            addCriterion("WATCHERS is not null");
            return (Criteria) this;
        }

        public Criteria andWatchersEqualTo(BigDecimal value) {
            addCriterion("WATCHERS =", value, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersNotEqualTo(BigDecimal value) {
            addCriterion("WATCHERS <>", value, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersGreaterThan(BigDecimal value) {
            addCriterion("WATCHERS >", value, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WATCHERS >=", value, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersLessThan(BigDecimal value) {
            addCriterion("WATCHERS <", value, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WATCHERS <=", value, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersIn(List<BigDecimal> values) {
            addCriterion("WATCHERS in", values, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersNotIn(List<BigDecimal> values) {
            addCriterion("WATCHERS not in", values, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATCHERS between", value1, value2, "watchers");
            return (Criteria) this;
        }

        public Criteria andWatchersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATCHERS not between", value1, value2, "watchers");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceIsNull() {
            addCriterion("MINIMAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceIsNotNull() {
            addCriterion("MINIMAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceEqualTo(BigDecimal value) {
            addCriterion("MINIMAL_PRICE =", value, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceNotEqualTo(BigDecimal value) {
            addCriterion("MINIMAL_PRICE <>", value, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceGreaterThan(BigDecimal value) {
            addCriterion("MINIMAL_PRICE >", value, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMAL_PRICE >=", value, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceLessThan(BigDecimal value) {
            addCriterion("MINIMAL_PRICE <", value, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMAL_PRICE <=", value, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceIn(List<BigDecimal> values) {
            addCriterion("MINIMAL_PRICE in", values, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceNotIn(List<BigDecimal> values) {
            addCriterion("MINIMAL_PRICE not in", values, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMAL_PRICE between", value1, value2, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andMinimalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMAL_PRICE not between", value1, value2, "minimalPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceIsNull() {
            addCriterion("RESERVED_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andReservedPriceIsNotNull() {
            addCriterion("RESERVED_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andReservedPriceEqualTo(BigDecimal value) {
            addCriterion("RESERVED_PRICE =", value, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceNotEqualTo(BigDecimal value) {
            addCriterion("RESERVED_PRICE <>", value, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceGreaterThan(BigDecimal value) {
            addCriterion("RESERVED_PRICE >", value, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERVED_PRICE >=", value, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceLessThan(BigDecimal value) {
            addCriterion("RESERVED_PRICE <", value, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERVED_PRICE <=", value, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceIn(List<BigDecimal> values) {
            addCriterion("RESERVED_PRICE in", values, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceNotIn(List<BigDecimal> values) {
            addCriterion("RESERVED_PRICE not in", values, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERVED_PRICE between", value1, value2, "reservedPrice");
            return (Criteria) this;
        }

        public Criteria andReservedPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERVED_PRICE not between", value1, value2, "reservedPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}