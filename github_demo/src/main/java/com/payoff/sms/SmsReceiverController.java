package com.payoff.sms;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsReceiverController {
	
	@RequestMapping(value = "/receivesms", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public HttpStatus sendSms(@RequestBody MultiValueMap<String, String> smsDetails) {
		System.out.println(smsDetails.toString());
		System.out.println(smsDetails.getFirst("AccountSid"));
		System.out.println(smsDetails.getFirst("From"));
		System.out.println(smsDetails.getFirst("To"));
		System.out.println(smsDetails.getFirst("Body"));
		System.out.println(smsDetails.getFirst("MessageSid"));
		System.out.println(smsDetails.getFirst("FromCountry"));
		return HttpStatus.OK;
	}
	
//	@RequestMapping(value = "/sendsms", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE,
//	MediaType.APPLICATION_JSON_VALUE })
//public Sms sendSms(@RequestBody(required = false) Sms smsDetails) {
//System.out.println(smsDetails);MultiValueMap
//return smsDetails;
//}
	
}
