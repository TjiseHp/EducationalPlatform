package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRoNoIsNull() {
            addCriterion("RO_NO is null");
            return (Criteria) this;
        }

        public Criteria andRoNoIsNotNull() {
            addCriterion("RO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRoNoEqualTo(Integer value) {
            addCriterion("RO_NO =", value, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoNotEqualTo(Integer value) {
            addCriterion("RO_NO <>", value, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoGreaterThan(Integer value) {
            addCriterion("RO_NO >", value, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("RO_NO >=", value, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoLessThan(Integer value) {
            addCriterion("RO_NO <", value, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoLessThanOrEqualTo(Integer value) {
            addCriterion("RO_NO <=", value, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoIn(List<Integer> values) {
            addCriterion("RO_NO in", values, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoNotIn(List<Integer> values) {
            addCriterion("RO_NO not in", values, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoBetween(Integer value1, Integer value2) {
            addCriterion("RO_NO between", value1, value2, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNoNotBetween(Integer value1, Integer value2) {
            addCriterion("RO_NO not between", value1, value2, "roNo");
            return (Criteria) this;
        }

        public Criteria andRoNameIsNull() {
            addCriterion("RO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoNameIsNotNull() {
            addCriterion("RO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoNameEqualTo(String value) {
            addCriterion("RO_NAME =", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameNotEqualTo(String value) {
            addCriterion("RO_NAME <>", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameGreaterThan(String value) {
            addCriterion("RO_NAME >", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameGreaterThanOrEqualTo(String value) {
            addCriterion("RO_NAME >=", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameLessThan(String value) {
            addCriterion("RO_NAME <", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameLessThanOrEqualTo(String value) {
            addCriterion("RO_NAME <=", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameLike(String value) {
            addCriterion("RO_NAME like", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameNotLike(String value) {
            addCriterion("RO_NAME not like", value, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameIn(List<String> values) {
            addCriterion("RO_NAME in", values, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameNotIn(List<String> values) {
            addCriterion("RO_NAME not in", values, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameBetween(String value1, String value2) {
            addCriterion("RO_NAME between", value1, value2, "roName");
            return (Criteria) this;
        }

        public Criteria andRoNameNotBetween(String value1, String value2) {
            addCriterion("RO_NAME not between", value1, value2, "roName");
            return (Criteria) this;
        }

        public Criteria andRoTextIsNull() {
            addCriterion("RO_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andRoTextIsNotNull() {
            addCriterion("RO_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andRoTextEqualTo(String value) {
            addCriterion("RO_TEXT =", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextNotEqualTo(String value) {
            addCriterion("RO_TEXT <>", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextGreaterThan(String value) {
            addCriterion("RO_TEXT >", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextGreaterThanOrEqualTo(String value) {
            addCriterion("RO_TEXT >=", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextLessThan(String value) {
            addCriterion("RO_TEXT <", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextLessThanOrEqualTo(String value) {
            addCriterion("RO_TEXT <=", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextLike(String value) {
            addCriterion("RO_TEXT like", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextNotLike(String value) {
            addCriterion("RO_TEXT not like", value, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextIn(List<String> values) {
            addCriterion("RO_TEXT in", values, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextNotIn(List<String> values) {
            addCriterion("RO_TEXT not in", values, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextBetween(String value1, String value2) {
            addCriterion("RO_TEXT between", value1, value2, "roText");
            return (Criteria) this;
        }

        public Criteria andRoTextNotBetween(String value1, String value2) {
            addCriterion("RO_TEXT not between", value1, value2, "roText");
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