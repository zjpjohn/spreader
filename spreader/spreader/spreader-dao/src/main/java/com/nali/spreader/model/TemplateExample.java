package com.nali.spreader.model;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateExample {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Sat Mar 12 17:16:39 CST 2011
     */
    public TemplateExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Sat Mar 12 17:16:39 CST 2011
     */
    protected TemplateExample(TemplateExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    protected List oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
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
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_template
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public static class Criteria {

        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0 || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
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
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdIn(List values) {
            addCriterion("template_id in", values, "templateId");
            return this;
        }

        public Criteria andTemplateIdNotIn(List values) {
            addCriterion("template_id not in", values, "templateId");
            return this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
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

        public Criteria andNameIn(List values) {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List values) {
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return this;
        }

        public Criteria andDescriptionIn(List values) {
            addCriterion("description in", values, "description");
            return this;
        }

        public Criteria andDescriptionNotIn(List values) {
            addCriterion("description not in", values, "description");
            return this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return this;
        }

        public Criteria andCeatedTimeIsNull() {
            addCriterion("ceated_time is null");
            return this;
        }

        public Criteria andCeatedTimeIsNotNull() {
            addCriterion("ceated_time is not null");
            return this;
        }

        public Criteria andCeatedTimeEqualTo(Date value) {
            addCriterion("ceated_time =", value, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeNotEqualTo(Date value) {
            addCriterion("ceated_time <>", value, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeGreaterThan(Date value) {
            addCriterion("ceated_time >", value, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ceated_time >=", value, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeLessThan(Date value) {
            addCriterion("ceated_time <", value, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("ceated_time <=", value, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeIn(List values) {
            addCriterion("ceated_time in", values, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeNotIn(List values) {
            addCriterion("ceated_time not in", values, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeBetween(Date value1, Date value2) {
            addCriterion("ceated_time between", value1, value2, "ceatedTime");
            return this;
        }

        public Criteria andCeatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("ceated_time not between", value1, value2, "ceatedTime");
            return this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("last_modified_time is null");
            return this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("last_modified_time is not null");
            return this;
        }

        public Criteria andLastModifiedTimeEqualTo(Date value) {
            addCriterion("last_modified_time =", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(Date value) {
            addCriterion("last_modified_time <>", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeGreaterThan(Date value) {
            addCriterion("last_modified_time >", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modified_time >=", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeLessThan(Date value) {
            addCriterion("last_modified_time <", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modified_time <=", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeIn(List values) {
            addCriterion("last_modified_time in", values, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeNotIn(List values) {
            addCriterion("last_modified_time not in", values, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("last_modified_time between", value1, value2, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modified_time not between", value1, value2, "lastModifiedTime");
            return this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("content_type is null");
            return this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_type is not null");
            return this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("content_type =", value, "contentType");
            return this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("content_type <>", value, "contentType");
            return this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("content_type >", value, "contentType");
            return this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("content_type >=", value, "contentType");
            return this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("content_type <", value, "contentType");
            return this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("content_type <=", value, "contentType");
            return this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("content_type like", value, "contentType");
            return this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("content_type not like", value, "contentType");
            return this;
        }

        public Criteria andContentTypeIn(List values) {
            addCriterion("content_type in", values, "contentType");
            return this;
        }

        public Criteria andContentTypeNotIn(List values) {
            addCriterion("content_type not in", values, "contentType");
            return this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("content_type between", value1, value2, "contentType");
            return this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("content_type not between", value1, value2, "contentType");
            return this;
        }

        public Criteria andMethodTypeIsNull() {
            addCriterion("method_type is null");
            return this;
        }

        public Criteria andMethodTypeIsNotNull() {
            addCriterion("method_type is not null");
            return this;
        }

        public Criteria andMethodTypeEqualTo(Integer value) {
            addCriterion("method_type =", value, "methodType");
            return this;
        }

        public Criteria andMethodTypeNotEqualTo(Integer value) {
            addCriterion("method_type <>", value, "methodType");
            return this;
        }

        public Criteria andMethodTypeGreaterThan(Integer value) {
            addCriterion("method_type >", value, "methodType");
            return this;
        }

        public Criteria andMethodTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("method_type >=", value, "methodType");
            return this;
        }

        public Criteria andMethodTypeLessThan(Integer value) {
            addCriterion("method_type <", value, "methodType");
            return this;
        }

        public Criteria andMethodTypeLessThanOrEqualTo(Integer value) {
            addCriterion("method_type <=", value, "methodType");
            return this;
        }

        public Criteria andMethodTypeIn(List values) {
            addCriterion("method_type in", values, "methodType");
            return this;
        }

        public Criteria andMethodTypeNotIn(List values) {
            addCriterion("method_type not in", values, "methodType");
            return this;
        }

        public Criteria andMethodTypeBetween(Integer value1, Integer value2) {
            addCriterion("method_type between", value1, value2, "methodType");
            return this;
        }

        public Criteria andMethodTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("method_type not between", value1, value2, "methodType");
            return this;
        }
    }
}
