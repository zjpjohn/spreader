package com.nali.spreader.dao;

import com.nali.spreader.data.Keyword;
import com.nali.spreader.data.KeywordExample;
import java.util.List;

public interface ICrudKeywordDao {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    int countByExample(KeywordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    int deleteByExample(KeywordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    void insert(Keyword record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    void insertSelective(Keyword record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    List<Keyword> selectByExample(KeywordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    Keyword selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    int updateByExampleSelective(Keyword record, KeywordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    int updateByExample(Keyword record, KeywordExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    int updateByPrimaryKeySelective(Keyword record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_keyword
     *
     * @ibatorgenerated Mon Apr 23 15:44:11 CST 2012
     */
    int updateByPrimaryKey(Keyword record);
}