package com.nali.spreader.dao;


import java.util.List;

import com.nali.spreader.model.IpRecord;
import com.nali.spreader.model.IpRecordExample;

public interface ICrudIpRecordDao {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    int countByExample(IpRecordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    int deleteByExample(IpRecordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    Long insert(IpRecord record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    Long insertSelective(IpRecord record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    List<IpRecord> selectByExample(IpRecordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    IpRecord selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    int updateByExampleSelective(IpRecord record, IpRecordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    int updateByExample(IpRecord record, IpRecordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    int updateByPrimaryKeySelective(IpRecord record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_ip_record
     *
     * @ibatorgenerated Fri Sep 07 13:47:33 CST 2012
     */
    int updateByPrimaryKey(IpRecord record);
}