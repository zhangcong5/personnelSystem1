package com.personnelSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentEmployeeExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public DepartmentEmployeeExample() {
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

		public Criteria andDepartmentidIsNull() {
			addCriterion("departmentEmployee.departmentId is null");
			return (Criteria) this;
		}

		public Criteria andDepartmentidIsNotNull() {
			addCriterion("departmentEmployee.departmentId is not null");
			return (Criteria) this;
		}

		public Criteria andDepartmentidEqualTo(Integer value) {
			addCriterion("departmentEmployee.departmentId =", value, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidNotEqualTo(Integer value) {
			addCriterion("departmentEmployee.departmentId <>", value, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidGreaterThan(Integer value) {
			addCriterion("departmentEmployee.departmentId >", value, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.departmentId >=", value, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidLessThan(Integer value) {
			addCriterion("departmentEmployee.departmentId <", value, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.departmentId <=", value, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidIn(List<Integer> values) {
			addCriterion("departmentEmployee.departmentId in", values, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidNotIn(List<Integer> values) {
			addCriterion("departmentEmployee.departmentId not in", values, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.departmentId between", value1, value2, "departmentid");
			return (Criteria) this;
		}

		public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.departmentId not between", value1, value2, "departmentid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidIsNull() {
			addCriterion("departmentEmployee.emlopyeeId is null");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidIsNotNull() {
			addCriterion("departmentEmployee.emlopyeeId is not null");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidEqualTo(Integer value) {
			addCriterion("departmentEmployee.emlopyeeId =", value, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidNotEqualTo(Integer value) {
			addCriterion("departmentEmployee.emlopyeeId <>", value, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidGreaterThan(Integer value) {
			addCriterion("departmentEmployee.emlopyeeId >", value, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidGreaterThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.emlopyeeId >=", value, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidLessThan(Integer value) {
			addCriterion("departmentEmployee.emlopyeeId <", value, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidLessThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.emlopyeeId <=", value, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidIn(List<Integer> values) {
			addCriterion("departmentEmployee.emlopyeeId in", values, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidNotIn(List<Integer> values) {
			addCriterion("departmentEmployee.emlopyeeId not in", values, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.emlopyeeId between", value1, value2, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andEmlopyeeidNotBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.emlopyeeId not between", value1, value2, "emlopyeeid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIsNull() {
			addCriterion("departmentEmployee.createdById is null");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIsNotNull() {
			addCriterion("departmentEmployee.createdById is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidEqualTo(Integer value) {
			addCriterion("departmentEmployee.createdById =", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotEqualTo(Integer value) {
			addCriterion("departmentEmployee.createdById <>", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidGreaterThan(Integer value) {
			addCriterion("departmentEmployee.createdById >", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidGreaterThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.createdById >=", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidLessThan(Integer value) {
			addCriterion("departmentEmployee.createdById <", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidLessThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.createdById <=", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIn(List<Integer> values) {
			addCriterion("departmentEmployee.createdById in", values, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotIn(List<Integer> values) {
			addCriterion("departmentEmployee.createdById not in", values, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.createdById between", value1, value2, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.createdById not between", value1, value2, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNull() {
			addCriterion("departmentEmployee.createdTime is null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNotNull() {
			addCriterion("departmentEmployee.createdTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeEqualTo(Date value) {
			addCriterion("departmentEmployee.createdTime =", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotEqualTo(Date value) {
			addCriterion("departmentEmployee.createdTime <>", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThan(Date value) {
			addCriterion("departmentEmployee.createdTime >", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("departmentEmployee.createdTime >=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThan(Date value) {
			addCriterion("departmentEmployee.createdTime <", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
			addCriterion("departmentEmployee.createdTime <=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIn(List<Date> values) {
			addCriterion("departmentEmployee.createdTime in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotIn(List<Date> values) {
			addCriterion("departmentEmployee.createdTime not in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeBetween(Date value1, Date value2) {
			addCriterion("departmentEmployee.createdTime between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
			addCriterion("departmentEmployee.createdTime not between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andModifybyidIsNull() {
			addCriterion("departmentEmployee.modifyById is null");
			return (Criteria) this;
		}

		public Criteria andModifybyidIsNotNull() {
			addCriterion("departmentEmployee.modifyById is not null");
			return (Criteria) this;
		}

		public Criteria andModifybyidEqualTo(Integer value) {
			addCriterion("departmentEmployee.modifyById =", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotEqualTo(Integer value) {
			addCriterion("departmentEmployee.modifyById <>", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidGreaterThan(Integer value) {
			addCriterion("departmentEmployee.modifyById >", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidGreaterThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.modifyById >=", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidLessThan(Integer value) {
			addCriterion("departmentEmployee.modifyById <", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidLessThanOrEqualTo(Integer value) {
			addCriterion("departmentEmployee.modifyById <=", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidIn(List<Integer> values) {
			addCriterion("departmentEmployee.modifyById in", values, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotIn(List<Integer> values) {
			addCriterion("departmentEmployee.modifyById not in", values, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.modifyById between", value1, value2, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotBetween(Integer value1, Integer value2) {
			addCriterion("departmentEmployee.modifyById not between", value1, value2, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIsNull() {
			addCriterion("departmentEmployee.modifyDateTime is null");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIsNotNull() {
			addCriterion("departmentEmployee.modifyDateTime is not null");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeEqualTo(Date value) {
			addCriterion("departmentEmployee.modifyDateTime =", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotEqualTo(Date value) {
			addCriterion("departmentEmployee.modifyDateTime <>", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeGreaterThan(Date value) {
			addCriterion("departmentEmployee.modifyDateTime >", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("departmentEmployee.modifyDateTime >=", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeLessThan(Date value) {
			addCriterion("departmentEmployee.modifyDateTime <", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeLessThanOrEqualTo(Date value) {
			addCriterion("departmentEmployee.modifyDateTime <=", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIn(List<Date> values) {
			addCriterion("departmentEmployee.modifyDateTime in", values, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotIn(List<Date> values) {
			addCriterion("departmentEmployee.modifyDateTime not in", values, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeBetween(Date value1, Date value2) {
			addCriterion("departmentEmployee.modifyDateTime between", value1, value2, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotBetween(Date value1, Date value2) {
			addCriterion("departmentEmployee.modifyDateTime not between", value1, value2, "modifydatetime");
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