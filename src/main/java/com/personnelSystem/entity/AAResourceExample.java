package com.personnelSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AAResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AAResourceExample() {
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

        public Criteria andResourceIdIsNull() {
            addCriterion("aaResource.RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("aaResource.RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("aaResource.RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("aaResource.RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("aaResource.RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aaResource.RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("aaResource.RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("aaResource.RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("aaResource.RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("aaResource.RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNull() {
            addCriterion("aaResource.RESOURCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNotNull() {
            addCriterion("aaResource.RESOURCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_CODE =", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_CODE <>", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThan(String value) {
            addCriterion("aaResource.RESOURCE_CODE >", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_CODE >=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThan(String value) {
            addCriterion("aaResource.RESOURCE_CODE <", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_CODE <=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLike(String value) {
            addCriterion("aaResource.RESOURCE_CODE like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotLike(String value) {
            addCriterion("aaResource.RESOURCE_CODE not like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_CODE in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_CODE not in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_CODE between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_CODE not between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNull() {
            addCriterion("aaResource.RESOURCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("aaResource.RESOURCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_NAME =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_NAME <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("aaResource.RESOURCE_NAME >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_NAME >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("aaResource.RESOURCE_NAME <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_NAME <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("aaResource.RESOURCE_NAME like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("aaResource.RESOURCE_NAME not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_NAME in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_NAME not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_NAME between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_NAME not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdIsNull() {
            addCriterion("aaResource.RESOURCE_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdIsNotNull() {
            addCriterion("aaResource.RESOURCE_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD =", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdNotEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD <>", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdGreaterThan(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD >", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD >=", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdLessThan(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD <", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdLessThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD <=", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdLike(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD like", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdNotLike(String value) {
            addCriterion("aaResource.RESOURCE_TYPE_CD not like", value, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_TYPE_CD in", values, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdNotIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_TYPE_CD not in", values, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_TYPE_CD between", value1, value2, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceTypeCdNotBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_TYPE_CD not between", value1, value2, "resourceTypeCd");
            return (Criteria) this;
        }

        public Criteria andResourceValueIsNull() {
            addCriterion("aaResource.RESOURCE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andResourceValueIsNotNull() {
            addCriterion("aaResource.RESOURCE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceValueEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_VALUE =", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueNotEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_VALUE <>", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueGreaterThan(String value) {
            addCriterion("aaResource.RESOURCE_VALUE >", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueGreaterThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_VALUE >=", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueLessThan(String value) {
            addCriterion("aaResource.RESOURCE_VALUE <", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueLessThanOrEqualTo(String value) {
            addCriterion("aaResource.RESOURCE_VALUE <=", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueLike(String value) {
            addCriterion("aaResource.RESOURCE_VALUE like", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueNotLike(String value) {
            addCriterion("aaResource.RESOURCE_VALUE not like", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_VALUE in", values, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueNotIn(List<String> values) {
            addCriterion("aaResource.RESOURCE_VALUE not in", values, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_VALUE between", value1, value2, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueNotBetween(String value1, String value2) {
            addCriterion("aaResource.RESOURCE_VALUE not between", value1, value2, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdIsNull() {
            addCriterion("aaResource.PARENT_RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdIsNotNull() {
            addCriterion("aaResource.PARENT_RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdEqualTo(Integer value) {
            addCriterion("aaResource.PARENT_RESOURCE_ID =", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdNotEqualTo(Integer value) {
            addCriterion("aaResource.PARENT_RESOURCE_ID <>", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdGreaterThan(Integer value) {
            addCriterion("aaResource.PARENT_RESOURCE_ID >", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aaResource.PARENT_RESOURCE_ID >=", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdLessThan(Integer value) {
            addCriterion("aaResource.PARENT_RESOURCE_ID <", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("aaResource.PARENT_RESOURCE_ID <=", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdIn(List<Integer> values) {
            addCriterion("aaResource.PARENT_RESOURCE_ID in", values, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdNotIn(List<Integer> values) {
            addCriterion("aaResource.PARENT_RESOURCE_ID not in", values, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.PARENT_RESOURCE_ID between", value1, value2, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.PARENT_RESOURCE_ID not between", value1, value2, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("aaResource.DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("aaResource.DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("aaResource.DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("aaResource.DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("aaResource.DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("aaResource.DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("aaResource.DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("aaResource.DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("aaResource.DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("aaResource.DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("aaResource.CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("aaResource.CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("aaResource.CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("aaResource.CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("aaResource.CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aaResource.CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("aaResource.CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("aaResource.CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("aaResource.CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("aaResource.CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("aaResource.CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("aaResource.CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("aaResource.UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("aaResource.UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("aaResource.UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("aaResource.UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("aaResource.UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aaResource.UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("aaResource.UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("aaResource.UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("aaResource.UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("aaResource.UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("aaResource.UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("aaResource.UPDATED_TIME not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andCreatedByidIsNull() {
            addCriterion("aaResource.CREATED_BYID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByidIsNotNull() {
            addCriterion("aaResource.CREATED_BYID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByidEqualTo(Integer value) {
            addCriterion("aaResource.CREATED_BYID =", value, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidNotEqualTo(Integer value) {
            addCriterion("aaResource.CREATED_BYID <>", value, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidGreaterThan(Integer value) {
            addCriterion("aaResource.CREATED_BYID >", value, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aaResource.CREATED_BYID >=", value, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidLessThan(Integer value) {
            addCriterion("aaResource.CREATED_BYID <", value, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidLessThanOrEqualTo(Integer value) {
            addCriterion("aaResource.CREATED_BYID <=", value, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidIn(List<Integer> values) {
            addCriterion("aaResource.CREATED_BYID in", values, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidNotIn(List<Integer> values) {
            addCriterion("aaResource.CREATED_BYID not in", values, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.CREATED_BYID between", value1, value2, "createdByid");
            return (Criteria) this;
        }

        public Criteria andCreatedByidNotBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.CREATED_BYID not between", value1, value2, "createdByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidIsNull() {
            addCriterion("aaResource.UPDATED_BYID is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidIsNotNull() {
            addCriterion("aaResource.UPDATED_BYID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidEqualTo(Integer value) {
            addCriterion("aaResource.UPDATED_BYID =", value, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidNotEqualTo(Integer value) {
            addCriterion("aaResource.UPDATED_BYID <>", value, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidGreaterThan(Integer value) {
            addCriterion("aaResource.UPDATED_BYID >", value, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aaResource.UPDATED_BYID >=", value, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidLessThan(Integer value) {
            addCriterion("aaResource.UPDATED_BYID <", value, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidLessThanOrEqualTo(Integer value) {
            addCriterion("aaResource.UPDATED_BYID <=", value, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidIn(List<Integer> values) {
            addCriterion("aaResource.UPDATED_BYID in", values, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidNotIn(List<Integer> values) {
            addCriterion("aaResource.UPDATED_BYID not in", values, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.UPDATED_BYID between", value1, value2, "updatedByid");
            return (Criteria) this;
        }

        public Criteria andUpdatedByidNotBetween(Integer value1, Integer value2) {
            addCriterion("aaResource.UPDATED_BYID not between", value1, value2, "updatedByid");
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