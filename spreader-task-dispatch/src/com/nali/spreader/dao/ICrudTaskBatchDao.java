package com.nali.spreader.dao;

import com.nali.spreader.model.TaskBatch;
import com.nali.spreader.model.TaskBatchExample;
import java.util.List;

public interface ICrudTaskBatchDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    int countByExample(TaskBatchExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    int deleteByExample(TaskBatchExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    void insert(TaskBatch record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    void insertSelective(TaskBatch record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    List<TaskBatch> selectByExample(TaskBatchExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    TaskBatch selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    int updateByExampleSelective(TaskBatch record, TaskBatchExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    int updateByExample(TaskBatch record, TaskBatchExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    int updateByPrimaryKeySelective(TaskBatch record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Thu Sep 08 17:04:26 CST 2011
     */
    int updateByPrimaryKey(TaskBatch record);
}
