package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业免押额度申请初始化
 *
 * @author auto create
 * @since 1.0, 2018-03-16 13:47:36
 */
public class ZhimaCreditEpFreedepositInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6517331692365699999L;

	/**
	 * 业务场景，生活号：SHENGHUOHAO
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 法人证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 法人证件类型，大陆身份证：IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 类目
	 */
	@ApiField("credit_category")
	private String creditCategory;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业证件类型：
NATIONAL_LEGAL---工商注册号
NATIONAL_LEGAL_MERGE---社会统一信用代码
	 */
	@ApiField("ep_cert_type")
	private String epCertType;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 商户业务流水号，确保每次业务唯一。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 法人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 企业免押额度申请产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizChannel() {
		return this.bizChannel;
	}
	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCreditCategory() {
		return this.creditCategory;
	}
	public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpCertType() {
		return this.epCertType;
	}
	public void setEpCertType(String epCertType) {
		this.epCertType = epCertType;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
