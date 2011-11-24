package com.nali.spreader.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googlecode.sardine.DavResource;
import com.googlecode.sardine.Sardine;
import com.googlecode.sardine.SardineFactory;
import com.googlecode.sardine.util.SardineException;
import com.nali.spreader.dao.ICrudPhotoDao;
import com.nali.spreader.service.IAvatarFileManageService;

@Service
public class AvatarFileManageSeriveImpl implements IAvatarFileManageService {
	private static final Logger LOGGER = Logger
			.getLogger(AvatarFileManageSeriveImpl.class);
	// 时间格式化
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	// 性别分类
	private final String GENDER_MALE = "男";
	private final String GENDER_FEMALE = "女";
	private final String GENDER_GENERAL = "通用";
	@Autowired
	private ICrudPhotoDao photoDao;

	public static void main(String arge[]) throws IOException {
		AvatarFileManageSeriveImpl afs = new AvatarFileManageSeriveImpl();
		// afs.initCreatePhotoFileDirectory(new Date(), 10);
		// afs.createTypeFileDir("");
		// String webDav =
		// "http://192.168.3.61:8080/slide/files/20111124/male/other/";
		// String webDav ="http://192.168.3.61:8080/slide/files/20111124/";
		// Sardine sardine = SardineFactory.begin();
		// if(sardine.exists(webDav)) {
		// System.out.println("文件夹存在");
		// }else {
		// sardine.createDirectory(webDav);
		// }
		// List<DavResource> resources = sardine.getResources(webDav);
		// for (DavResource res : resources) {
		// System.out.println(res);
		// }
		// InputStream is = new FileInputStream(new File("d://20111122//"));
		// sardine.put(webDav, is);
		// byte[] data = FileUtils.readFileToByteArray(new
		// File("D://webdav//20111122"));
		// sardine.put("http://192.168.3.61:8080/slide/files/Koala.jpg", data);
		// sardine.copy("http://192.168.3.61:8080/slide/files/test.txt",
		// "http://192.168.3.61:8080/slide/files/test2.txt");
	}

	@Override
	public Map<Object, Object> getPropertiesMap(String url) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		InputStream is = AvatarFileManageSeriveImpl.class
				.getResourceAsStream(url);
		try {
			if (is != null) {
				Properties prop = new Properties();
				prop.load(is);
				Set<Entry<Object, Object>> set = prop.entrySet();
				for (Entry<Object, Object> entry : set) {
					map.put(entry.getKey(), entry.getValue());
				}
			} else {
				LOGGER.info("InputStream为空,请检查配置文件");
			}
		} catch (Exception e) {
			LOGGER.info("未能读取头像类别配置文件", e);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					LOGGER.info(e);
				}
			}
		}
		return map;
	}

	/**
	 * 创建一套空目录结构
	 * 
	 * @param serviceUrl
	 */
	private void createTypeFileDir(String serviceUrl) {
		// 获取头像分类的配置文件信息
		Map<Object, Object> maleTypeMap = getPropertiesMap("/avatarconfig/malePhotoType.properties");
		Map<Object, Object> femaleTypeMap = getPropertiesMap("/avatarconfig/femalePhotoType.properties");
		Map<Object, Object> generalTypeMap = getPropertiesMap("/avatarconfig/generalPhotoType.properties");
		try {
			Sardine sardine = SardineFactory.begin();
			if (!sardine.exists(serviceUrl)) {
				sardine.createDirectory(serviceUrl);
				// 男性
				StringBuffer maleBuff = new StringBuffer(serviceUrl);
				// 女性
				StringBuffer femaleBuff = new StringBuffer(serviceUrl);
				// 通用
				StringBuffer generalBuff = new StringBuffer(serviceUrl);

				maleBuff.append(GENDER_MALE).append("/");
				if (!sardine.exists(maleBuff.toString())) {
					sardine.createDirectory(maleBuff.toString());
				}
				createPhotoTypeDir(sardine, maleTypeMap, maleBuff);

				femaleBuff.append(GENDER_FEMALE).append("/");
				if (!sardine.exists(femaleBuff.toString())) {
					sardine.createDirectory(femaleBuff.toString());
				}
				createPhotoTypeDir(sardine, femaleTypeMap, femaleBuff);

				generalBuff.append(GENDER_GENERAL).append("/");
				if (!sardine.exists(generalBuff.toString())) {
					sardine.createDirectory(generalBuff.toString());
				}
				createPhotoTypeDir(sardine, generalTypeMap, generalBuff);
			} else {
				LOGGER.info(serviceUrl + "已经创建,继续检查下一级目录");
				// 男性
				StringBuffer maleBuff = new StringBuffer(serviceUrl);
				// 女性
				StringBuffer femaleBuff = new StringBuffer(serviceUrl);
				// 通用
				StringBuffer generalBuff = new StringBuffer(serviceUrl);

				maleBuff.append(GENDER_MALE).append("/");
				if (!sardine.exists(maleBuff.toString())) {
					sardine.createDirectory(maleBuff.toString());
				}
				createPhotoTypeDir(sardine, maleTypeMap, maleBuff);

				femaleBuff.append(GENDER_FEMALE).append("/");
				if (!sardine.exists(femaleBuff.toString())) {
					sardine.createDirectory(femaleBuff.toString());
				}
				createPhotoTypeDir(sardine, femaleTypeMap, femaleBuff);

				generalBuff.append(GENDER_GENERAL).append("/");
				if (!sardine.exists(generalBuff.toString())) {
					sardine.createDirectory(generalBuff.toString());
				}
				createPhotoTypeDir(sardine, generalTypeMap, generalBuff);
			}
		} catch (Exception e) {
			LOGGER.info("创建失败", e);
		}
	}

	/**
	 * 创建类型子路径
	 * 
	 * @param sardine
	 * @param tmap
	 * @param dir
	 */
	private void createPhotoTypeDir(Sardine sardine, Map<Object, Object> tmap,
			StringBuffer dir) {
		Set<Object> set = tmap.keySet();
		String tmpdir = dir.toString();
		try {
			for (Object o : set) {
				String type = tmap.get(o.toString()).toString();
				String dirStr = new StringBuffer(tmpdir).append(type)
						.append("/").toString();
				if (!sardine.exists(dirStr)) {
					sardine.createDirectory(dirStr);
					LOGGER.info("创建路径:" + dirStr);
				}
			}
		} catch (SardineException e) {
			LOGGER.error("创建头像类型失败", e);
		}

	}

	/**
	 * 获取某一日期后i天的所有日期集合
	 * 
	 * @param date
	 * @param i
	 * @return
	 */
	private List<String> findFileDateList(Date date, Integer i) {
		if (date == null)
			date = new Date();
		if (i <= 0)
			i = 10;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		List<String> dateList = new ArrayList<String>();
		// 包括当天
		dateList.add(sdf.format(cal.getTime()));
		for (int k = 0; k < i - 1; k++) {
			cal.add(Calendar.DATE, 1);
			String sdate = sdf.format(cal.getTime());
			dateList.add(sdate);
		}
		return dateList;
	}

	@Override
	public void initCreatePhotoFileDirectory(Date date, Integer k) {
		// 获取初始化日期集合
		List<String> dateList = findFileDateList(date, k);
		// 获取webdav的配置文件信息
		Map<Object, Object> serviceMap = getPropertiesMap("/webDavService.properties");
		// 提取服务器地址
		String webDav = serviceMap.get("url").toString();
		long start = System.currentTimeMillis();
		LOGGER.info("开始创建头像库目录--------->");
		if (dateList.size() > 0) {
			for (String sdt : dateList) {
				StringBuffer buff = new StringBuffer(webDav);
				buff.append(sdt).append("/");
				createTypeFileDir(buff.toString());
			}
		} else {
			LOGGER.info("获取日期的集合为空，初始化失败");
		}
		long end = (System.currentTimeMillis() - start) / 1000;
		LOGGER.info("头像库目录创建结束,耗时:" + end + "s");
	}

	private void syncAvatarFileData() throws SardineException {
		String webDav = "http://192.168.3.61:8080/slide/files/20111124/";
		Sardine sardine = SardineFactory.begin();
		List<DavResource> davres = sardine.getResources(webDav);
		for (DavResource dav : davres) {

		}
	}
}
