package tn.weinsure1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import tn.weinsure1.entities.Smsrequest;



@Service
public class Smsservice {

	private final Twilioproperties twilioproperties;
	
	@Autowired
	public Smsservice(Twilioproperties twilioproperties)
	{
		this.twilioproperties=twilioproperties;
	}
	
	//send message to number
	public String sendsms(Smsrequest smsrequest)
	{
     
		Message message=Message.creator(new PhoneNumber("+21699373588"), new PhoneNumber(twilioproperties.getFromNumber()), "Your transaction has been successfully done").create();
        return message.getStatus().toString();
        
	
	}
}