package com.nali.spreader.dao;

import com.nali.spreader.model.WebHeaders;
import com.nali.spreader.model.WebHeadersExample;
import java.util.List;

public interface ICrudWebHeadersDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int countByExample(WebHeadersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int deleteByExample(WebHeadersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    void insert(WebHeaders record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    void insertSelective(WebHeaders record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    List selectByExample(WebHeadersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    WebHeaders selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int updateByExampleSelective(WebHeaders record, WebHeadersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int updateByExample(WebHeaders record, WebHeadersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int updateByPrimaryKeySelective(WebHeaders record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_web_headers
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int updateByPrimaryKey(WebHeaders record);
}
