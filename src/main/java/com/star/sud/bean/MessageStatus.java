package com.star.sud.bean;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.Message.Status;

public class MessageStatus {

	// Unique Identifier of the Resource
	private String sid;
	private Message.Status status;

	// Constructors
	//////////////////
	/**
	 * @param sid
	 * @param status
	 */
	public MessageStatus(String sid, Status status) {
		super();
		this.sid = sid;
		this.status = status;
	}

	// Properties
	///////////////
	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return the status
	 */
	public Message.Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Message.Status status) {
		this.status = status;
	}

}
