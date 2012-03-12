package com.nali.spreader.dao;

import com.nali.spreader.model.ClientError;
import com.nali.spreader.model.ClientErrorExample;
import java.util.List;

public interface ICrudClientErrorDao {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int countByExample(ClientErrorExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int deleteByExample(ClientErrorExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int deleteByPrimaryKey(Long taskId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    void insert(ClientError record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    void insertSelective(ClientError record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    List<ClientError> selectByExampleWithBLOBs(ClientErrorExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    List<ClientError> selectByExampleWithoutBLOBs(ClientErrorExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    ClientError selectByPrimaryKey(Long taskId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int updateByExampleSelective(ClientError record, ClientErrorExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int updateByExampleWithBLOBs(ClientError record, ClientErrorExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int updateByExampleWithoutBLOBs(ClientError record, ClientErrorExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int updateByPrimaryKeySelective(ClientError record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int updateByPrimaryKeyWithBLOBs(ClientError record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_client_error
     *
     * @ibatorgenerated Thu Mar 08 18:39:02 CST 2012
     */
    int updateByPrimaryKeyWithoutBLOBs(ClientError record);
}