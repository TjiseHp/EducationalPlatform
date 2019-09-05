package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class MainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MainExample() {
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

        public Criteria andMNameIsNull() {
            addCriterion("M_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("M_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("M_NAME =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("M_NAME <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("M_NAME >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("M_NAME >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("M_NAME <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("M_NAME <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("M_NAME like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("M_NAME not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("M_NAME in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("M_NAME not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("M_NAME between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("M_NAME not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMUrlIsNull() {
            addCriterion("M_URL is null");
            return (Criteria) this;
        }

        public Criteria andMUrlIsNotNull() {
            addCriterion("M_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMUrlEqualTo(String value) {
            addCriterion("M_URL =", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotEqualTo(String value) {
            addCriterion("M_URL <>", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlGreaterThan(String value) {
            addCriterion("M_URL >", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlGreaterThanOrEqualTo(String value) {
            addCriterion("M_URL >=", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLessThan(String value) {
            addCriterion("M_URL <", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLessThanOrEqualTo(String value) {
            addCriterion("M_URL <=", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLike(String value) {
            addCriterion("M_URL like", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotLike(String value) {
            addCriterion("M_URL not like", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlIn(List<String> values) {
            addCriterion("M_URL in", values, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotIn(List<String> values) {
            addCriterion("M_URL not in", values, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlBetween(String value1, String value2) {
            addCriterion("M_URL between", value1, value2, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotBetween(String value1, String value2) {
            addCriterion("M_URL not between", value1, value2, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMImageIsNull() {
            addCriterion("M_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andMImageIsNotNull() {
            addCriterion("M_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMImageEqualTo(String value) {
            addCriterion("M_IMAGE =", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageNotEqualTo(String value) {
            addCriterion("M_IMAGE <>", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageGreaterThan(String value) {
            addCriterion("M_IMAGE >", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageGreaterThanOrEqualTo(String value) {
            addCriterion("M_IMAGE >=", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageLessThan(String value) {
            addCriterion("M_IMAGE <", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageLessThanOrEqualTo(String value) {
            addCriterion("M_IMAGE <=", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageLike(String value) {
            addCriterion("M_IMAGE like", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageNotLike(String value) {
            addCriterion("M_IMAGE not like", value, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageIn(List<String> values) {
            addCriterion("M_IMAGE in", values, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageNotIn(List<String> values) {
            addCriterion("M_IMAGE not in", values, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageBetween(String value1, String value2) {
            addCriterion("M_IMAGE between", value1, value2, "mImage");
            return (Criteria) this;
        }

        public Criteria andMImageNotBetween(String value1, String value2) {
            addCriterion("M_IMAGE not between", value1, value2, "mImage");
            return (Criteria) this;
        }

        public Criteria andMFatherIsNull() {
            addCriterion("M_FATHER is null");
            return (Criteria) this;
        }

        public Criteria andMFatherIsNotNull() {
            addCriterion("M_FATHER is not null");
            return (Criteria) this;
        }

        public Criteria andMFatherEqualTo(Integer value) {
            addCriterion("M_FATHER =", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherNotEqualTo(Integer value) {
            addCriterion("M_FATHER <>", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherGreaterThan(Integer value) {
            addCriterion("M_FATHER >", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_FATHER >=", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherLessThan(Integer value) {
            addCriterion("M_FATHER <", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherLessThanOrEqualTo(Integer value) {
            addCriterion("M_FATHER <=", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherIn(List<Integer> values) {
            addCriterion("M_FATHER in", values, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherNotIn(List<Integer> values) {
            addCriterion("M_FATHER not in", values, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherBetween(Integer value1, Integer value2) {
            addCriterion("M_FATHER between", value1, value2, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherNotBetween(Integer value1, Integer value2) {
            addCriterion("M_FATHER not between", value1, value2, "mFather");
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