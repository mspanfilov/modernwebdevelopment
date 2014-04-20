package com.farata.course.mwd.auction.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidExample() {
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

        public Criteria andBidIdIsNull() {
            addCriterion("BID_ID is null");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNotNull() {
            addCriterion("BID_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBidIdEqualTo(BigDecimal value) {
            addCriterion("BID_ID =", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotEqualTo(BigDecimal value) {
            addCriterion("BID_ID <>", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThan(BigDecimal value) {
            addCriterion("BID_ID >", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BID_ID >=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThan(BigDecimal value) {
            addCriterion("BID_ID <", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BID_ID <=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIn(List<BigDecimal> values) {
            addCriterion("BID_ID in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotIn(List<BigDecimal> values) {
            addCriterion("BID_ID not in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID_ID between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID_ID not between", value1, value2, "bidId");
            return (Criteria) this;
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

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Short value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Short value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Short value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Short value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Short value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Short> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Short> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Short value1, Short value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Short value1, Short value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityIsNull() {
            addCriterion("DESIRED_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityIsNotNull() {
            addCriterion("DESIRED_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityEqualTo(BigDecimal value) {
            addCriterion("DESIRED_QUANTITY =", value, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityNotEqualTo(BigDecimal value) {
            addCriterion("DESIRED_QUANTITY <>", value, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityGreaterThan(BigDecimal value) {
            addCriterion("DESIRED_QUANTITY >", value, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DESIRED_QUANTITY >=", value, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityLessThan(BigDecimal value) {
            addCriterion("DESIRED_QUANTITY <", value, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DESIRED_QUANTITY <=", value, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityIn(List<BigDecimal> values) {
            addCriterion("DESIRED_QUANTITY in", values, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityNotIn(List<BigDecimal> values) {
            addCriterion("DESIRED_QUANTITY not in", values, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESIRED_QUANTITY between", value1, value2, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andDesiredQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESIRED_QUANTITY not between", value1, value2, "desiredQuantity");
            return (Criteria) this;
        }

        public Criteria andBidderIdIsNull() {
            addCriterion("BIDDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBidderIdIsNotNull() {
            addCriterion("BIDDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBidderIdEqualTo(BigDecimal value) {
            addCriterion("BIDDER_ID =", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdNotEqualTo(BigDecimal value) {
            addCriterion("BIDDER_ID <>", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdGreaterThan(BigDecimal value) {
            addCriterion("BIDDER_ID >", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIDDER_ID >=", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdLessThan(BigDecimal value) {
            addCriterion("BIDDER_ID <", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIDDER_ID <=", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdIn(List<BigDecimal> values) {
            addCriterion("BIDDER_ID in", values, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdNotIn(List<BigDecimal> values) {
            addCriterion("BIDDER_ID not in", values, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIDDER_ID between", value1, value2, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIDDER_ID not between", value1, value2, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNull() {
            addCriterion("BID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNotNull() {
            addCriterion("BID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBidTimeEqualTo(Date value) {
            addCriterion("BID_TIME =", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotEqualTo(Date value) {
            addCriterion("BID_TIME <>", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThan(Date value) {
            addCriterion("BID_TIME >", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BID_TIME >=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThan(Date value) {
            addCriterion("BID_TIME <", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThanOrEqualTo(Date value) {
            addCriterion("BID_TIME <=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeIn(List<Date> values) {
            addCriterion("BID_TIME in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotIn(List<Date> values) {
            addCriterion("BID_TIME not in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeBetween(Date value1, Date value2) {
            addCriterion("BID_TIME between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotBetween(Date value1, Date value2) {
            addCriterion("BID_TIME not between", value1, value2, "bidTime");
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