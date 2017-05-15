package com.example.sms;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsReceiverController {

	@RequestMapping(value = "/sendsms", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Sms sendSms(@RequestBody Sms smsDetails) {
		System.out.println(smsDetails);
		return smsDetails;
	}
	
}
