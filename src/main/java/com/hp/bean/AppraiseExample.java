package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppraiseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppraiseExample() {
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

        public Criteria andAppraiseNumIsNull() {
            addCriterion("APPRAISE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumIsNotNull() {
            addCriterion("APPRAISE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumEqualTo(Integer value) {
            addCriterion("APPRAISE_NUM =", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumNotEqualTo(Integer value) {
            addCriterion("APPRAISE_NUM <>", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumGreaterThan(Integer value) {
            addCriterion("APPRAISE_NUM >", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPRAISE_NUM >=", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumLessThan(Integer value) {
            addCriterion("APPRAISE_NUM <", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumLessThanOrEqualTo(Integer value) {
            addCriterion("APPRAISE_NUM <=", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumIn(List<Integer> values) {
            addCriterion("APPRAISE_NUM in", values, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumNotIn(List<Integer> values) {
            addCriterion("APPRAISE_NUM not in", values, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumBetween(Integer value1, Integer value2) {
            addCriterion("APPRAISE_NUM between", value1, value2, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("APPRAISE_NUM not between", value1, value2, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUId2IsNull() {
            addCriterion("U_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andUId2IsNotNull() {
            addCriterion("U_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andUId2EqualTo(Integer value) {
            addCriterion("U_ID2 =", value, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2NotEqualTo(Integer value) {
            addCriterion("U_ID2 <>", value, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2GreaterThan(Integer value) {
            addCriterion("U_ID2 >", value, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID2 >=", value, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2LessThan(Integer value) {
            addCriterion("U_ID2 <", value, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2LessThanOrEqualTo(Integer value) {
            addCriterion("U_ID2 <=", value, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2In(List<Integer> values) {
            addCriterion("U_ID2 in", values, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2NotIn(List<Integer> values) {
            addCriterion("U_ID2 not in", values, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2Between(Integer value1, Integer value2) {
            addCriterion("U_ID2 between", value1, value2, "uId2");
            return (Criteria) this;
        }

        public Criteria andUId2NotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID2 not between", value1, value2, "uId2");
            return (Criteria) this;
        }

        public Criteria andALeaveIsNull() {
            addCriterion("A_LEAVE is null");
            return (Criteria) this;
        }

        public Criteria andALeaveIsNotNull() {
            addCriterion("A_LEAVE is not null");
            return (Criteria) this;
        }

        public Criteria andALeaveEqualTo(Integer value) {
            addCriterion("A_LEAVE =", value, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveNotEqualTo(Integer value) {
            addCriterion("A_LEAVE <>", value, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveGreaterThan(Integer value) {
            addCriterion("A_LEAVE >", value, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("A_LEAVE >=", value, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveLessThan(Integer value) {
            addCriterion("A_LEAVE <", value, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveLessThanOrEqualTo(Integer value) {
            addCriterion("A_LEAVE <=", value, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveIn(List<Integer> values) {
            addCriterion("A_LEAVE in", values, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveNotIn(List<Integer> values) {
            addCriterion("A_LEAVE not in", values, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveBetween(Integer value1, Integer value2) {
            addCriterion("A_LEAVE between", value1, value2, "aLeave");
            return (Criteria) this;
        }

        public Criteria andALeaveNotBetween(Integer value1, Integer value2) {
            addCriterion("A_LEAVE not between", value1, value2, "aLeave");
            return (Criteria) this;
        }

        public Criteria andATextIsNull() {
            addCriterion("A_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andATextIsNotNull() {
            addCriterion("A_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andATextEqualTo(String value) {
            addCriterion("A_TEXT =", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextNotEqualTo(String value) {
            addCriterion("A_TEXT <>", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextGreaterThan(String value) {
            addCriterion("A_TEXT >", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextGreaterThanOrEqualTo(String value) {
            addCriterion("A_TEXT >=", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextLessThan(String value) {
            addCriterion("A_TEXT <", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextLessThanOrEqualTo(String value) {
            addCriterion("A_TEXT <=", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextLike(String value) {
            addCriterion("A_TEXT like", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextNotLike(String value) {
            addCriterion("A_TEXT not like", value, "aText");
            return (Criteria) this;
        }

        public Criteria andATextIn(List<String> values) {
            addCriterion("A_TEXT in", values, "aText");
            return (Criteria) this;
        }

        public Criteria andATextNotIn(List<String> values) {
            addCriterion("A_TEXT not in", values, "aText");
            return (Criteria) this;
        }

        public Criteria andATextBetween(String value1, String value2) {
            addCriterion("A_TEXT between", value1, value2, "aText");
            return (Criteria) this;
        }

        public Criteria andATextNotBetween(String value1, String value2) {
            addCriterion("A_TEXT not between", value1, value2, "aText");
            return (Criteria) this;
        }

        public Criteria andADateIsNull() {
            addCriterion("A_DATE is null");
            return (Criteria) this;
        }

        public Criteria andADateIsNotNull() {
            addCriterion("A_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andADateEqualTo(Date value) {
            addCriterion("A_DATE =", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotEqualTo(Date value) {
            addCriterion("A_DATE <>", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateGreaterThan(Date value) {
            addCriterion("A_DATE >", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateGreaterThanOrEqualTo(Date value) {
            addCriterion("A_DATE >=", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateLessThan(Date value) {
            addCriterion("A_DATE <", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateLessThanOrEqualTo(Date value) {
            addCriterion("A_DATE <=", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateIn(List<Date> values) {
            addCriterion("A_DATE in", values, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotIn(List<Date> values) {
            addCriterion("A_DATE not in", values, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateBetween(Date value1, Date value2) {
            addCriterion("A_DATE between", value1, value2, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotBetween(Date value1, Date value2) {
            addCriterion("A_DATE not between", value1, value2, "aDate");
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