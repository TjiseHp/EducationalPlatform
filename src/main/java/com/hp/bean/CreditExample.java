package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditExample() {
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

        public Criteria andCreditNumIsNull() {
            addCriterion("CREDIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCreditNumIsNotNull() {
            addCriterion("CREDIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNumEqualTo(Integer value) {
            addCriterion("CREDIT_NUM =", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotEqualTo(Integer value) {
            addCriterion("CREDIT_NUM <>", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumGreaterThan(Integer value) {
            addCriterion("CREDIT_NUM >", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_NUM >=", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumLessThan(Integer value) {
            addCriterion("CREDIT_NUM <", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumLessThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_NUM <=", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumIn(List<Integer> values) {
            addCriterion("CREDIT_NUM in", values, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotIn(List<Integer> values) {
            addCriterion("CREDIT_NUM not in", values, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_NUM between", value1, value2, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_NUM not between", value1, value2, "creditNum");
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

        public Criteria andCreditSumIsNull() {
            addCriterion("CREDIT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andCreditSumIsNotNull() {
            addCriterion("CREDIT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andCreditSumEqualTo(Integer value) {
            addCriterion("CREDIT_SUM =", value, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumNotEqualTo(Integer value) {
            addCriterion("CREDIT_SUM <>", value, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumGreaterThan(Integer value) {
            addCriterion("CREDIT_SUM >", value, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_SUM >=", value, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumLessThan(Integer value) {
            addCriterion("CREDIT_SUM <", value, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumLessThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_SUM <=", value, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumIn(List<Integer> values) {
            addCriterion("CREDIT_SUM in", values, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumNotIn(List<Integer> values) {
            addCriterion("CREDIT_SUM not in", values, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_SUM between", value1, value2, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditSumNotBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_SUM not between", value1, value2, "creditSum");
            return (Criteria) this;
        }

        public Criteria andCreditTextIsNull() {
            addCriterion("CREDIT_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andCreditTextIsNotNull() {
            addCriterion("CREDIT_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTextEqualTo(String value) {
            addCriterion("CREDIT_TEXT =", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextNotEqualTo(String value) {
            addCriterion("CREDIT_TEXT <>", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextGreaterThan(String value) {
            addCriterion("CREDIT_TEXT >", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_TEXT >=", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextLessThan(String value) {
            addCriterion("CREDIT_TEXT <", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_TEXT <=", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextLike(String value) {
            addCriterion("CREDIT_TEXT like", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextNotLike(String value) {
            addCriterion("CREDIT_TEXT not like", value, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextIn(List<String> values) {
            addCriterion("CREDIT_TEXT in", values, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextNotIn(List<String> values) {
            addCriterion("CREDIT_TEXT not in", values, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextBetween(String value1, String value2) {
            addCriterion("CREDIT_TEXT between", value1, value2, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditTextNotBetween(String value1, String value2) {
            addCriterion("CREDIT_TEXT not between", value1, value2, "creditText");
            return (Criteria) this;
        }

        public Criteria andCreditDateIsNull() {
            addCriterion("CREDIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreditDateIsNotNull() {
            addCriterion("CREDIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditDateEqualTo(Date value) {
            addCriterion("CREDIT_DATE =", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotEqualTo(Date value) {
            addCriterion("CREDIT_DATE <>", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateGreaterThan(Date value) {
            addCriterion("CREDIT_DATE >", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREDIT_DATE >=", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateLessThan(Date value) {
            addCriterion("CREDIT_DATE <", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateLessThanOrEqualTo(Date value) {
            addCriterion("CREDIT_DATE <=", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateIn(List<Date> values) {
            addCriterion("CREDIT_DATE in", values, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotIn(List<Date> values) {
            addCriterion("CREDIT_DATE not in", values, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateBetween(Date value1, Date value2) {
            addCriterion("CREDIT_DATE between", value1, value2, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotBetween(Date value1, Date value2) {
            addCriterion("CREDIT_DATE not between", value1, value2, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditPresonIsNull() {
            addCriterion("CREDIT_PRESON is null");
            return (Criteria) this;
        }

        public Criteria andCreditPresonIsNotNull() {
            addCriterion("CREDIT_PRESON is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPresonEqualTo(String value) {
            addCriterion("CREDIT_PRESON =", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonNotEqualTo(String value) {
            addCriterion("CREDIT_PRESON <>", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonGreaterThan(String value) {
            addCriterion("CREDIT_PRESON >", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_PRESON >=", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonLessThan(String value) {
            addCriterion("CREDIT_PRESON <", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_PRESON <=", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonLike(String value) {
            addCriterion("CREDIT_PRESON like", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonNotLike(String value) {
            addCriterion("CREDIT_PRESON not like", value, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonIn(List<String> values) {
            addCriterion("CREDIT_PRESON in", values, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonNotIn(List<String> values) {
            addCriterion("CREDIT_PRESON not in", values, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonBetween(String value1, String value2) {
            addCriterion("CREDIT_PRESON between", value1, value2, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditPresonNotBetween(String value1, String value2) {
            addCriterion("CREDIT_PRESON not between", value1, value2, "creditPreson");
            return (Criteria) this;
        }

        public Criteria andCreditText2IsNull() {
            addCriterion("CREDIT_TEXT2 is null");
            return (Criteria) this;
        }

        public Criteria andCreditText2IsNotNull() {
            addCriterion("CREDIT_TEXT2 is not null");
            return (Criteria) this;
        }

        public Criteria andCreditText2EqualTo(String value) {
            addCriterion("CREDIT_TEXT2 =", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2NotEqualTo(String value) {
            addCriterion("CREDIT_TEXT2 <>", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2GreaterThan(String value) {
            addCriterion("CREDIT_TEXT2 >", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2GreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_TEXT2 >=", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2LessThan(String value) {
            addCriterion("CREDIT_TEXT2 <", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2LessThanOrEqualTo(String value) {
            addCriterion("CREDIT_TEXT2 <=", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2Like(String value) {
            addCriterion("CREDIT_TEXT2 like", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2NotLike(String value) {
            addCriterion("CREDIT_TEXT2 not like", value, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2In(List<String> values) {
            addCriterion("CREDIT_TEXT2 in", values, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2NotIn(List<String> values) {
            addCriterion("CREDIT_TEXT2 not in", values, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2Between(String value1, String value2) {
            addCriterion("CREDIT_TEXT2 between", value1, value2, "creditText2");
            return (Criteria) this;
        }

        public Criteria andCreditText2NotBetween(String value1, String value2) {
            addCriterion("CREDIT_TEXT2 not between", value1, value2, "creditText2");
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