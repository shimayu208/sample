package jp.macs.workweb.domain.entity.bibleManage.pullpush;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FoldersCriteria {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public FoldersCriteria() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andFolderIdIsNull() {
			addCriterion("folder_id is null");
			return (Criteria) this;
		}

		public Criteria andFolderIdIsNotNull() {
			addCriterion("folder_id is not null");
			return (Criteria) this;
		}

		public Criteria andFolderIdEqualTo(Integer value) {
			addCriterion("folder_id =", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdNotEqualTo(Integer value) {
			addCriterion("folder_id <>", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdGreaterThan(Integer value) {
			addCriterion("folder_id >", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("folder_id >=", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdLessThan(Integer value) {
			addCriterion("folder_id <", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdLessThanOrEqualTo(Integer value) {
			addCriterion("folder_id <=", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdIn(List<Integer> values) {
			addCriterion("folder_id in", values, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdNotIn(List<Integer> values) {
			addCriterion("folder_id not in", values, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdBetween(Integer value1, Integer value2) {
			addCriterion("folder_id between", value1, value2, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdNotBetween(Integer value1, Integer value2) {
			addCriterion("folder_id not between", value1, value2, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderNameIsNull() {
			addCriterion("folder_name is null");
			return (Criteria) this;
		}

		public Criteria andFolderNameIsNotNull() {
			addCriterion("folder_name is not null");
			return (Criteria) this;
		}

		public Criteria andFolderNameEqualTo(String value) {
			addCriterion("folder_name =", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotEqualTo(String value) {
			addCriterion("folder_name <>", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameGreaterThan(String value) {
			addCriterion("folder_name >", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameGreaterThanOrEqualTo(String value) {
			addCriterion("folder_name >=", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameLessThan(String value) {
			addCriterion("folder_name <", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameLessThanOrEqualTo(String value) {
			addCriterion("folder_name <=", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameLike(String value) {
			addCriterion("folder_name like", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotLike(String value) {
			addCriterion("folder_name not like", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameIn(List<String> values) {
			addCriterion("folder_name in", values, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotIn(List<String> values) {
			addCriterion("folder_name not in", values, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameBetween(String value1, String value2) {
			addCriterion("folder_name between", value1, value2, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotBetween(String value1, String value2) {
			addCriterion("folder_name not between", value1, value2, "folderName");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (Criteria) this;
		}

		public Criteria andCreateDateEqualTo(Date value) {
			addCriterionForJDBCDate("create_date =", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("create_date <>", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThan(Date value) {
			addCriterionForJDBCDate("create_date >", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("create_date >=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThan(Date value) {
			addCriterionForJDBCDate("create_date <", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("create_date <=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateIn(List<Date> values) {
			addCriterionForJDBCDate("create_date in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("create_date not in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table folders
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table folders
     *
     * @mbg.generated do_not_delete_during_merge Sun Jan 22 15:04:47 JST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}