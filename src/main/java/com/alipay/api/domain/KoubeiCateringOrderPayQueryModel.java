package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单支付结果查询
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:28:54
 */
public class KoubeiCateringOrderPayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1511762567211412775L;

	/**
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	public String getOutPayNo() {
		return this.outPayNo;
	}
	public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

}
