package com.nali.spreader.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nali.common.pagination.PageResult;
import com.nali.common.util.CollectionUtils;
import com.nali.log.MessageLogger;
import com.nali.log.impl.LoggerFactory;
import com.nali.spreader.aop.annotation.AuthAnnotation;
import com.nali.spreader.controller.basectrl.BaseController;
import com.nali.spreader.factory.config.ConfigableType;
import com.nali.spreader.factory.config.IConfigService;
import com.nali.spreader.factory.config.desc.ConfigableInfo;
import com.nali.spreader.model.StrategyGroup;
import com.nali.spreader.service.IStrategyGroupService;

/**
 * 策略模块控制器，增加策略分组功能
 * 
 * @author xiefei
 * 
 */
@Controller
@RequestMapping(value = "/stggroup")
public class StrategyGroupManageController extends BaseController {
	@Autowired
	private IStrategyGroupService groupService;
	@Autowired
	private IConfigService<Long> regularConfigService;
	// 简单分组
	private static final Integer SIMPLE_GROUP_TYPE = 1;
	private static final MessageLogger logger = LoggerFactory
			.getLogger(StrategyGroupManageController.class);

	/**
	 * 初始化页面
	 * 
	 * @return
	 */
	public String init() {
		return "/show/main/StrategyGroupManageShow";
	}

	/**
	 * 分组列表的Store
	 * 
	 * @param groupName
	 * @param groupType
	 * @param start
	 * @param limit
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/groupgrid")
	public String groupGridStore(String groupName, Integer groupType,
			Integer start, Integer limit) {
		StrategyGroup sg = new StrategyGroup();
		sg.setGroupName(groupName);
		sg.setGroupType(groupType);
		PageResult<StrategyGroup> pr = groupService
				.findStrategyGroupPageResult(sg, this.initLimit(start, limit));
		int totalCount = pr.getTotalCount();
		List<ConfigableInfo> dispnamelist = regularConfigService
				.listConfigableInfo(ConfigableType.normal);
		List<StrategyGroup> sgList = transformGroupStore(pr.getList(),
				dispnamelist);
		Map<String, Object> dataMap = CollectionUtils.newHashMap(3);
		dataMap.put("totalCount", totalCount);
		dataMap.put("list", sgList);
		// dataMap.put("dispname", dispnamelist);
		return this.write(dataMap);
	}

	/**
	 * 转换分组显示列表
	 * 
	 * @param groupList
	 * @param dispnamelist
	 * @return
	 */
	private List<StrategyGroup> transformGroupStore(
			List<StrategyGroup> groupList, List<ConfigableInfo> dispnamelist) {
		if (groupList.size() > 0 && dispnamelist.size() > 0) {
			for (StrategyGroup sg : groupList) {
				Integer gType = sg.getGroupType();
				if (SIMPLE_GROUP_TYPE.equals(gType)) {
					String gName = sg.getGroupName();
					if (StringUtils.isNotEmpty(gName)) {
						for (ConfigableInfo cfg : dispnamelist) {
							String cfgname = cfg.getName();
							if (StringUtils.isNotEmpty(cfgname)) {
								if (cfgname.equals(gName)) {
									sg.setTransformName(cfg.getDisplayName());
								}
							}
						}
					}
				} else {
					sg.setTransformName(sg.getGroupName());
				}
			}
		}
		return groupList;
	}

	/**
	 * 删除策略组
	 * 
	 * @param gids
	 * @return
	 */
	@AuthAnnotation(opName = "策略分组>删除策略分组")
	@ResponseBody
	@RequestMapping(value = "/deletegroup")
	public String deleteStrategyGroup(Long[] gids) {
		Map<String, Boolean> result = CollectionUtils.newHashMap(1);
		result.put("success", false);
		if (gids.length > 0) {
			try {
				this.groupService.batRemoveStrategyGroup(gids);
				result.put("success", true);
			} catch (Exception e) {
				logger.error("删除失败", e);
			}
		}
		return this.write(result);
	}

	/**
	 * 更新分组说明
	 * 
	 * @param gid
	 * @param text
	 * @return
	 */
	@AuthAnnotation(opName = "策略分组>更新分组说明")
	@ResponseBody
	@RequestMapping(value = "/updatedesc")
	public String updateGroupNote(Long gid, String text) {
		int rows = this.groupService.updateGroupDescription(gid, text);
		return this.write(rows);
	}
}