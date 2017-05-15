package com.example.sms;

public class Sms {
	
	private String msg;
	private String transactionId;
	private long timeStamp = System.currentTimeMillis();

	public Sms(){
	
	}
	
	public Sms(String msg, String transactionId) {
		super();
		this.msg = msg;
		this.transactionId = transactionId;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Sms [msg=" + msg + ", transactionId=" + transactionId + ", timeStamp=" + timeStamp + "]";
	}
	
}
