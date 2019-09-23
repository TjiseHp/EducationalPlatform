package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoIsNull() {
            addCriterion("MENU_UPPER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoIsNotNull() {
            addCriterion("MENU_UPPER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoEqualTo(Integer value) {
            addCriterion("MENU_UPPER_NO =", value, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoNotEqualTo(Integer value) {
            addCriterion("MENU_UPPER_NO <>", value, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoGreaterThan(Integer value) {
            addCriterion("MENU_UPPER_NO >", value, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_UPPER_NO >=", value, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoLessThan(Integer value) {
            addCriterion("MENU_UPPER_NO <", value, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_UPPER_NO <=", value, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoIn(List<Integer> values) {
            addCriterion("MENU_UPPER_NO in", values, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoNotIn(List<Integer> values) {
            addCriterion("MENU_UPPER_NO not in", values, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoBetween(Integer value1, Integer value2) {
            addCriterion("MENU_UPPER_NO between", value1, value2, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuUpperNoNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_UPPER_NO not between", value1, value2, "menuUpperNo");
            return (Criteria) this;
        }

        public Criteria andMenuImgIsNull() {
            addCriterion("MENU_IMG is null");
            return (Criteria) this;
        }

        public Criteria andMenuImgIsNotNull() {
            addCriterion("MENU_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andMenuImgEqualTo(String value) {
            addCriterion("MENU_IMG =", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgNotEqualTo(String value) {
            addCriterion("MENU_IMG <>", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgGreaterThan(String value) {
            addCriterion("MENU_IMG >", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_IMG >=", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgLessThan(String value) {
            addCriterion("MENU_IMG <", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgLessThanOrEqualTo(String value) {
            addCriterion("MENU_IMG <=", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgLike(String value) {
            addCriterion("MENU_IMG like", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgNotLike(String value) {
            addCriterion("MENU_IMG not like", value, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgIn(List<String> values) {
            addCriterion("MENU_IMG in", values, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgNotIn(List<String> values) {
            addCriterion("MENU_IMG not in", values, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgBetween(String value1, String value2) {
            addCriterion("MENU_IMG between", value1, value2, "menuImg");
            return (Criteria) this;
        }

        public Criteria andMenuImgNotBetween(String value1, String value2) {
            addCriterion("MENU_IMG not between", value1, value2, "menuImg");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
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