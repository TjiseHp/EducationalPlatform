package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class ExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeExample() {
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

        public Criteria andExchangeNumIsNull() {
            addCriterion("EXCHANGE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIsNotNull() {
            addCriterion("EXCHANGE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumEqualTo(Integer value) {
            addCriterion("EXCHANGE_NUM =", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotEqualTo(Integer value) {
            addCriterion("EXCHANGE_NUM <>", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThan(Integer value) {
            addCriterion("EXCHANGE_NUM >", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGE_NUM >=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThan(Integer value) {
            addCriterion("EXCHANGE_NUM <", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGE_NUM <=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIn(List<Integer> values) {
            addCriterion("EXCHANGE_NUM in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotIn(List<Integer> values) {
            addCriterion("EXCHANGE_NUM not in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGE_NUM between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGE_NUM not between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeEIsNull() {
            addCriterion("EXCHANGE_E is null");
            return (Criteria) this;
        }

        public Criteria andExchangeEIsNotNull() {
            addCriterion("EXCHANGE_E is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeEEqualTo(Double value) {
            addCriterion("EXCHANGE_E =", value, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeENotEqualTo(Double value) {
            addCriterion("EXCHANGE_E <>", value, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeEGreaterThan(Double value) {
            addCriterion("EXCHANGE_E >", value, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeEGreaterThanOrEqualTo(Double value) {
            addCriterion("EXCHANGE_E >=", value, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeELessThan(Double value) {
            addCriterion("EXCHANGE_E <", value, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeELessThanOrEqualTo(Double value) {
            addCriterion("EXCHANGE_E <=", value, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeEIn(List<Double> values) {
            addCriterion("EXCHANGE_E in", values, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeENotIn(List<Double> values) {
            addCriterion("EXCHANGE_E not in", values, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeEBetween(Double value1, Double value2) {
            addCriterion("EXCHANGE_E between", value1, value2, "exchangeE");
            return (Criteria) this;
        }

        public Criteria andExchangeENotBetween(Double value1, Double value2) {
            addCriterion("EXCHANGE_E not between", value1, value2, "exchangeE");
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