package com.nali.spreader.data;

import com.nali.common.model.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class AccountLog extends BaseModel implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_account_log.id
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_account_log.op_name
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    private String opName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_account_log.url
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    private String url;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_account_log.params
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    private String params;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_account_log.create_time
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    private Date createTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_account_log.account_id
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    private String accountId;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_account_log.id
     *
     * @return the value of spreader.tb_account_log.id
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_account_log.id
     *
     * @param id the value for spreader.tb_account_log.id
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_account_log.op_name
     *
     * @return the value of spreader.tb_account_log.op_name
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public String getOpName() {
        return opName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_account_log.op_name
     *
     * @param opName the value for spreader.tb_account_log.op_name
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public void setOpName(String opName) {
        this.opName = opName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_account_log.url
     *
     * @return the value of spreader.tb_account_log.url
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_account_log.url
     *
     * @param url the value for spreader.tb_account_log.url
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_account_log.params
     *
     * @return the value of spreader.tb_account_log.params
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_account_log.params
     *
     * @param params the value for spreader.tb_account_log.params
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_account_log.create_time
     *
     * @return the value of spreader.tb_account_log.create_time
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_account_log.create_time
     *
     * @param createTime the value for spreader.tb_account_log.create_time
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_account_log.account_id
     *
     * @return the value of spreader.tb_account_log.account_id
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_account_log.account_id
     *
     * @param accountId the value for spreader.tb_account_log.account_id
     *
     * @ibatorgenerated Thu Feb 21 13:45:38 CST 2013
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
