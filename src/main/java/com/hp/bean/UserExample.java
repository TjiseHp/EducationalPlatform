package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andGNumIsNull() {
            addCriterion("G_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGNumIsNotNull() {
            addCriterion("G_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGNumEqualTo(Integer value) {
            addCriterion("G_NUM =", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumNotEqualTo(Integer value) {
            addCriterion("G_NUM <>", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumGreaterThan(Integer value) {
            addCriterion("G_NUM >", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("G_NUM >=", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumLessThan(Integer value) {
            addCriterion("G_NUM <", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumLessThanOrEqualTo(Integer value) {
            addCriterion("G_NUM <=", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumIn(List<Integer> values) {
            addCriterion("G_NUM in", values, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumNotIn(List<Integer> values) {
            addCriterion("G_NUM not in", values, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumBetween(Integer value1, Integer value2) {
            addCriterion("G_NUM between", value1, value2, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumNotBetween(Integer value1, Integer value2) {
            addCriterion("G_NUM not between", value1, value2, "gNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumIsNull() {
            addCriterion("CHECK_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCheckNumIsNotNull() {
            addCriterion("CHECK_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNumEqualTo(Integer value) {
            addCriterion("CHECK_NUM =", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotEqualTo(Integer value) {
            addCriterion("CHECK_NUM <>", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumGreaterThan(Integer value) {
            addCriterion("CHECK_NUM >", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_NUM >=", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumLessThan(Integer value) {
            addCriterion("CHECK_NUM <", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_NUM <=", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumIn(List<Integer> values) {
            addCriterion("CHECK_NUM in", values, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotIn(List<Integer> values) {
            addCriterion("CHECK_NUM not in", values, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_NUM between", value1, value2, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_NUM not between", value1, value2, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNull() {
            addCriterion("C_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNotNull() {
            addCriterion("C_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCStatusEqualTo(Integer value) {
            addCriterion("C_STATUS =", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotEqualTo(Integer value) {
            addCriterion("C_STATUS <>", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThan(Integer value) {
            addCriterion("C_STATUS >", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_STATUS >=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThan(Integer value) {
            addCriterion("C_STATUS <", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThanOrEqualTo(Integer value) {
            addCriterion("C_STATUS <=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusIn(List<Integer> values) {
            addCriterion("C_STATUS in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotIn(List<Integer> values) {
            addCriterion("C_STATUS not in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusBetween(Integer value1, Integer value2) {
            addCriterion("C_STATUS between", value1, value2, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("C_STATUS not between", value1, value2, "cStatus");
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

        public Criteria andUExpIsNull() {
            addCriterion("U_EXP is null");
            return (Criteria) this;
        }

        public Criteria andUExpIsNotNull() {
            addCriterion("U_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andUExpEqualTo(Integer value) {
            addCriterion("U_EXP =", value, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpNotEqualTo(Integer value) {
            addCriterion("U_EXP <>", value, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpGreaterThan(Integer value) {
            addCriterion("U_EXP >", value, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_EXP >=", value, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpLessThan(Integer value) {
            addCriterion("U_EXP <", value, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpLessThanOrEqualTo(Integer value) {
            addCriterion("U_EXP <=", value, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpIn(List<Integer> values) {
            addCriterion("U_EXP in", values, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpNotIn(List<Integer> values) {
            addCriterion("U_EXP not in", values, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpBetween(Integer value1, Integer value2) {
            addCriterion("U_EXP between", value1, value2, "uExp");
            return (Criteria) this;
        }

        public Criteria andUExpNotBetween(Integer value1, Integer value2) {
            addCriterion("U_EXP not between", value1, value2, "uExp");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("U_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_NAME =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_NAME <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_NAME >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NAME >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_NAME <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_NAME <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_NAME like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_NAME not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_NAME in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_NAME not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_NAME between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_NAME not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Integer value) {
            addCriterion("U_SEX =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Integer value) {
            addCriterion("U_SEX <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Integer value) {
            addCriterion("U_SEX >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_SEX >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Integer value) {
            addCriterion("U_SEX <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Integer value) {
            addCriterion("U_SEX <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Integer> values) {
            addCriterion("U_SEX in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Integer> values) {
            addCriterion("U_SEX not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Integer value1, Integer value2) {
            addCriterion("U_SEX between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Integer value1, Integer value2) {
            addCriterion("U_SEX not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("U_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("U_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(Integer value) {
            addCriterion("U_PHONE =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(Integer value) {
            addCriterion("U_PHONE <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(Integer value) {
            addCriterion("U_PHONE >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_PHONE >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(Integer value) {
            addCriterion("U_PHONE <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("U_PHONE <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<Integer> values) {
            addCriterion("U_PHONE in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<Integer> values) {
            addCriterion("U_PHONE not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(Integer value1, Integer value2) {
            addCriterion("U_PHONE between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("U_PHONE not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("U_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("U_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("U_EMAIL =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("U_EMAIL <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("U_EMAIL >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("U_EMAIL >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("U_EMAIL <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("U_EMAIL <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("U_EMAIL like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("U_EMAIL not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("U_EMAIL in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("U_EMAIL not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("U_EMAIL between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("U_EMAIL not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUAccIsNull() {
            addCriterion("U_ACC is null");
            return (Criteria) this;
        }

        public Criteria andUAccIsNotNull() {
            addCriterion("U_ACC is not null");
            return (Criteria) this;
        }

        public Criteria andUAccEqualTo(String value) {
            addCriterion("U_ACC =", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccNotEqualTo(String value) {
            addCriterion("U_ACC <>", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccGreaterThan(String value) {
            addCriterion("U_ACC >", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccGreaterThanOrEqualTo(String value) {
            addCriterion("U_ACC >=", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccLessThan(String value) {
            addCriterion("U_ACC <", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccLessThanOrEqualTo(String value) {
            addCriterion("U_ACC <=", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccLike(String value) {
            addCriterion("U_ACC like", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccNotLike(String value) {
            addCriterion("U_ACC not like", value, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccIn(List<String> values) {
            addCriterion("U_ACC in", values, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccNotIn(List<String> values) {
            addCriterion("U_ACC not in", values, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccBetween(String value1, String value2) {
            addCriterion("U_ACC between", value1, value2, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUAccNotBetween(String value1, String value2) {
            addCriterion("U_ACC not between", value1, value2, "uAcc");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("U_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("U_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("U_PWD =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("U_PWD <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("U_PWD >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("U_PWD >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("U_PWD <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("U_PWD <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("U_PWD like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("U_PWD not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("U_PWD in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("U_PWD not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("U_PWD between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("U_PWD not between", value1, value2, "uPwd");
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