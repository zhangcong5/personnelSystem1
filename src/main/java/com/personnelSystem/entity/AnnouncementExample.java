package com.personnelSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("announcement.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("announcement.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("announcement.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("announcement.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("announcement.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("announcement.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("announcement.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("announcement.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("announcement.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("announcement.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("announcement.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("announcement.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("announcement.title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("announcement.title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("announcement.title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("announcement.title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("announcement.title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("announcement.title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("announcement.title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("announcement.title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("announcement.title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("announcement.title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("announcement.title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("announcement.title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("announcement.title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("announcement.title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("announcement.state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("announcement.state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("announcement.state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("announcement.state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("announcement.state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("announcement.state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("announcement.state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("announcement.state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("announcement.state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("announcement.state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("announcement.state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("announcement.state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("announcement.content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("announcement.content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("announcement.content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("announcement.content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("announcement.content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("announcement.content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("announcement.content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("announcement.content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("announcement.content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("announcement.content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("announcement.content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("announcement.content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("announcement.content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("announcement.content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreatebyidIsNull() {
            addCriterion("announcement.createById is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyidIsNotNull() {
            addCriterion("announcement.createById is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyidEqualTo(Integer value) {
            addCriterion("announcement.createById =", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidNotEqualTo(Integer value) {
            addCriterion("announcement.createById <>", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidGreaterThan(Integer value) {
            addCriterion("announcement.createById >", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("announcement.createById >=", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidLessThan(Integer value) {
            addCriterion("announcement.createById <", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidLessThanOrEqualTo(Integer value) {
            addCriterion("announcement.createById <=", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidIn(List<Integer> values) {
            addCriterion("announcement.createById in", values, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidNotIn(List<Integer> values) {
            addCriterion("announcement.createById not in", values, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidBetween(Integer value1, Integer value2) {
            addCriterion("announcement.createById between", value1, value2, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidNotBetween(Integer value1, Integer value2) {
            addCriterion("announcement.createById not between", value1, value2, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("announcement.createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("announcement.createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("announcement.createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("announcement.createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("announcement.createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("announcement.createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("announcement.createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("announcement.createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("announcement.createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("announcement.createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("announcement.createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("announcement.createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifybyidIsNull() {
            addCriterion("announcement.modifyById is null");
            return (Criteria) this;
        }

        public Criteria andModifybyidIsNotNull() {
            addCriterion("announcement.modifyById is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyidEqualTo(Integer value) {
            addCriterion("announcement.modifyById =", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidNotEqualTo(Integer value) {
            addCriterion("announcement.modifyById <>", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidGreaterThan(Integer value) {
            addCriterion("announcement.modifyById >", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("announcement.modifyById >=", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidLessThan(Integer value) {
            addCriterion("announcement.modifyById <", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidLessThanOrEqualTo(Integer value) {
            addCriterion("announcement.modifyById <=", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidIn(List<Integer> values) {
            addCriterion("announcement.modifyById in", values, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidNotIn(List<Integer> values) {
            addCriterion("announcement.modifyById not in", values, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidBetween(Integer value1, Integer value2) {
            addCriterion("announcement.modifyById between", value1, value2, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidNotBetween(Integer value1, Integer value2) {
            addCriterion("announcement.modifyById not between", value1, value2, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeIsNull() {
            addCriterion("announcement.modifyDateTime is null");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeIsNotNull() {
            addCriterion("announcement.modifyDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeEqualTo(Date value) {
            addCriterion("announcement.modifyDateTime =", value, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeNotEqualTo(Date value) {
            addCriterion("announcement.modifyDateTime <>", value, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeGreaterThan(Date value) {
            addCriterion("announcement.modifyDateTime >", value, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("announcement.modifyDateTime >=", value, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeLessThan(Date value) {
            addCriterion("announcement.modifyDateTime <", value, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeLessThanOrEqualTo(Date value) {
            addCriterion("announcement.modifyDateTime <=", value, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeIn(List<Date> values) {
            addCriterion("announcement.modifyDateTime in", values, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeNotIn(List<Date> values) {
            addCriterion("announcement.modifyDateTime not in", values, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeBetween(Date value1, Date value2) {
            addCriterion("announcement.modifyDateTime between", value1, value2, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andModifydatetimeNotBetween(Date value1, Date value2) {
            addCriterion("announcement.modifyDateTime not between", value1, value2, "modifydatetime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("announcement.version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("announcement.version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Boolean value) {
            addCriterion("announcement.version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Boolean value) {
            addCriterion("announcement.version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Boolean value) {
            addCriterion("announcement.version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("announcement.version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Boolean value) {
            addCriterion("announcement.version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Boolean value) {
            addCriterion("announcement.version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Boolean> values) {
            addCriterion("announcement.version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Boolean> values) {
            addCriterion("announcement.version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Boolean value1, Boolean value2) {
            addCriterion("announcement.version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("announcement.version not between", value1, value2, "version");
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