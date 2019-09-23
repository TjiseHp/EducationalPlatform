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

        public Criteria andPowerNoIsNull() {
            addCriterion("POWER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPowerNoIsNotNull() {
            addCriterion("POWER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNoEqualTo(Integer value) {
            addCriterion("POWER_NO =", value, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoNotEqualTo(Integer value) {
            addCriterion("POWER_NO <>", value, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoGreaterThan(Integer value) {
            addCriterion("POWER_NO >", value, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("POWER_NO >=", value, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoLessThan(Integer value) {
            addCriterion("POWER_NO <", value, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoLessThanOrEqualTo(Integer value) {
            addCriterion("POWER_NO <=", value, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoIn(List<Integer> values) {
            addCriterion("POWER_NO in", values, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoNotIn(List<Integer> values) {
            addCriterion("POWER_NO not in", values, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoBetween(Integer value1, Integer value2) {
            addCriterion("POWER_NO between", value1, value2, "powerNo");
            return (Criteria) this;
        }

        public Criteria andPowerNoNotBetween(Integer value1, Integer value2) {
            addCriterion("POWER_NO not between", value1, value2, "powerNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoIsNull() {
            addCriterion("MENU_NO is null");
            return (Criteria) this;
        }

        public Criteria andMenuNoIsNotNull() {
            addCriterion("MENU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNoEqualTo(Integer value) {
            addCriterion("MENU_NO =", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoNotEqualTo(Integer value) {
            addCriterion("MENU_NO <>", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoGreaterThan(Integer value) {
            addCriterion("MENU_NO >", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_NO >=", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoLessThan(Integer value) {
            addCriterion("MENU_NO <", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_NO <=", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoIn(List<Integer> values) {
            addCriterion("MENU_NO in", values, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoNotIn(List<Integer> values) {
            addCriterion("MENU_NO not in", values, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoBetween(Integer value1, Integer value2) {
            addCriterion("MENU_NO between", value1, value2, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_NO not between", value1, value2, "menuNo");
            return (Criteria) this;
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