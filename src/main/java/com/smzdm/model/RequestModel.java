package com.smzdm.model;

import java.io.Serializable;

public class RequestModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8236443966905397436L;

	private String order_no;

	private String amount;
	private String appid;
	private String channel;
	private String currency;
	private String client_ip;
	private String subject;
	private String body;

	@Override
	public String toString() {
		return "{" + "order_no:" + order_no

				+ ", amount:" + amount + ",appid:" + appid + ",channel:" + channel

				+ ",currency:" + currency + ",client_ip:" + client_ip + ",subject:" + subject + ",body:" + body

				+ "}";

	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getClient_ip() {
		return client_ip;
	}

	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
