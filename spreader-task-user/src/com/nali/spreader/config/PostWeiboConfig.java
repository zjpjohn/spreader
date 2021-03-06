package com.nali.spreader.config;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import com.nali.spreader.dto.PostWeiboContentDto;
import com.nali.spreader.factory.config.desc.PropertyDescription;

/**
 * 发微博策略配置
 * 
 * @author xiefei
 * 
 */
public class PostWeiboConfig implements Serializable {

	private static final long serialVersionUID = -2026989726899802843L;
	// 默认发送间隔
	public static final int DEFAULT_INTERVAL = 5;
	// 默认发帖数量
	public static final int DEFAULT_POSTNUM_GTE = 1;
	public static final int DEFAULT_POSTNUM_LTE = 5;
	// 默认新鲜度为2天前(分钟)
	public static final int DEFAULT_EFFTIME = 2880;
	@PropertyDescription("关键字")
	private List<String> keywords;
	@PropertyDescription("分类")
	private List<String> categories;
	@PropertyDescription("新鲜度(分钟)")
	private Integer effective;
	@PropertyDescription("是否包含图片")
	private Boolean isPic;
	@PropertyDescription("是否包含音频")
	private Boolean isAudio;
	@PropertyDescription("是否包含视频")
	private Boolean isVideo;
	@PropertyDescription("@数量")
	private Range<Integer> atCount;
	@PropertyDescription("内容长度")
	private Range<Integer> contentLength;
	@PropertyDescription("操作的微博数")
	private Range<Integer> postNumber;
	@PropertyDescription("发送间隔(分钟)")
	private Integer postInterval;
	@PropertyDescription("加v类型")
	private Integer vType;
	@PropertyDescription("粉丝数")
	private Range<Long> fans;
	@PropertyDescription("文章数")
	private Range<Long> articles;
	@PropertyDescription("转发数")
	private Range<Integer> refCount;
	@PropertyDescription("回复数")
	private Range<Integer> replyCount;

	public PostWeiboContentDto getPostWeiboContentDto(Long[] keywords, Long[] uids) {
		PostWeiboContentDto query = new PostWeiboContentDto();
		query.setKeywords(keywords);
		if(uids!=null) {
			query.setUids(uids);
		}
		// 是否图片
		query.setIsPic(this.getIsPic());
		// 是否音频
		query.setIsAudio(this.getIsAudio());
		// 是否视频
		query.setIsVideo(this.getIsVideo());
		// 内容长度
		query.setContentLength(this.getContentLength());
		// 处理内容的新鲜度,发布时间
		Integer effTime = this.getEffective();
		if (effTime == null) {
			effTime = PostWeiboConfig.DEFAULT_EFFTIME;
		}
		Range<Date> pubDate = new Range<Date>();
		pubDate.setGte(DateUtils.addMinutes(new Date(), -1 * effTime));
		query.setPubDate(pubDate);
		query.setRefCount(this.getRefCount());
		query.setReplyCount(this.getReplyCount());
		return query;
	}

	public Range<Integer> getRefCount() {
		return refCount;
	}

	public void setRefCount(Range<Integer> refCount) {
		this.refCount = refCount;
	}

	public Range<Integer> getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(Range<Integer> replyCount) {
		this.replyCount = replyCount;
	}

	public Range<Integer> getContentLength() {
		return contentLength;
	}

	public void setContentLength(Range<Integer> contentLength) {
		this.contentLength = contentLength;
	}

	public Integer getPostInterval() {
		return postInterval;
	}

	public void setPostInterval(Integer postInterval) {
		this.postInterval = postInterval;
	}

	public Integer getvType() {
		return vType;
	}

	public void setvType(Integer vType) {
		this.vType = vType;
	}

	public Range<Long> getFans() {
		return fans;
	}

	public void setFans(Range<Long> fans) {
		this.fans = fans;
	}

	public Range<Long> getArticles() {
		return articles;
	}

	public void setArticles(Range<Long> articles) {
		this.articles = articles;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public Integer getEffective() {
		return effective;
	}

	public void setEffective(Integer effective) {
		this.effective = effective;
	}

	public Range<Integer> getAtCount() {
		return atCount;
	}

	public void setAtCount(Range<Integer> atCount) {
		this.atCount = atCount;
	}

	public Boolean getIsPic() {
		return isPic;
	}

	public void setIsPic(Boolean isPic) {
		this.isPic = isPic;
	}

	public Boolean getIsAudio() {
		return isAudio;
	}

	public void setIsAudio(Boolean isAudio) {
		this.isAudio = isAudio;
	}

	public Boolean getIsVideo() {
		return isVideo;
	}

	public void setIsVideo(Boolean isVideo) {
		this.isVideo = isVideo;
	}

	public Range<Integer> getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(Range<Integer> postNumber) {
		this.postNumber = postNumber;
	}
}
