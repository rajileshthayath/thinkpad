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
	private final String Auth_Token = "418831bd7e7374132aae0d153100f732";
	private final String Account_Sid = "AC7fb5a88c6c53b90532445f36bb72baa8";
	private static Twilio sInstance;
	private TwilioRestClient mClient;
	
	private Twilio() {
		mClient = new TwilioRestClient(Auth_Token, Account_Sid);
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
		   params.add(new BasicNameValuePair("To", "+919819069769"));
		   params.add(new BasicNameValuePair("From", "+PayOff"));
		   params.add(new BasicNameValuePair("Body", "This is the ship that made the Kessel Run in fourteen parsecs?"));
//		   params.add(new BasicNameValuePair("MediaUrl", "https://c1.staticflickr.com/3/2899/14341091933_1e92e62d12_b.jpg"));

		   MessageFactory messageFactory = mClient.getAccount().getMessageFactory();
		   try {
			Message message = messageFactory.create(params);
		} catch (TwilioRestException e) {
			e.printStackTrace();
		}
		return true;
	}

}
