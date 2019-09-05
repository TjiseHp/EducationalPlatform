package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Check_listExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Check_listExample() {
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

        public Criteria andListIdIsNull() {
            addCriterion("LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(Integer value) {
            addCriterion("LIST_ID =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(Integer value) {
            addCriterion("LIST_ID <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(Integer value) {
            addCriterion("LIST_ID >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIST_ID >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(Integer value) {
            addCriterion("LIST_ID <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(Integer value) {
            addCriterion("LIST_ID <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<Integer> values) {
            addCriterion("LIST_ID in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<Integer> values) {
            addCriterion("LIST_ID not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(Integer value1, Integer value2) {
            addCriterion("LIST_ID between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LIST_ID not between", value1, value2, "listId");
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

        public Criteria andListNameIsNull() {
            addCriterion("LIST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andListNameIsNotNull() {
            addCriterion("LIST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andListNameEqualTo(String value) {
            addCriterion("LIST_NAME =", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotEqualTo(String value) {
            addCriterion("LIST_NAME <>", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameGreaterThan(String value) {
            addCriterion("LIST_NAME >", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_NAME >=", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLessThan(String value) {
            addCriterion("LIST_NAME <", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLessThanOrEqualTo(String value) {
            addCriterion("LIST_NAME <=", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLike(String value) {
            addCriterion("LIST_NAME like", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotLike(String value) {
            addCriterion("LIST_NAME not like", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameIn(List<String> values) {
            addCriterion("LIST_NAME in", values, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotIn(List<String> values) {
            addCriterion("LIST_NAME not in", values, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameBetween(String value1, String value2) {
            addCriterion("LIST_NAME between", value1, value2, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotBetween(String value1, String value2) {
            addCriterion("LIST_NAME not between", value1, value2, "listName");
            return (Criteria) this;
        }

        public Criteria andListSTimeIsNull() {
            addCriterion("LIST_S_TIME is null");
            return (Criteria) this;
        }

        public Criteria andListSTimeIsNotNull() {
            addCriterion("LIST_S_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andListSTimeEqualTo(Date value) {
            addCriterion("LIST_S_TIME =", value, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeNotEqualTo(Date value) {
            addCriterion("LIST_S_TIME <>", value, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeGreaterThan(Date value) {
            addCriterion("LIST_S_TIME >", value, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LIST_S_TIME >=", value, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeLessThan(Date value) {
            addCriterion("LIST_S_TIME <", value, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeLessThanOrEqualTo(Date value) {
            addCriterion("LIST_S_TIME <=", value, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeIn(List<Date> values) {
            addCriterion("LIST_S_TIME in", values, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeNotIn(List<Date> values) {
            addCriterion("LIST_S_TIME not in", values, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeBetween(Date value1, Date value2) {
            addCriterion("LIST_S_TIME between", value1, value2, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListSTimeNotBetween(Date value1, Date value2) {
            addCriterion("LIST_S_TIME not between", value1, value2, "listSTime");
            return (Criteria) this;
        }

        public Criteria andListETimeIsNull() {
            addCriterion("LIST_E_TIME is null");
            return (Criteria) this;
        }

        public Criteria andListETimeIsNotNull() {
            addCriterion("LIST_E_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andListETimeEqualTo(Date value) {
            addCriterion("LIST_E_TIME =", value, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeNotEqualTo(Date value) {
            addCriterion("LIST_E_TIME <>", value, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeGreaterThan(Date value) {
            addCriterion("LIST_E_TIME >", value, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LIST_E_TIME >=", value, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeLessThan(Date value) {
            addCriterion("LIST_E_TIME <", value, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeLessThanOrEqualTo(Date value) {
            addCriterion("LIST_E_TIME <=", value, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeIn(List<Date> values) {
            addCriterion("LIST_E_TIME in", values, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeNotIn(List<Date> values) {
            addCriterion("LIST_E_TIME not in", values, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeBetween(Date value1, Date value2) {
            addCriterion("LIST_E_TIME between", value1, value2, "listETime");
            return (Criteria) this;
        }

        public Criteria andListETimeNotBetween(Date value1, Date value2) {
            addCriterion("LIST_E_TIME not between", value1, value2, "listETime");
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