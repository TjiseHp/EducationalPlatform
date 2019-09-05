package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitExample() {
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

        public Criteria andRecruitNumIsNull() {
            addCriterion("RECRUIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIsNotNull() {
            addCriterion("RECRUIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumEqualTo(Integer value) {
            addCriterion("RECRUIT_NUM =", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotEqualTo(Integer value) {
            addCriterion("RECRUIT_NUM <>", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThan(Integer value) {
            addCriterion("RECRUIT_NUM >", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECRUIT_NUM >=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThan(Integer value) {
            addCriterion("RECRUIT_NUM <", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThanOrEqualTo(Integer value) {
            addCriterion("RECRUIT_NUM <=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIn(List<Integer> values) {
            addCriterion("RECRUIT_NUM in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotIn(List<Integer> values) {
            addCriterion("RECRUIT_NUM not in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumBetween(Integer value1, Integer value2) {
            addCriterion("RECRUIT_NUM between", value1, value2, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("RECRUIT_NUM not between", value1, value2, "recruitNum");
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

        public Criteria andCNumIsNull() {
            addCriterion("C_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCNumIsNotNull() {
            addCriterion("C_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCNumEqualTo(Integer value) {
            addCriterion("C_NUM =", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotEqualTo(Integer value) {
            addCriterion("C_NUM <>", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThan(Integer value) {
            addCriterion("C_NUM >", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_NUM >=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThan(Integer value) {
            addCriterion("C_NUM <", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThanOrEqualTo(Integer value) {
            addCriterion("C_NUM <=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumIn(List<Integer> values) {
            addCriterion("C_NUM in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotIn(List<Integer> values) {
            addCriterion("C_NUM not in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumBetween(Integer value1, Integer value2) {
            addCriterion("C_NUM between", value1, value2, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotBetween(Integer value1, Integer value2) {
            addCriterion("C_NUM not between", value1, value2, "cNum");
            return (Criteria) this;
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

        public Criteria andRecruitSTimeIsNull() {
            addCriterion("RECRUIT_S_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeIsNotNull() {
            addCriterion("RECRUIT_S_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeEqualTo(Date value) {
            addCriterion("RECRUIT_S_TIME =", value, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeNotEqualTo(Date value) {
            addCriterion("RECRUIT_S_TIME <>", value, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeGreaterThan(Date value) {
            addCriterion("RECRUIT_S_TIME >", value, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECRUIT_S_TIME >=", value, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeLessThan(Date value) {
            addCriterion("RECRUIT_S_TIME <", value, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECRUIT_S_TIME <=", value, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeIn(List<Date> values) {
            addCriterion("RECRUIT_S_TIME in", values, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeNotIn(List<Date> values) {
            addCriterion("RECRUIT_S_TIME not in", values, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeBetween(Date value1, Date value2) {
            addCriterion("RECRUIT_S_TIME between", value1, value2, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitSTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECRUIT_S_TIME not between", value1, value2, "recruitSTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateIsNull() {
            addCriterion("RECRUIT_E_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateIsNotNull() {
            addCriterion("RECRUIT_E_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateEqualTo(Date value) {
            addCriterion("RECRUIT_E_DATE =", value, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateNotEqualTo(Date value) {
            addCriterion("RECRUIT_E_DATE <>", value, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateGreaterThan(Date value) {
            addCriterion("RECRUIT_E_DATE >", value, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RECRUIT_E_DATE >=", value, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateLessThan(Date value) {
            addCriterion("RECRUIT_E_DATE <", value, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateLessThanOrEqualTo(Date value) {
            addCriterion("RECRUIT_E_DATE <=", value, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateIn(List<Date> values) {
            addCriterion("RECRUIT_E_DATE in", values, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateNotIn(List<Date> values) {
            addCriterion("RECRUIT_E_DATE not in", values, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateBetween(Date value1, Date value2) {
            addCriterion("RECRUIT_E_DATE between", value1, value2, "recruitEDate");
            return (Criteria) this;
        }

        public Criteria andRecruitEDateNotBetween(Date value1, Date value2) {
            addCriterion("RECRUIT_E_DATE not between", value1, value2, "recruitEDate");
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