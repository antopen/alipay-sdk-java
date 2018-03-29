package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠说明信息
 *
 * @author auto create
 * @since 1.0, 2018-03-19 19:29:51
 */
public class VoucherDescDetailModel extends AlipayObject {

	private static final long serialVersionUID = 3299665997884917354L;

	/**
	 * 优惠的说明信息
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 优惠的标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
