package com.nali.spreader.data;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeywordExample {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    public KeywordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    protected KeywordExample(KeywordExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Wed May 16 11:11:11 CST 2012
     */
    public static class Criteria {

        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0 || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return this;
        }

        public Criteria andTagEqualTo(Boolean value) {
            addCriterion("tag =", value, "tag");
            return this;
        }

        public Criteria andTagNotEqualTo(Boolean value) {
            addCriterion("tag <>", value, "tag");
            return this;
        }

        public Criteria andTagGreaterThan(Boolean value) {
            addCriterion("tag >", value, "tag");
            return this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag >=", value, "tag");
            return this;
        }

        public Criteria andTagLessThan(Boolean value) {
            addCriterion("tag <", value, "tag");
            return this;
        }

        public Criteria andTagLessThanOrEqualTo(Boolean value) {
            addCriterion("tag <=", value, "tag");
            return this;
        }

        public Criteria andTagIn(List<Boolean> values) {
            addCriterion("tag in", values, "tag");
            return this;
        }

        public Criteria andTagNotIn(List<Boolean> values) {
            addCriterion("tag not in", values, "tag");
            return this;
        }

        public Criteria andTagBetween(Boolean value1, Boolean value2) {
            addCriterion("tag between", value1, value2, "tag");
            return this;
        }

        public Criteria andTagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andExecutableIsNull() {
            addCriterion("executable is null");
            return this;
        }

        public Criteria andExecutableIsNotNull() {
            addCriterion("executable is not null");
            return this;
        }

        public Criteria andExecutableEqualTo(Boolean value) {
            addCriterion("executable =", value, "executable");
            return this;
        }

        public Criteria andExecutableNotEqualTo(Boolean value) {
            addCriterion("executable <>", value, "executable");
            return this;
        }

        public Criteria andExecutableGreaterThan(Boolean value) {
            addCriterion("executable >", value, "executable");
            return this;
        }

        public Criteria andExecutableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("executable >=", value, "executable");
            return this;
        }

        public Criteria andExecutableLessThan(Boolean value) {
            addCriterion("executable <", value, "executable");
            return this;
        }

        public Criteria andExecutableLessThanOrEqualTo(Boolean value) {
            addCriterion("executable <=", value, "executable");
            return this;
        }

        public Criteria andExecutableIn(List<Boolean> values) {
            addCriterion("executable in", values, "executable");
            return this;
        }

        public Criteria andExecutableNotIn(List<Boolean> values) {
            addCriterion("executable not in", values, "executable");
            return this;
        }

        public Criteria andExecutableBetween(Boolean value1, Boolean value2) {
            addCriterion("executable between", value1, value2, "executable");
            return this;
        }

        public Criteria andExecutableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("executable not between", value1, value2, "executable");
            return this;
        }

        public Criteria andAllowtagIsNull() {
            addCriterion("allowtag is null");
            return this;
        }

        public Criteria andAllowtagIsNotNull() {
            addCriterion("allowtag is not null");
            return this;
        }

        public Criteria andAllowtagEqualTo(Boolean value) {
            addCriterion("allowtag =", value, "allowtag");
            return this;
        }

        public Criteria andAllowtagNotEqualTo(Boolean value) {
            addCriterion("allowtag <>", value, "allowtag");
            return this;
        }

        public Criteria andAllowtagGreaterThan(Boolean value) {
            addCriterion("allowtag >", value, "allowtag");
            return this;
        }

        public Criteria andAllowtagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allowtag >=", value, "allowtag");
            return this;
        }

        public Criteria andAllowtagLessThan(Boolean value) {
            addCriterion("allowtag <", value, "allowtag");
            return this;
        }

        public Criteria andAllowtagLessThanOrEqualTo(Boolean value) {
            addCriterion("allowtag <=", value, "allowtag");
            return this;
        }

        public Criteria andAllowtagIn(List<Boolean> values) {
            addCriterion("allowtag in", values, "allowtag");
            return this;
        }

        public Criteria andAllowtagNotIn(List<Boolean> values) {
            addCriterion("allowtag not in", values, "allowtag");
            return this;
        }

        public Criteria andAllowtagBetween(Boolean value1, Boolean value2) {
            addCriterion("allowtag between", value1, value2, "allowtag");
            return this;
        }

        public Criteria andAllowtagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allowtag not between", value1, value2, "allowtag");
            return this;
        }
    }
}
