package com.nali.spreader.dao;

import com.nali.spreader.data.Notice;
import com.nali.spreader.data.NoticeExample;
import java.util.List;

public interface ICrudNoticeDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    int countByExample(NoticeExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    int deleteByExample(NoticeExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    Long insert(Notice record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    Long insertSelective(Notice record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    List<Notice> selectByExample(NoticeExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    Notice selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    int updateByExampleSelective(Notice record, NoticeExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    int updateByExample(Notice record, NoticeExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    int updateByPrimaryKeySelective(Notice record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_notice
     *
     * @ibatorgenerated Wed Jul 04 15:20:21 CST 2012
     */
    int updateByPrimaryKey(Notice record);
}
