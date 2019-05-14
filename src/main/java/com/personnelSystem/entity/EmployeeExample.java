package com.personnelSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public EmployeeExample() {
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
			addCriterion("employee.id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("employee.id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("employee.id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("employee.id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("employee.id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee.id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("employee.id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("employee.id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("employee.id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("employee.id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("employee.id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("employee.id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNicknameIsNull() {
			addCriterion("employee.nickname is null");
			return (Criteria) this;
		}

		public Criteria andNicknameIsNotNull() {
			addCriterion("employee.nickname is not null");
			return (Criteria) this;
		}

		public Criteria andNicknameEqualTo(String value) {
			addCriterion("employee.nickname =", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotEqualTo(String value) {
			addCriterion("employee.nickname <>", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameGreaterThan(String value) {
			addCriterion("employee.nickname >", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameGreaterThanOrEqualTo(String value) {
			addCriterion("employee.nickname >=", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameLessThan(String value) {
			addCriterion("employee.nickname <", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameLessThanOrEqualTo(String value) {
			addCriterion("employee.nickname <=", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameLike(String value) {
			addCriterion("employee.nickname like", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotLike(String value) {
			addCriterion("employee.nickname not like", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameIn(List<String> values) {
			addCriterion("employee.nickname in", values, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotIn(List<String> values) {
			addCriterion("employee.nickname not in", values, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameBetween(String value1, String value2) {
			addCriterion("employee.nickname between", value1, value2, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotBetween(String value1, String value2) {
			addCriterion("employee.nickname not between", value1, value2, "nickname");
			return (Criteria) this;
		}

		public Criteria andMgrIsNull() {
			addCriterion("employee.mgr is null");
			return (Criteria) this;
		}

		public Criteria andMgrIsNotNull() {
			addCriterion("employee.mgr is not null");
			return (Criteria) this;
		}

		public Criteria andMgrEqualTo(Integer value) {
			addCriterion("employee.mgr =", value, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrNotEqualTo(Integer value) {
			addCriterion("employee.mgr <>", value, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrGreaterThan(Integer value) {
			addCriterion("employee.mgr >", value, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee.mgr >=", value, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrLessThan(Integer value) {
			addCriterion("employee.mgr <", value, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrLessThanOrEqualTo(Integer value) {
			addCriterion("employee.mgr <=", value, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrIn(List<Integer> values) {
			addCriterion("employee.mgr in", values, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrNotIn(List<Integer> values) {
			addCriterion("employee.mgr not in", values, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrBetween(Integer value1, Integer value2) {
			addCriterion("employee.mgr between", value1, value2, "mgr");
			return (Criteria) this;
		}

		public Criteria andMgrNotBetween(Integer value1, Integer value2) {
			addCriterion("employee.mgr not between", value1, value2, "mgr");
			return (Criteria) this;
		}

		public Criteria andSexIsNull() {
			addCriterion("employee.sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("employee.sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(Integer value) {
			addCriterion("employee.sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(Integer value) {
			addCriterion("employee.sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(Integer value) {
			addCriterion("employee.sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee.sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(Integer value) {
			addCriterion("employee.sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(Integer value) {
			addCriterion("employee.sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<Integer> values) {
			addCriterion("employee.sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<Integer> values) {
			addCriterion("employee.sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(Integer value1, Integer value2) {
			addCriterion("employee.sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(Integer value1, Integer value2) {
			addCriterion("employee.sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSalaryIsNull() {
			addCriterion("employee.salary is null");
			return (Criteria) this;
		}

		public Criteria andSalaryIsNotNull() {
			addCriterion("employee.salary is not null");
			return (Criteria) this;
		}

		public Criteria andSalaryEqualTo(Integer value) {
			addCriterion("employee.salary =", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotEqualTo(Integer value) {
			addCriterion("employee.salary <>", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryGreaterThan(Integer value) {
			addCriterion("employee.salary >", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee.salary >=", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryLessThan(Integer value) {
			addCriterion("employee.salary <", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryLessThanOrEqualTo(Integer value) {
			addCriterion("employee.salary <=", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryIn(List<Integer> values) {
			addCriterion("employee.salary in", values, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotIn(List<Integer> values) {
			addCriterion("employee.salary not in", values, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryBetween(Integer value1, Integer value2) {
			addCriterion("employee.salary between", value1, value2, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
			addCriterion("employee.salary not between", value1, value2, "salary");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("employee.mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("employee.mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("employee.mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("employee.mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("employee.mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("employee.mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("employee.mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("employee.mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("employee.mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("employee.mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("employee.mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("employee.mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("employee.mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("employee.mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("employee.email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("employee.email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("employee.email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("employee.email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("employee.email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("employee.email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("employee.email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("employee.email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("employee.email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("employee.email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("employee.email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("employee.email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("employee.email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("employee.email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andHiredateIsNull() {
			addCriterion("employee.hireDate is null");
			return (Criteria) this;
		}

		public Criteria andHiredateIsNotNull() {
			addCriterion("employee.hireDate is not null");
			return (Criteria) this;
		}

		public Criteria andHiredateEqualTo(Date value) {
			addCriterion("employee.hireDate =", value, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateNotEqualTo(Date value) {
			addCriterion("employee.hireDate <>", value, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateGreaterThan(Date value) {
			addCriterion("employee.hireDate >", value, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateGreaterThanOrEqualTo(Date value) {
			addCriterion("employee.hireDate >=", value, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateLessThan(Date value) {
			addCriterion("employee.hireDate <", value, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateLessThanOrEqualTo(Date value) {
			addCriterion("employee.hireDate <=", value, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateIn(List<Date> values) {
			addCriterion("employee.hireDate in", values, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateNotIn(List<Date> values) {
			addCriterion("employee.hireDate not in", values, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateBetween(Date value1, Date value2) {
			addCriterion("employee.hireDate between", value1, value2, "hiredate");
			return (Criteria) this;
		}

		public Criteria andHiredateNotBetween(Date value1, Date value2) {
			addCriterion("employee.hireDate not between", value1, value2, "hiredate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateIsNull() {
			addCriterion("employee.terminationDate is null");
			return (Criteria) this;
		}

		public Criteria andTerminationdateIsNotNull() {
			addCriterion("employee.terminationDate is not null");
			return (Criteria) this;
		}

		public Criteria andTerminationdateEqualTo(Date value) {
			addCriterion("employee.terminationDate =", value, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateNotEqualTo(Date value) {
			addCriterion("employee.terminationDate <>", value, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateGreaterThan(Date value) {
			addCriterion("employee.terminationDate >", value, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateGreaterThanOrEqualTo(Date value) {
			addCriterion("employee.terminationDate >=", value, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateLessThan(Date value) {
			addCriterion("employee.terminationDate <", value, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateLessThanOrEqualTo(Date value) {
			addCriterion("employee.terminationDate <=", value, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateIn(List<Date> values) {
			addCriterion("employee.terminationDate in", values, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateNotIn(List<Date> values) {
			addCriterion("employee.terminationDate not in", values, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateBetween(Date value1, Date value2) {
			addCriterion("employee.terminationDate between", value1, value2, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andTerminationdateNotBetween(Date value1, Date value2) {
			addCriterion("employee.terminationDate not between", value1, value2, "terminationdate");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIsNull() {
			addCriterion("employee.createdById is null");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIsNotNull() {
			addCriterion("employee.createdById is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidEqualTo(Integer value) {
			addCriterion("employee.createdById =", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotEqualTo(Integer value) {
			addCriterion("employee.createdById <>", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidGreaterThan(Integer value) {
			addCriterion("employee.createdById >", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee.createdById >=", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidLessThan(Integer value) {
			addCriterion("employee.createdById <", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidLessThanOrEqualTo(Integer value) {
			addCriterion("employee.createdById <=", value, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidIn(List<Integer> values) {
			addCriterion("employee.createdById in", values, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotIn(List<Integer> values) {
			addCriterion("employee.createdById not in", values, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidBetween(Integer value1, Integer value2) {
			addCriterion("employee.createdById between", value1, value2, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedbyidNotBetween(Integer value1, Integer value2) {
			addCriterion("employee.createdById not between", value1, value2, "createdbyid");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNull() {
			addCriterion("employee.createdTime is null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNotNull() {
			addCriterion("employee.createdTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeEqualTo(Date value) {
			addCriterion("employee.createdTime =", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotEqualTo(Date value) {
			addCriterion("employee.createdTime <>", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThan(Date value) {
			addCriterion("employee.createdTime >", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("employee.createdTime >=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThan(Date value) {
			addCriterion("employee.createdTime <", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
			addCriterion("employee.createdTime <=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIn(List<Date> values) {
			addCriterion("employee.createdTime in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotIn(List<Date> values) {
			addCriterion("employee.createdTime not in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeBetween(Date value1, Date value2) {
			addCriterion("employee.createdTime between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
			addCriterion("employee.createdTime not between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andModifybyidIsNull() {
			addCriterion("employee.modifyById is null");
			return (Criteria) this;
		}

		public Criteria andModifybyidIsNotNull() {
			addCriterion("employee.modifyById is not null");
			return (Criteria) this;
		}

		public Criteria andModifybyidEqualTo(Integer value) {
			addCriterion("employee.modifyById =", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotEqualTo(Integer value) {
			addCriterion("employee.modifyById <>", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidGreaterThan(Integer value) {
			addCriterion("employee.modifyById >", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee.modifyById >=", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidLessThan(Integer value) {
			addCriterion("employee.modifyById <", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidLessThanOrEqualTo(Integer value) {
			addCriterion("employee.modifyById <=", value, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidIn(List<Integer> values) {
			addCriterion("employee.modifyById in", values, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotIn(List<Integer> values) {
			addCriterion("employee.modifyById not in", values, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidBetween(Integer value1, Integer value2) {
			addCriterion("employee.modifyById between", value1, value2, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifybyidNotBetween(Integer value1, Integer value2) {
			addCriterion("employee.modifyById not between", value1, value2, "modifybyid");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIsNull() {
			addCriterion("employee.modifyDateTime is null");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIsNotNull() {
			addCriterion("employee.modifyDateTime is not null");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeEqualTo(Date value) {
			addCriterion("employee.modifyDateTime =", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotEqualTo(Date value) {
			addCriterion("employee.modifyDateTime <>", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeGreaterThan(Date value) {
			addCriterion("employee.modifyDateTime >", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("employee.modifyDateTime >=", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeLessThan(Date value) {
			addCriterion("employee.modifyDateTime <", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeLessThanOrEqualTo(Date value) {
			addCriterion("employee.modifyDateTime <=", value, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeIn(List<Date> values) {
			addCriterion("employee.modifyDateTime in", values, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotIn(List<Date> values) {
			addCriterion("employee.modifyDateTime not in", values, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeBetween(Date value1, Date value2) {
			addCriterion("employee.modifyDateTime between", value1, value2, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andModifydatetimeNotBetween(Date value1, Date value2) {
			addCriterion("employee.modifyDateTime not between", value1, value2, "modifydatetime");
			return (Criteria) this;
		}

		public Criteria andVersionIsNull() {
			addCriterion("employee.version is null");
			return (Criteria) this;
		}

		public Criteria andVersionIsNotNull() {
			addCriterion("employee.version is not null");
			return (Criteria) this;
		}

		public Criteria andVersionEqualTo(Boolean value) {
			addCriterion("employee.version =", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotEqualTo(Boolean value) {
			addCriterion("employee.version <>", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThan(Boolean value) {
			addCriterion("employee.version >", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThanOrEqualTo(Boolean value) {
			addCriterion("employee.version >=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThan(Boolean value) {
			addCriterion("employee.version <", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThanOrEqualTo(Boolean value) {
			addCriterion("employee.version <=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionIn(List<Boolean> values) {
			addCriterion("employee.version in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotIn(List<Boolean> values) {
			addCriterion("employee.version not in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionBetween(Boolean value1, Boolean value2) {
			addCriterion("employee.version between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotBetween(Boolean value1, Boolean value2) {
			addCriterion("employee.version not between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("employee.password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("employee.password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("employee.password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("employee.password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("employee.password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("employee.password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("employee.password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("employee.password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("employee.password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("employee.password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("employee.password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("employee.password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("employee.password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("employee.password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andIsadminIsNull() {
			addCriterion("employee.isAdmin is null");
			return (Criteria) this;
		}

		public Criteria andIsadminIsNotNull() {
			addCriterion("employee.isAdmin is not null");
			return (Criteria) this;
		}

		public Criteria andIsadminEqualTo(Integer value) {
			addCriterion("employee.isAdmin =", value, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminNotEqualTo(Integer value) {
			addCriterion("employee.isAdmin <>", value, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminGreaterThan(Integer value) {
			addCriterion("employee.isAdmin >", value, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee.isAdmin >=", value, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminLessThan(Integer value) {
			addCriterion("employee.isAdmin <", value, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminLessThanOrEqualTo(Integer value) {
			addCriterion("employee.isAdmin <=", value, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminIn(List<Integer> values) {
			addCriterion("employee.isAdmin in", values, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminNotIn(List<Integer> values) {
			addCriterion("employee.isAdmin not in", values, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminBetween(Integer value1, Integer value2) {
			addCriterion("employee.isAdmin between", value1, value2, "isadmin");
			return (Criteria) this;
		}

		public Criteria andIsadminNotBetween(Integer value1, Integer value2) {
			addCriterion("employee.isAdmin not between", value1, value2, "isadmin");
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