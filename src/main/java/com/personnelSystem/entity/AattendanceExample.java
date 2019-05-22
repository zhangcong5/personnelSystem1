package com.personnelSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AattendanceExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public AattendanceExample() {
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
			addCriterion("aattendance.id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("aattendance.id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("aattendance.id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("aattendance.id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("aattendance.id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("aattendance.id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("aattendance.id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("aattendance.id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("aattendance.id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("aattendance.id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andContentIsNull() {
			addCriterion("aattendance.content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("aattendance.content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("aattendance.content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("aattendance.content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("aattendance.content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("aattendance.content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("aattendance.content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("aattendance.content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("aattendance.content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("aattendance.content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("aattendance.content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("aattendance.content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("aattendance.content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("aattendance.content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("aattendance.type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("aattendance.type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("aattendance.type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("aattendance.type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("aattendance.type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("aattendance.type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("aattendance.type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("aattendance.type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("aattendance.type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("aattendance.type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andStartingtimeIsNull() {
			addCriterion("aattendance.startingTime is null");
			return (Criteria) this;
		}

		public Criteria andStartingtimeIsNotNull() {
			addCriterion("aattendance.startingTime is not null");
			return (Criteria) this;
		}

		public Criteria andStartingtimeEqualTo(Date value) {
			addCriterion("aattendance.startingTime =", value, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeNotEqualTo(Date value) {
			addCriterion("aattendance.startingTime <>", value, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeGreaterThan(Date value) {
			addCriterion("aattendance.startingTime >", value, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("aattendance.startingTime >=", value, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeLessThan(Date value) {
			addCriterion("aattendance.startingTime <", value, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeLessThanOrEqualTo(Date value) {
			addCriterion("aattendance.startingTime <=", value, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeIn(List<Date> values) {
			addCriterion("aattendance.startingTime in", values, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeNotIn(List<Date> values) {
			addCriterion("aattendance.startingTime not in", values, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeBetween(Date value1, Date value2) {
			addCriterion("aattendance.startingTime between", value1, value2, "startingtime");
			return (Criteria) this;
		}

		public Criteria andStartingtimeNotBetween(Date value1, Date value2) {
			addCriterion("aattendance.startingTime not between", value1, value2, "startingtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeIsNull() {
			addCriterion("aattendance.endTime is null");
			return (Criteria) this;
		}

		public Criteria andEndtimeIsNotNull() {
			addCriterion("aattendance.endTime is not null");
			return (Criteria) this;
		}

		public Criteria andEndtimeEqualTo(Date value) {
			addCriterion("aattendance.endTime =", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotEqualTo(Date value) {
			addCriterion("aattendance.endTime <>", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeGreaterThan(Date value) {
			addCriterion("aattendance.endTime >", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("aattendance.endTime >=", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeLessThan(Date value) {
			addCriterion("aattendance.endTime <", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeLessThanOrEqualTo(Date value) {
			addCriterion("aattendance.endTime <=", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeIn(List<Date> values) {
			addCriterion("aattendance.endTime in", values, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotIn(List<Date> values) {
			addCriterion("aattendance.endTime not in", values, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeBetween(Date value1, Date value2) {
			addCriterion("aattendance.endTime between", value1, value2, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotBetween(Date value1, Date value2) {
			addCriterion("aattendance.endTime not between", value1, value2, "endtime");
			return (Criteria) this;
		}

		public Criteria andNumberIsNull() {
			addCriterion("aattendance.number is null");
			return (Criteria) this;
		}

		public Criteria andNumberIsNotNull() {
			addCriterion("aattendance.number is not null");
			return (Criteria) this;
		}

		public Criteria andNumberEqualTo(Integer value) {
			addCriterion("aattendance.number =", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberNotEqualTo(Integer value) {
			addCriterion("aattendance.number <>", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberGreaterThan(Integer value) {
			addCriterion("aattendance.number >", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("aattendance.number >=", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberLessThan(Integer value) {
			addCriterion("aattendance.number <", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberLessThanOrEqualTo(Integer value) {
			addCriterion("aattendance.number <=", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberIn(List<Integer> values) {
			addCriterion("aattendance.number in", values, "number");
			return (Criteria) this;
		}

		public Criteria andNumberNotIn(List<Integer> values) {
			addCriterion("aattendance.number not in", values, "number");
			return (Criteria) this;
		}

		public Criteria andNumberBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.number between", value1, value2, "number");
			return (Criteria) this;
		}

		public Criteria andNumberNotBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.number not between", value1, value2, "number");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("aattendance.state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("aattendance.state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(Integer value) {
			addCriterion("aattendance.state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(Integer value) {
			addCriterion("aattendance.state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(Integer value) {
			addCriterion("aattendance.state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(Integer value) {
			addCriterion("aattendance.state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(Integer value) {
			addCriterion("aattendance.state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(Integer value) {
			addCriterion("aattendance.state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<Integer> values) {
			addCriterion("aattendance.state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<Integer> values) {
			addCriterion("aattendance.state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(Integer value1, Integer value2) {
			addCriterion("aattendance.state not between", value1, value2, "state");
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