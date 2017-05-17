package com.payoff.twilio;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;

public class Twilio {
	private final String Live_Auth_Token = "418831bd7e7374132aae0d153100f732";
	private final String Live_Account_Sid = "AC7fb5a88c6c53b90532445f36bb72baa8";
	
	private final String Test_Account_Sid = "ACdc9f971fd8dbaf2e79565105e37c6975";
	private final String Test_Auth_Token = "a235fb01c20635a42298caac462bda04";
	private static Twilio sInstance;
	private TwilioRestClient mClient;
	
	private Twilio() {
		mClient = new TwilioRestClient(Live_Account_Sid, Live_Auth_Token);
	}
	
	public static Twilio getInstance() {
		if (sInstance == null) {
			sInstance = new Twilio();
		}
		return sInstance;
	}
	
	public boolean sendSms(String to, String body) {
		//mClient
		//mClient.getHttpClient().execute(arg0, arg1)
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		   params.add(new BasicNameValuePair("To", to));
		   params.add(new BasicNameValuePair("From", "+18583751782"));
		   params.add(new BasicNameValuePair("Body", body));
//		   params.add(new BasicNameValuePair("MediaUrl", "https://c1.staticflickr.com/3/2899/14341091933_1e92e62d12_b.jpg"));

		   MessageFactory messageFactory = mClient.getAccount().getMessageFactory();
		   System.out.println(params.toString());
		   try {
			Message message = messageFactory.create(params);
			System.out.println(message.getBody());
		} catch (TwilioRestException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
