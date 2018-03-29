package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游优惠信息获取
 *
 * @author auto create
 * @since 1.0, 2018-01-25 21:09:36
 */
public class AlipayOverseasTravelPromotionGetModel extends AlipayObject {

	private static final long serialVersionUID = 1762175626271226939L;

	/**
	 * 蚂蚁LBS基础设施定义的商圈码列表
	 */
	@ApiListField("biz_area_codes")
	@ApiField("string")
	private List<String> bizAreaCodes;

	/**
	 * 多端统一渠道信息，与服务提供方协商分配，为空则默认取appId
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 蚂蚁LBS基础设施定义的城市码列表
	 */
	@ApiListField("city_codes")
	@ApiField("string")
	private List<String> cityCodes;

	/**
	 * ISO-3166标准三位数据国家码列表
	 */
	@ApiListField("country_codes")
	@ApiField("string")
	private List<String> countryCodes;

	/**
	 * 纬度，double类型，有效区间[-90, 90]
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地理位置反查级别枚举：支持国家（COUNTRY）、城市（CITY）、商圈（BIZ_AREA），表示从指定级别开始向上级反查，直到定位成功。默认：商圈（BIZ_AREA）
	 */
	@ApiField("lbs_reverse_level")
	private String lbsReverseLevel;

	/**
	 * 经度，double类型，有效区间[-180, 180]
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 分页数，从1开始，默认为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，最小为1，默认为3
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 搜索半径，与经纬度配合使用，单独传递无效。单位：米，默认不指定
	 */
	@ApiField("radius")
	private Long radius;

	/**
	 * 置顶券id列表，该列表中的券将被置顶返回，顺序与入参顺序一致，如果券状态非法，则默认丢弃
	 */
	@ApiListField("top_promotion_ids")
	@ApiField("string")
	private List<String> topPromotionIds;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持集团havanaId和支付宝2088开头的16位数字ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id类型枚举，与user_id配合使用。取值说明：HAVANA为集团havanaId，ALIPAY为支付宝2088开头用户id
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public List<String> getBizAreaCodes() {
		return this.bizAreaCodes;
	}
	public void setBizAreaCodes(List<String> bizAreaCodes) {
		this.bizAreaCodes = bizAreaCodes;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public List<String> getCityCodes() {
		return this.cityCodes;
	}
	public void setCityCodes(List<String> cityCodes) {
		this.cityCodes = cityCodes;
	}

	public List<String> getCountryCodes() {
		return this.countryCodes;
	}
	public void setCountryCodes(List<String> countryCodes) {
		this.countryCodes = countryCodes;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLbsReverseLevel() {
		return this.lbsReverseLevel;
	}
	public void setLbsReverseLevel(String lbsReverseLevel) {
		this.lbsReverseLevel = lbsReverseLevel;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
	}

	public List<String> getTopPromotionIds() {
		return this.topPromotionIds;
	}
	public void setTopPromotionIds(List<String> topPromotionIds) {
		this.topPromotionIds = topPromotionIds;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}
