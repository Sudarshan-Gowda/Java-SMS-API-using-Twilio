package com.star.sud.twilio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.star.sud.bean.MessageDetails;
import com.star.sud.bean.MessageStatus;
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSSenderUtil implements Serializable{

	private static final long serialVersionUID = 5938122443730672877L;
	
	private static final String ACCOUNT_SID = "AC234567893456789456";
	private static final String AUTH_TOKEN = "12345654323456";
	private static final String PHONE_NUMBER_FROM = "+18123456";

	public static MessageStatus sendMessage(String phoneNumberTo, String content) throws Exception {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(new PhoneNumber(phoneNumberTo), // to
				new PhoneNumber(PHONE_NUMBER_FROM), content).create();
		System.out.println(message.getSid());
		return new MessageStatus(message.getSid(), message.getStatus());
	}

	public static MessageDetails getMessageDetailsBySid(String sid) throws Exception {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message fetch = Message.fetcher(sid).fetch();
		return new MessageDetails(sid, fetch.getFrom().getEndpoint(), fetch.getTo(), fetch.getStatus().name(),
				fetch.getBody(), fetch.getDateSent(), fetch.getPrice(),
				fetch.getPriceUnit().getCurrencyCode().toString());

	}

	public static List<MessageDetails> getAllMessageDetails() throws Exception {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		List<MessageDetails> meDetails = new ArrayList<MessageDetails>();
		ResourceSet<Message> read = Message.reader().read();
		for (Message fetch : read)
			meDetails.add(new MessageDetails(fetch.getSid(), fetch.getFrom().getEndpoint(), fetch.getTo(),
					fetch.getStatus().name(), fetch.getBody(), fetch.getDateSent(), fetch.getPrice(),
					fetch.getPriceUnit().getCurrencyCode().toString()));
		return meDetails;

	}

}
