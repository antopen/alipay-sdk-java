package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询广告接口
 *
 * @author auto create
 * @since 1.0, 2018-03-14 14:15:32
 */
public class KoubeiMarketingAdvertisingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5142435774123344544L;

	/**
	 * 广告Id，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

}
