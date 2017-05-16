package com.example.sms;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "response")
public class Sms {

	private String accountSid;
	private String from;
	private String to;
	private String body;
	private long timeStamp = System.currentTimeMillis();
	private String messageSid;
	
	public Sms(String accountSid, String from, String to, String body, long timeStamp, String messageSid) {
		super();
		this.accountSid = accountSid;
		this.from = from;
		this.to = to;
		this.body = body;
		this.timeStamp = timeStamp;
		this.messageSid = messageSid;
	}

	public String getMessageSid() {
		return messageSid;
	}

	public void setMessageSid(String msgeSid) {
		messageSid = msgeSid;
	}

	public String getAccountSid() {
		return accountSid;
	}

	public void setAccountSid(String accSid) {
		accountSid = accSid;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String fm) {
		from = fm;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String toNum) {
		to = toNum;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String msgBody) {
		body = msgBody;
	}

	public Sms() {
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Sms [accountSid=" + accountSid + ", from=" + from + ", to=" + to + ", body=" + body + ", timeStamp="
				+ timeStamp + ", messageSid=" + messageSid + "]";
	}

}
