package com.nali.spreader.dao;

import java.util.Date;
import java.util.List;

import com.nali.common.model.Limit;
import com.nali.spreader.dto.MarketTaskCount;
import com.nali.spreader.model.ClientReport;

public interface IClientReportDao {

	/**
	 * 查询几天前的客户端任务执行数量
	 * 
	 * @param taskDate
	 * @param clientId
	 * @param actionId
	 * @param appName
	 * @param limit
	 * @return
	 */
	List<ClientReport> queryClientTaskCount(Date taskDate, Long clientId, String actionId, String appName, Limit limit);

	/**
	 * 查询几天前的客户端任务执行数量_count
	 * 
	 * @param taskDate
	 * @param clientId
	 * @param actionId
	 * @param appName
	 * @return
	 */
	int countClientTaskCount(Date taskDate, Long clientId, String actionId, String appName);

	/**
	 * 查询所有市场执行情况
	 * @param days
	 * @param actionId
	 * @param appName
	 * @param limit
	 * @return
	 */
	List<MarketTaskCount> queryMarketTaskCount(Date days, String actionId, String appName, Limit limit);
	
	/**
	 * 查询所有市场执行情况_count
	 * @param days
	 * @param actionId
	 * @param appName
	 * @return
	 */
	int countMarketTaskCount(Date days, String actionId, String appName);
}
