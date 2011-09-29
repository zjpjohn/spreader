package com.nali.spreader.dao;

import com.nali.spreader.model.ActionStep;
import com.nali.spreader.model.ActionStepExample;
import java.util.List;

public interface ICrudActionStepDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int countByExample(ActionStepExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int deleteByExample(ActionStepExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    void insert(ActionStep record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    void insertSelective(ActionStep record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    List<ActionStep> selectByExampleWithBLOBs(ActionStepExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    List<ActionStep> selectByExampleWithoutBLOBs(ActionStepExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    ActionStep selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int updateByExampleSelective(ActionStep record, ActionStepExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int updateByExampleWithBLOBs(ActionStep record, ActionStepExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int updateByExampleWithoutBLOBs(ActionStep record, ActionStepExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int updateByPrimaryKeySelective(ActionStep record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int updateByPrimaryKeyWithBLOBs(ActionStep record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_action_step
     *
     * @ibatorgenerated Thu Aug 04 16:40:11 CST 2011
     */
    int updateByPrimaryKeyWithoutBLOBs(ActionStep record);
}