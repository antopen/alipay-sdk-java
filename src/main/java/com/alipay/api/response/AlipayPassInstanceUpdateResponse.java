package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.instance.update response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-14 18:20:33
 */
public class AlipayPassInstanceUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3581567296926323185L;

	/** 
	 * 接口调用返回结果信息
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
