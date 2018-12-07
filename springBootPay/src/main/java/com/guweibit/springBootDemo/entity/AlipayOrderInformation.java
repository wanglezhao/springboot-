package com.guweibit.springBootDemo.entity;

public class AlipayOrderInformation {
	private Integer outTradeNo;
	private String subject;
	private Integer totalAmount;
	private String body;
	private Integer status;
	
	
	@Override
	public String toString() {
		return "AlipayOrderInformation [outTradeNo=" + outTradeNo + ", subject=" + subject + ", totalAmount="
				+ totalAmount + ", body=" + body + ", status=" + status + "]";
	}
	public Integer getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(Integer outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
