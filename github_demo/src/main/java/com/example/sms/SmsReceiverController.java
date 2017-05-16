package com.example.sms;

import java.util.Iterator;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsReceiverController {

//	@RequestMapping(value = "/sendsms", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE,
//			MediaType.APPLICATION_JSON_VALUE })
//	public Sms sendSms(@RequestBody(required = false) Sms smsDetails) {
//		System.out.println(smsDetails);MultiValueMap
//		return smsDetails;
//	}
	
	@RequestMapping(value = "/sendsms", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public MultiValueMap<String, String> sendSms(@RequestBody MultiValueMap<String, String> smsDetails) {
		System.out.println(smsDetails.toString());
		System.out.println(smsDetails.get("AccountSid"));
		System.out.println(smsDetails.get("From"));
		System.out.println(smsDetails.get("To"));
		System.out.println(smsDetails.get("Body"));
		System.out.println(smsDetails.get("MessageSid"));
		System.out.println(smsDetails.get("FromCountry"));
		return smsDetails;
	}
	
}
