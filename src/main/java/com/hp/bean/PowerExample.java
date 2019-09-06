package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerExample() {
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

        public Criteria andPNumIsNull() {
            addCriterion("P_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPNumIsNotNull() {
            addCriterion("P_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPNumEqualTo(Integer value) {
            addCriterion("P_NUM =", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumNotEqualTo(Integer value) {
            addCriterion("P_NUM <>", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumGreaterThan(Integer value) {
            addCriterion("P_NUM >", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_NUM >=", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumLessThan(Integer value) {
            addCriterion("P_NUM <", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumLessThanOrEqualTo(Integer value) {
            addCriterion("P_NUM <=", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumIn(List<Integer> values) {
            addCriterion("P_NUM in", values, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumNotIn(List<Integer> values) {
            addCriterion("P_NUM not in", values, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumBetween(Integer value1, Integer value2) {
            addCriterion("P_NUM between", value1, value2, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumNotBetween(Integer value1, Integer value2) {
            addCriterion("P_NUM not between", value1, value2, "pNum");
            return (Criteria) this;
        }

        public Criteria andMNumIsNull() {
            addCriterion("M_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMNumIsNotNull() {
            addCriterion("M_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMNumEqualTo(Integer value) {
            addCriterion("M_NUM =", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumNotEqualTo(Integer value) {
            addCriterion("M_NUM <>", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumGreaterThan(Integer value) {
            addCriterion("M_NUM >", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_NUM >=", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumLessThan(Integer value) {
            addCriterion("M_NUM <", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumLessThanOrEqualTo(Integer value) {
            addCriterion("M_NUM <=", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumIn(List<Integer> values) {
            addCriterion("M_NUM in", values, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumNotIn(List<Integer> values) {
            addCriterion("M_NUM not in", values, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumBetween(Integer value1, Integer value2) {
            addCriterion("M_NUM between", value1, value2, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumNotBetween(Integer value1, Integer value2) {
            addCriterion("M_NUM not between", value1, value2, "mNum");
            return (Criteria) this;
        }

        public Criteria andRNumIsNull() {
            addCriterion("R_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRNumIsNotNull() {
            addCriterion("R_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRNumEqualTo(Integer value) {
            addCriterion("R_NUM =", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotEqualTo(Integer value) {
            addCriterion("R_NUM <>", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumGreaterThan(Integer value) {
            addCriterion("R_NUM >", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_NUM >=", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumLessThan(Integer value) {
            addCriterion("R_NUM <", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumLessThanOrEqualTo(Integer value) {
            addCriterion("R_NUM <=", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumIn(List<Integer> values) {
            addCriterion("R_NUM in", values, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotIn(List<Integer> values) {
            addCriterion("R_NUM not in", values, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumBetween(Integer value1, Integer value2) {
            addCriterion("R_NUM between", value1, value2, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotBetween(Integer value1, Integer value2) {
            addCriterion("R_NUM not between", value1, value2, "rNum");
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