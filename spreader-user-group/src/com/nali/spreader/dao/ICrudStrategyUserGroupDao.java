package com.nali.spreader.dao;

import java.util.List;

import com.nali.spreader.model.StrategyUserGroup;
import com.nali.spreader.model.StrategyUserGroupExample;

public interface ICrudStrategyUserGroupDao {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    int countByExample(StrategyUserGroupExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    int deleteByExample(StrategyUserGroupExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    int deleteByPrimaryKey(Long sid);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    void insert(StrategyUserGroup record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    void insertSelective(StrategyUserGroup record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    List<StrategyUserGroup> selectByExample(StrategyUserGroupExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    StrategyUserGroup selectByPrimaryKey(Long sid);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    int updateByExampleSelective(StrategyUserGroup record, StrategyUserGroupExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    int updateByExample(StrategyUserGroup record, StrategyUserGroupExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    int updateByPrimaryKeySelective(StrategyUserGroup record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_strategy_user_group
     *
     * @ibatorgenerated Fri Jan 13 17:58:00 CST 2012
     */
    int updateByPrimaryKey(StrategyUserGroup record);
}