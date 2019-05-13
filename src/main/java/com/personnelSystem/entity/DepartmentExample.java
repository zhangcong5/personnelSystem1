package com.personnelSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public DepartmentExample() {
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
			addCriterion("department.id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("department.id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("department.id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("department.id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("department.id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("department.id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("department.id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("department.id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("department.id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("department.id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("department.id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("department.id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameIsNull() {
			addCriterion("department.departmentName is null");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameIsNotNull() {
			addCriterion("department.departmentName is not null");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameEqualTo(String value) {
			addCriterion("department.departmentName =", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameNotEqualTo(String value) {
			addCriterion("department.departmentName <>", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameGreaterThan(String value) {
			addCriterion("department.departmentName >", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
			addCriterion("department.departmentName >=", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameLessThan(String value) {
			addCriterion("department.departmentName <", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
			addCriterion("department.departmentName <=", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameLike(String value) {
			addCriterion("department.departmentName like", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameNotLike(String value) {
			addCriterion("department.departmentName not like", value, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameIn(List<String> values) {
			addCriterion("department.departmentName in", values, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameNotIn(List<String> values) {
			addCriterion("department.departmentName not in", values, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameBetween(String value1, String value2) {
			addCriterion("department.departmentName between", value1, value2, "departmentname");
			return (Criteria) this;
		}

		public Criteria andDepartmentnameNotBetween(String value1, String value2) {
			addCriterion("department.departmentName not between", value1, value2, "departmentname");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("department.mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("department.mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("department.mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("department.mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("department.mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("department.mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("department.mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("department.mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("department.mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("department.mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("department.mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("department.mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("department.mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("department.mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIsNull() {
			addCriterion("department.createdById is null");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIsNotNull() {
			addCriterion("department.createdById is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidEqualTo(Integer value) {
			addCriterion("department.createdById =", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotEqualTo(Integer value) {
			addCriterion("department.createdById <>", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidGreaterThan(Integer value) {
			addCriterion("department.createdById >", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidGreaterThanOrEqualTo(Integer value) {
			addCriterion("department.createdById >=", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidLessThan(Integer value) {
			addCriterion("department.createdById <", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidLessThanOrEqualTo(Integer value) {
			addCriterion("department.createdById <=", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIn(List<Integer> values) {
			addCriterion("department.createdById in", values, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotIn(List<Integer> values) {
			addCriterion("department.createdById not in", values, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidBetween(Integer value1, Integer value2) {
			addCriterion("department.createdById between", value1, value2, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotBetween(Integer value1, Integer value2) {
			addCriterion("department.createdById not between", value1, value2, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNull() {
			addCriterion("department.createdTime is null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNotNull() {
			addCriterion("department.createdTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeEqualTo(Date value) {
			addCriterion("department.createdTime =", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotEqualTo(Date value) {
			addCriterion("department.createdTime <>", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThan(Date value) {
			addCriterion("department.createdTime >", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("department.createdTime >=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThan(Date value) {
			addCriterion("department.createdTime <", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
			addCriterion("department.createdTime <=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIn(List<Date> values) {
			addCriterion("department.createdTime in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotIn(List<Date> values) {
			addCriterion("department.createdTime not in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeBetween(Date value1, Date value2) {
			addCriterion("department.createdTime between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
			addCriterion("department.createdTime not between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andModifybyidIsNull() {
			addCriterion("department.modifyById is null");
			return (Criteria) this;
		}

		public Criteria andModifybyidIsNotNull() {
			addCriterion("department.modifyById is not null");
			return (Criteria) this;
		}

		public Criteria andModifybyidEqualTo(Integer value) {
			addCriterion("department.modifyById =", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotEqualTo(Integer value) {
			addCriterion("department.modifyById <>", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidGreaterThan(Integer value) {
			addCriterion("department.modifyById >", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidGreaterThanOrEqualTo(Integer value) {
			addCriterion("department.modifyById >=", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidLessThan(Integer value) {
			addCriterion("department.modifyById <", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidLessThanOrEqualTo(Integer value) {
			addCriterion("department.modifyById <=", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidIn(List<Integer> values) {
			addCriterion("department.modifyById in", values, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotIn(List<Integer> values) {
			addCriterion("department.modifyById not in", values, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidBetween(Integer value1, Integer value2) {
			addCriterion("department.modifyById between", value1, value2, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotBetween(Integer value1, Integer value2) {
			addCriterion("department.modifyById not between", value1, value2, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIsNull() {
			addCriterion("department.modifyDateTime is null");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIsNotNull() {
			addCriterion("department.modifyDateTime is not null");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeEqualTo(Date value) {
			addCriterion("department.modifyDateTime =", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotEqualTo(Date value) {
			addCriterion("department.modifyDateTime <>", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeGreaterThan(Date value) {
			addCriterion("department.modifyDateTime >", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("department.modifyDateTime >=", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeLessThan(Date value) {
			addCriterion("department.modifyDateTime <", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeLessThanOrEqualTo(Date value) {
			addCriterion("department.modifyDateTime <=", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIn(List<Date> values) {
			addCriterion("department.modifyDateTime in", values, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotIn(List<Date> values) {
			addCriterion("department.modifyDateTime not in", values, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeBetween(Date value1, Date value2) {
			addCriterion("department.modifyDateTime between", value1, value2, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotBetween(Date value1, Date value2) {
			addCriterion("department.modifyDateTime not between", value1, value2, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andVersionIsNull() {
			addCriterion("department.version is null");
			return (Criteria) this;
		}

		public Criteria andVersionIsNotNull() {
			addCriterion("department.version is not null");
			return (Criteria) this;
		}

		public Criteria andVersionEqualTo(Boolean value) {
			addCriterion("department.version =", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotEqualTo(Boolean value) {
			addCriterion("department.version <>", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThan(Boolean value) {
			addCriterion("department.version >", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThanOrEqualTo(Boolean value) {
			addCriterion("department.version >=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThan(Boolean value) {
			addCriterion("department.version <", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThanOrEqualTo(Boolean value) {
			addCriterion("department.version <=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionIn(List<Boolean> values) {
			addCriterion("department.version in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotIn(List<Boolean> values) {
			addCriterion("department.version not in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionBetween(Boolean value1, Boolean value2) {
			addCriterion("department.version between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotBetween(Boolean value1, Boolean value2) {
			addCriterion("department.version not between", value1, value2, "version");
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