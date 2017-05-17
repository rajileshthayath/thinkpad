package com.payoff.sms.utils;

import com.payoff.twilio.Twilio;

public class SendSmsThread extends Thread {
	
	private String mTo;
	private String mBody;
	
	public SendSmsThread(String to, String body) {
		this.mTo = to;
		this.mBody = body;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
			
			Twilio.getInstance().sendSms(mTo, mBody);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
