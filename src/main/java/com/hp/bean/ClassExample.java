package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassNumIsNull() {
            addCriterion("CLASS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("CLASS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(Integer value) {
            addCriterion("CLASS_NUM =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(Integer value) {
            addCriterion("CLASS_NUM <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(Integer value) {
            addCriterion("CLASS_NUM >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_NUM >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(Integer value) {
            addCriterion("CLASS_NUM <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_NUM <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<Integer> values) {
            addCriterion("CLASS_NUM in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<Integer> values) {
            addCriterion("CLASS_NUM not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_NUM between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_NUM not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassKindIsNull() {
            addCriterion("CLASS_KIND is null");
            return (Criteria) this;
        }

        public Criteria andClassKindIsNotNull() {
            addCriterion("CLASS_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andClassKindEqualTo(String value) {
            addCriterion("CLASS_KIND =", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindNotEqualTo(String value) {
            addCriterion("CLASS_KIND <>", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindGreaterThan(String value) {
            addCriterion("CLASS_KIND >", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_KIND >=", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindLessThan(String value) {
            addCriterion("CLASS_KIND <", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindLessThanOrEqualTo(String value) {
            addCriterion("CLASS_KIND <=", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindLike(String value) {
            addCriterion("CLASS_KIND like", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindNotLike(String value) {
            addCriterion("CLASS_KIND not like", value, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindIn(List<String> values) {
            addCriterion("CLASS_KIND in", values, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindNotIn(List<String> values) {
            addCriterion("CLASS_KIND not in", values, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindBetween(String value1, String value2) {
            addCriterion("CLASS_KIND between", value1, value2, "classKind");
            return (Criteria) this;
        }

        public Criteria andClassKindNotBetween(String value1, String value2) {
            addCriterion("CLASS_KIND not between", value1, value2, "classKind");
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