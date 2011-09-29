package com.nali.spreader.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.spreader.dao.ICrudLoginConfigDao;
import com.nali.spreader.model.LoginConfig;
import com.nali.spreader.model.LoginConfigExample;

@Repository
public class CrudLoginConfigDao implements ICrudLoginConfigDao {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public CrudLoginConfigDao() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int countByExample(LoginConfigExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("spreader_tb_login_config.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int deleteByExample(LoginConfigExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_login_config.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int deleteByPrimaryKey(Long uid) {
        LoginConfig key = new LoginConfig();
        key.setUid(uid);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_login_config.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public void insert(LoginConfig record) {
        getSqlMapClientTemplate().insert("spreader_tb_login_config.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public void insertSelective(LoginConfig record) {
        getSqlMapClientTemplate().insert("spreader_tb_login_config.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    @SuppressWarnings("unchecked")
    public List<LoginConfig> selectByExampleWithBLOBs(LoginConfigExample example) {
        List<LoginConfig> list = getSqlMapClientTemplate().queryForList("spreader_tb_login_config.ibatorgenerated_selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    @SuppressWarnings("unchecked")
    public List<LoginConfig> selectByExampleWithoutBLOBs(LoginConfigExample example) {
        List<LoginConfig> list = getSqlMapClientTemplate().queryForList("spreader_tb_login_config.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public LoginConfig selectByPrimaryKey(Long uid) {
        LoginConfig key = new LoginConfig();
        key.setUid(uid);
        LoginConfig record = (LoginConfig) getSqlMapClientTemplate().queryForObject("spreader_tb_login_config.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int updateByExampleSelective(LoginConfig record, LoginConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_login_config.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int updateByExampleWithBLOBs(LoginConfig record, LoginConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_login_config.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int updateByExampleWithoutBLOBs(LoginConfig record, LoginConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_login_config.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int updateByPrimaryKeySelective(LoginConfig record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_login_config.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int updateByPrimaryKeyWithBLOBs(LoginConfig record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_login_config.ibatorgenerated_updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public int updateByPrimaryKeyWithoutBLOBs(LoginConfig record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_login_config.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_login_config
     *
     * @ibatorgenerated Mon Aug 15 10:24:48 CST 2011
     */
    private static class UpdateByExampleParms extends LoginConfigExample {
        private Object record;

        public UpdateByExampleParms(Object record, LoginConfigExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}