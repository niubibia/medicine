package com.newer.medicine.domain;

import java.util.ArrayList;
import java.util.List;

public class ErpOutbankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpOutbankExample() {
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

        public Criteria andObIdIsNull() {
            addCriterion("OB_ID is null");
            return (Criteria) this;
        }

        public Criteria andObIdIsNotNull() {
            addCriterion("OB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObIdEqualTo(String value) {
            addCriterion("OB_ID =", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdNotEqualTo(String value) {
            addCriterion("OB_ID <>", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdGreaterThan(String value) {
            addCriterion("OB_ID >", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdGreaterThanOrEqualTo(String value) {
            addCriterion("OB_ID >=", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdLessThan(String value) {
            addCriterion("OB_ID <", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdLessThanOrEqualTo(String value) {
            addCriterion("OB_ID <=", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdLike(String value) {
            addCriterion("OB_ID like", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdNotLike(String value) {
            addCriterion("OB_ID not like", value, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdIn(List<String> values) {
            addCriterion("OB_ID in", values, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdNotIn(List<String> values) {
            addCriterion("OB_ID not in", values, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdBetween(String value1, String value2) {
            addCriterion("OB_ID between", value1, value2, "obId");
            return (Criteria) this;
        }

        public Criteria andObIdNotBetween(String value1, String value2) {
            addCriterion("OB_ID not between", value1, value2, "obId");
            return (Criteria) this;
        }

        public Criteria andKinordIdIsNull() {
            addCriterion("KINORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andKinordIdIsNotNull() {
            addCriterion("KINORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKinordIdEqualTo(String value) {
            addCriterion("KINORD_ID =", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdNotEqualTo(String value) {
            addCriterion("KINORD_ID <>", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdGreaterThan(String value) {
            addCriterion("KINORD_ID >", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdGreaterThanOrEqualTo(String value) {
            addCriterion("KINORD_ID >=", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdLessThan(String value) {
            addCriterion("KINORD_ID <", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdLessThanOrEqualTo(String value) {
            addCriterion("KINORD_ID <=", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdLike(String value) {
            addCriterion("KINORD_ID like", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdNotLike(String value) {
            addCriterion("KINORD_ID not like", value, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdIn(List<String> values) {
            addCriterion("KINORD_ID in", values, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdNotIn(List<String> values) {
            addCriterion("KINORD_ID not in", values, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdBetween(String value1, String value2) {
            addCriterion("KINORD_ID between", value1, value2, "kinordId");
            return (Criteria) this;
        }

        public Criteria andKinordIdNotBetween(String value1, String value2) {
            addCriterion("KINORD_ID not between", value1, value2, "kinordId");
            return (Criteria) this;
        }

        public Criteria andObNumberIsNull() {
            addCriterion("OB_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andObNumberIsNotNull() {
            addCriterion("OB_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andObNumberEqualTo(String value) {
            addCriterion("OB_NUMBER =", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberNotEqualTo(String value) {
            addCriterion("OB_NUMBER <>", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberGreaterThan(String value) {
            addCriterion("OB_NUMBER >", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberGreaterThanOrEqualTo(String value) {
            addCriterion("OB_NUMBER >=", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberLessThan(String value) {
            addCriterion("OB_NUMBER <", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberLessThanOrEqualTo(String value) {
            addCriterion("OB_NUMBER <=", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberLike(String value) {
            addCriterion("OB_NUMBER like", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberNotLike(String value) {
            addCriterion("OB_NUMBER not like", value, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberIn(List<String> values) {
            addCriterion("OB_NUMBER in", values, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberNotIn(List<String> values) {
            addCriterion("OB_NUMBER not in", values, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberBetween(String value1, String value2) {
            addCriterion("OB_NUMBER between", value1, value2, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObNumberNotBetween(String value1, String value2) {
            addCriterion("OB_NUMBER not between", value1, value2, "obNumber");
            return (Criteria) this;
        }

        public Criteria andObTimeIsNull() {
            addCriterion("OB_TIME is null");
            return (Criteria) this;
        }

        public Criteria andObTimeIsNotNull() {
            addCriterion("OB_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andObTimeEqualTo(String value) {
            addCriterion("OB_TIME =", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeNotEqualTo(String value) {
            addCriterion("OB_TIME <>", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeGreaterThan(String value) {
            addCriterion("OB_TIME >", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OB_TIME >=", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeLessThan(String value) {
            addCriterion("OB_TIME <", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeLessThanOrEqualTo(String value) {
            addCriterion("OB_TIME <=", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeLike(String value) {
            addCriterion("OB_TIME like", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeNotLike(String value) {
            addCriterion("OB_TIME not like", value, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeIn(List<String> values) {
            addCriterion("OB_TIME in", values, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeNotIn(List<String> values) {
            addCriterion("OB_TIME not in", values, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeBetween(String value1, String value2) {
            addCriterion("OB_TIME between", value1, value2, "obTime");
            return (Criteria) this;
        }

        public Criteria andObTimeNotBetween(String value1, String value2) {
            addCriterion("OB_TIME not between", value1, value2, "obTime");
            return (Criteria) this;
        }

        public Criteria andObWarecountIsNull() {
            addCriterion("OB_WARECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andObWarecountIsNotNull() {
            addCriterion("OB_WARECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andObWarecountEqualTo(Integer value) {
            addCriterion("OB_WARECOUNT =", value, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountNotEqualTo(Integer value) {
            addCriterion("OB_WARECOUNT <>", value, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountGreaterThan(Integer value) {
            addCriterion("OB_WARECOUNT >", value, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("OB_WARECOUNT >=", value, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountLessThan(Integer value) {
            addCriterion("OB_WARECOUNT <", value, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountLessThanOrEqualTo(Integer value) {
            addCriterion("OB_WARECOUNT <=", value, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountIn(List<Integer> values) {
            addCriterion("OB_WARECOUNT in", values, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountNotIn(List<Integer> values) {
            addCriterion("OB_WARECOUNT not in", values, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountBetween(Integer value1, Integer value2) {
            addCriterion("OB_WARECOUNT between", value1, value2, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObWarecountNotBetween(Integer value1, Integer value2) {
            addCriterion("OB_WARECOUNT not between", value1, value2, "obWarecount");
            return (Criteria) this;
        }

        public Criteria andObBusibessIsNull() {
            addCriterion("OB_BUSIBESS is null");
            return (Criteria) this;
        }

        public Criteria andObBusibessIsNotNull() {
            addCriterion("OB_BUSIBESS is not null");
            return (Criteria) this;
        }

        public Criteria andObBusibessEqualTo(Integer value) {
            addCriterion("OB_BUSIBESS =", value, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessNotEqualTo(Integer value) {
            addCriterion("OB_BUSIBESS <>", value, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessGreaterThan(Integer value) {
            addCriterion("OB_BUSIBESS >", value, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessGreaterThanOrEqualTo(Integer value) {
            addCriterion("OB_BUSIBESS >=", value, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessLessThan(Integer value) {
            addCriterion("OB_BUSIBESS <", value, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessLessThanOrEqualTo(Integer value) {
            addCriterion("OB_BUSIBESS <=", value, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessIn(List<Integer> values) {
            addCriterion("OB_BUSIBESS in", values, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessNotIn(List<Integer> values) {
            addCriterion("OB_BUSIBESS not in", values, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessBetween(Integer value1, Integer value2) {
            addCriterion("OB_BUSIBESS between", value1, value2, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObBusibessNotBetween(Integer value1, Integer value2) {
            addCriterion("OB_BUSIBESS not between", value1, value2, "obBusibess");
            return (Criteria) this;
        }

        public Criteria andObStaffidIsNull() {
            addCriterion("OB_STAFFID is null");
            return (Criteria) this;
        }

        public Criteria andObStaffidIsNotNull() {
            addCriterion("OB_STAFFID is not null");
            return (Criteria) this;
        }

        public Criteria andObStaffidEqualTo(String value) {
            addCriterion("OB_STAFFID =", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidNotEqualTo(String value) {
            addCriterion("OB_STAFFID <>", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidGreaterThan(String value) {
            addCriterion("OB_STAFFID >", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("OB_STAFFID >=", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidLessThan(String value) {
            addCriterion("OB_STAFFID <", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidLessThanOrEqualTo(String value) {
            addCriterion("OB_STAFFID <=", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidLike(String value) {
            addCriterion("OB_STAFFID like", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidNotLike(String value) {
            addCriterion("OB_STAFFID not like", value, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidIn(List<String> values) {
            addCriterion("OB_STAFFID in", values, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidNotIn(List<String> values) {
            addCriterion("OB_STAFFID not in", values, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidBetween(String value1, String value2) {
            addCriterion("OB_STAFFID between", value1, value2, "obStaffid");
            return (Criteria) this;
        }

        public Criteria andObStaffidNotBetween(String value1, String value2) {
            addCriterion("OB_STAFFID not between", value1, value2, "obStaffid");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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