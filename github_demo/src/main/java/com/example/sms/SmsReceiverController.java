package com.example.sms;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsReceiverController {

	@RequestMapping(value = "/sendsms", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public Sms sendSms(@RequestBody(required = false) Sms smsDetails) {
		System.out.println(smsDetails);
		return smsDetails;
	}
}
