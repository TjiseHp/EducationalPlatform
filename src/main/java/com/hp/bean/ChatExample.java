package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatExample() {
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

        public Criteria andChatNumIsNull() {
            addCriterion("CHAT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andChatNumIsNotNull() {
            addCriterion("CHAT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andChatNumEqualTo(Integer value) {
            addCriterion("CHAT_NUM =", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumNotEqualTo(Integer value) {
            addCriterion("CHAT_NUM <>", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumGreaterThan(Integer value) {
            addCriterion("CHAT_NUM >", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAT_NUM >=", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumLessThan(Integer value) {
            addCriterion("CHAT_NUM <", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumLessThanOrEqualTo(Integer value) {
            addCriterion("CHAT_NUM <=", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumIn(List<Integer> values) {
            addCriterion("CHAT_NUM in", values, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumNotIn(List<Integer> values) {
            addCriterion("CHAT_NUM not in", values, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumBetween(Integer value1, Integer value2) {
            addCriterion("CHAT_NUM between", value1, value2, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAT_NUM not between", value1, value2, "chatNum");
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

        public Criteria andCSNumIsNull() {
            addCriterion("C_S_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCSNumIsNotNull() {
            addCriterion("C_S_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCSNumEqualTo(Integer value) {
            addCriterion("C_S_NUM =", value, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumNotEqualTo(Integer value) {
            addCriterion("C_S_NUM <>", value, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumGreaterThan(Integer value) {
            addCriterion("C_S_NUM >", value, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_S_NUM >=", value, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumLessThan(Integer value) {
            addCriterion("C_S_NUM <", value, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumLessThanOrEqualTo(Integer value) {
            addCriterion("C_S_NUM <=", value, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumIn(List<Integer> values) {
            addCriterion("C_S_NUM in", values, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumNotIn(List<Integer> values) {
            addCriterion("C_S_NUM not in", values, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumBetween(Integer value1, Integer value2) {
            addCriterion("C_S_NUM between", value1, value2, "cSNum");
            return (Criteria) this;
        }

        public Criteria andCSNumNotBetween(Integer value1, Integer value2) {
            addCriterion("C_S_NUM not between", value1, value2, "cSNum");
            return (Criteria) this;
        }

        public Criteria andChatTextIsNull() {
            addCriterion("CHAT_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andChatTextIsNotNull() {
            addCriterion("CHAT_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andChatTextEqualTo(String value) {
            addCriterion("CHAT_TEXT =", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotEqualTo(String value) {
            addCriterion("CHAT_TEXT <>", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextGreaterThan(String value) {
            addCriterion("CHAT_TEXT >", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextGreaterThanOrEqualTo(String value) {
            addCriterion("CHAT_TEXT >=", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextLessThan(String value) {
            addCriterion("CHAT_TEXT <", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextLessThanOrEqualTo(String value) {
            addCriterion("CHAT_TEXT <=", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextLike(String value) {
            addCriterion("CHAT_TEXT like", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotLike(String value) {
            addCriterion("CHAT_TEXT not like", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextIn(List<String> values) {
            addCriterion("CHAT_TEXT in", values, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotIn(List<String> values) {
            addCriterion("CHAT_TEXT not in", values, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextBetween(String value1, String value2) {
            addCriterion("CHAT_TEXT between", value1, value2, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotBetween(String value1, String value2) {
            addCriterion("CHAT_TEXT not between", value1, value2, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatDateIsNull() {
            addCriterion("CHAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChatDateIsNotNull() {
            addCriterion("CHAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChatDateEqualTo(Date value) {
            addCriterion("CHAT_DATE =", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotEqualTo(Date value) {
            addCriterion("CHAT_DATE <>", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateGreaterThan(Date value) {
            addCriterion("CHAT_DATE >", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHAT_DATE >=", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateLessThan(Date value) {
            addCriterion("CHAT_DATE <", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateLessThanOrEqualTo(Date value) {
            addCriterion("CHAT_DATE <=", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateIn(List<Date> values) {
            addCriterion("CHAT_DATE in", values, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotIn(List<Date> values) {
            addCriterion("CHAT_DATE not in", values, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateBetween(Date value1, Date value2) {
            addCriterion("CHAT_DATE between", value1, value2, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotBetween(Date value1, Date value2) {
            addCriterion("CHAT_DATE not between", value1, value2, "chatDate");
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