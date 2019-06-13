package com.newer.medicine.domain;

import java.util.ArrayList;
import java.util.List;

public class ErpBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpBankExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("BANK_ID like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("BANK_ID not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNull() {
            addCriterion("BANK_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNotNull() {
            addCriterion("BANK_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumberEqualTo(String value) {
            addCriterion("BANK_NUMBER =", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotEqualTo(String value) {
            addCriterion("BANK_NUMBER <>", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThan(String value) {
            addCriterion("BANK_NUMBER >", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NUMBER >=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThan(String value) {
            addCriterion("BANK_NUMBER <", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThanOrEqualTo(String value) {
            addCriterion("BANK_NUMBER <=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLike(String value) {
            addCriterion("BANK_NUMBER like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotLike(String value) {
            addCriterion("BANK_NUMBER not like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberIn(List<String> values) {
            addCriterion("BANK_NUMBER in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotIn(List<String> values) {
            addCriterion("BANK_NUMBER not in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberBetween(String value1, String value2) {
            addCriterion("BANK_NUMBER between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotBetween(String value1, String value2) {
            addCriterion("BANK_NUMBER not between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankTimeIsNull() {
            addCriterion("BANK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBankTimeIsNotNull() {
            addCriterion("BANK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBankTimeEqualTo(String value) {
            addCriterion("BANK_TIME =", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeNotEqualTo(String value) {
            addCriterion("BANK_TIME <>", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeGreaterThan(String value) {
            addCriterion("BANK_TIME >", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TIME >=", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeLessThan(String value) {
            addCriterion("BANK_TIME <", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeLessThanOrEqualTo(String value) {
            addCriterion("BANK_TIME <=", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeLike(String value) {
            addCriterion("BANK_TIME like", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeNotLike(String value) {
            addCriterion("BANK_TIME not like", value, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeIn(List<String> values) {
            addCriterion("BANK_TIME in", values, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeNotIn(List<String> values) {
            addCriterion("BANK_TIME not in", values, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeBetween(String value1, String value2) {
            addCriterion("BANK_TIME between", value1, value2, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankTimeNotBetween(String value1, String value2) {
            addCriterion("BANK_TIME not between", value1, value2, "bankTime");
            return (Criteria) this;
        }

        public Criteria andBankCountIsNull() {
            addCriterion("BANK_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankCountIsNotNull() {
            addCriterion("BANK_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankCountEqualTo(Integer value) {
            addCriterion("BANK_COUNT =", value, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountNotEqualTo(Integer value) {
            addCriterion("BANK_COUNT <>", value, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountGreaterThan(Integer value) {
            addCriterion("BANK_COUNT >", value, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANK_COUNT >=", value, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountLessThan(Integer value) {
            addCriterion("BANK_COUNT <", value, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountLessThanOrEqualTo(Integer value) {
            addCriterion("BANK_COUNT <=", value, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountIn(List<Integer> values) {
            addCriterion("BANK_COUNT in", values, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountNotIn(List<Integer> values) {
            addCriterion("BANK_COUNT not in", values, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountBetween(Integer value1, Integer value2) {
            addCriterion("BANK_COUNT between", value1, value2, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankCountNotBetween(Integer value1, Integer value2) {
            addCriterion("BANK_COUNT not between", value1, value2, "bankCount");
            return (Criteria) this;
        }

        public Criteria andBankStaffidIsNull() {
            addCriterion("BANK_STAFFID is null");
            return (Criteria) this;
        }

        public Criteria andBankStaffidIsNotNull() {
            addCriterion("BANK_STAFFID is not null");
            return (Criteria) this;
        }

        public Criteria andBankStaffidEqualTo(String value) {
            addCriterion("BANK_STAFFID =", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidNotEqualTo(String value) {
            addCriterion("BANK_STAFFID <>", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidGreaterThan(String value) {
            addCriterion("BANK_STAFFID >", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_STAFFID >=", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidLessThan(String value) {
            addCriterion("BANK_STAFFID <", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidLessThanOrEqualTo(String value) {
            addCriterion("BANK_STAFFID <=", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidLike(String value) {
            addCriterion("BANK_STAFFID like", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidNotLike(String value) {
            addCriterion("BANK_STAFFID not like", value, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidIn(List<String> values) {
            addCriterion("BANK_STAFFID in", values, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidNotIn(List<String> values) {
            addCriterion("BANK_STAFFID not in", values, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidBetween(String value1, String value2) {
            addCriterion("BANK_STAFFID between", value1, value2, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andBankStaffidNotBetween(String value1, String value2) {
            addCriterion("BANK_STAFFID not between", value1, value2, "bankStaffid");
            return (Criteria) this;
        }

        public Criteria andIsvaIsNull() {
            addCriterion("ISVA is null");
            return (Criteria) this;
        }

        public Criteria andIsvaIsNotNull() {
            addCriterion("ISVA is not null");
            return (Criteria) this;
        }

        public Criteria andIsvaEqualTo(Integer value) {
            addCriterion("ISVA =", value, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaNotEqualTo(Integer value) {
            addCriterion("ISVA <>", value, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaGreaterThan(Integer value) {
            addCriterion("ISVA >", value, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISVA >=", value, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaLessThan(Integer value) {
            addCriterion("ISVA <", value, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaLessThanOrEqualTo(Integer value) {
            addCriterion("ISVA <=", value, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaIn(List<Integer> values) {
            addCriterion("ISVA in", values, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaNotIn(List<Integer> values) {
            addCriterion("ISVA not in", values, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaBetween(Integer value1, Integer value2) {
            addCriterion("ISVA between", value1, value2, "isva");
            return (Criteria) this;
        }

        public Criteria andIsvaNotBetween(Integer value1, Integer value2) {
            addCriterion("ISVA not between", value1, value2, "isva");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andReaarkIsNull() {
            addCriterion("REAARK is null");
            return (Criteria) this;
        }

        public Criteria andReaarkIsNotNull() {
            addCriterion("REAARK is not null");
            return (Criteria) this;
        }

        public Criteria andReaarkEqualTo(String value) {
            addCriterion("REAARK =", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkNotEqualTo(String value) {
            addCriterion("REAARK <>", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkGreaterThan(String value) {
            addCriterion("REAARK >", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkGreaterThanOrEqualTo(String value) {
            addCriterion("REAARK >=", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkLessThan(String value) {
            addCriterion("REAARK <", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkLessThanOrEqualTo(String value) {
            addCriterion("REAARK <=", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkLike(String value) {
            addCriterion("REAARK like", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkNotLike(String value) {
            addCriterion("REAARK not like", value, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkIn(List<String> values) {
            addCriterion("REAARK in", values, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkNotIn(List<String> values) {
            addCriterion("REAARK not in", values, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkBetween(String value1, String value2) {
            addCriterion("REAARK between", value1, value2, "reaark");
            return (Criteria) this;
        }

        public Criteria andReaarkNotBetween(String value1, String value2) {
            addCriterion("REAARK not between", value1, value2, "reaark");
            return (Criteria) this;
        }

        public Criteria andBankIsvaIsNull() {
            addCriterion("BANK_ISVA is null");
            return (Criteria) this;
        }

        public Criteria andBankIsvaIsNotNull() {
            addCriterion("BANK_ISVA is not null");
            return (Criteria) this;
        }

        public Criteria andBankIsvaEqualTo(Integer value) {
            addCriterion("BANK_ISVA =", value, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaNotEqualTo(Integer value) {
            addCriterion("BANK_ISVA <>", value, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaGreaterThan(Integer value) {
            addCriterion("BANK_ISVA >", value, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANK_ISVA >=", value, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaLessThan(Integer value) {
            addCriterion("BANK_ISVA <", value, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaLessThanOrEqualTo(Integer value) {
            addCriterion("BANK_ISVA <=", value, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaIn(List<Integer> values) {
            addCriterion("BANK_ISVA in", values, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaNotIn(List<Integer> values) {
            addCriterion("BANK_ISVA not in", values, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaBetween(Integer value1, Integer value2) {
            addCriterion("BANK_ISVA between", value1, value2, "bankIsva");
            return (Criteria) this;
        }

        public Criteria andBankIsvaNotBetween(Integer value1, Integer value2) {
            addCriterion("BANK_ISVA not between", value1, value2, "bankIsva");
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