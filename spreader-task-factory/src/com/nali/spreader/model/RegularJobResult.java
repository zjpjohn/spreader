package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class RegularJobResult extends BaseModel implements Serializable {
    private static final long serialVersionUID = -7580330168655198933L;
    public static final Integer STATUS_INIT = 0;
    public static final Integer STATUS_SUCCESS = 1;
    public static final Integer STATUS_FAIL = 2;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_regular_job_result.id
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_regular_job_result.job_id
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    private Long jobId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_regular_job_result.start_time
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    private Date startTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_regular_job_result.end_time
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    private Date endTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_regular_job_result.status
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    private Integer status;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_regular_job_result.result
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    private String result;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_regular_job_result.id
     *
     * @return the value of spreader.tb_regular_job_result.id
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_regular_job_result.id
     *
     * @param id the value for spreader.tb_regular_job_result.id
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_regular_job_result.job_id
     *
     * @return the value of spreader.tb_regular_job_result.job_id
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_regular_job_result.job_id
     *
     * @param jobId the value for spreader.tb_regular_job_result.job_id
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_regular_job_result.start_time
     *
     * @return the value of spreader.tb_regular_job_result.start_time
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_regular_job_result.start_time
     *
     * @param startTime the value for spreader.tb_regular_job_result.start_time
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_regular_job_result.end_time
     *
     * @return the value of spreader.tb_regular_job_result.end_time
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_regular_job_result.end_time
     *
     * @param endTime the value for spreader.tb_regular_job_result.end_time
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_regular_job_result.status
     *
     * @return the value of spreader.tb_regular_job_result.status
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_regular_job_result.status
     *
     * @param status the value for spreader.tb_regular_job_result.status
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_regular_job_result.result
     *
     * @return the value of spreader.tb_regular_job_result.result
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_regular_job_result.result
     *
     * @param result the value for spreader.tb_regular_job_result.result
     *
     * @ibatorgenerated Wed Mar 21 15:07:47 CST 2012
     */
    public void setResult(String result) {
        this.result = result;
    }
}