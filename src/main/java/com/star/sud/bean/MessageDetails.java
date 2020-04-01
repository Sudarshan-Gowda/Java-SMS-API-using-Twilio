package com.star.sud.bean;

import org.joda.time.DateTime;

public class MessageDetails {

	// Attributes
	/////////////////
	private String sid;
	private String from;
	private String to;
	private String status;
	private String message;
	private DateTime dateSent;
	private String price;
	private String priceUnit;

	/**
	 * @param sid
	 * @param from
	 * @param to
	 * @param status
	 * @param message
	 * @param dateSent
	 * @param price
	 * @param priceUnit
	 */
	public MessageDetails(String sid, String from, String to, String status, String message, DateTime dateSent,
			String price, String priceUnit) {
		super();
		this.sid = sid;
		this.from = from;
		this.to = to;
		this.status = status;
		this.message = message;
		this.dateSent = dateSent;
		this.price = price;
		this.priceUnit = priceUnit;
	}

	// Properties
	//////////////////
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
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the dateSent
	 */
	public DateTime getDateSent() {
		return dateSent;
	}

	/**
	 * @param dateSent the dateSent to set
	 */
	public void setDateSent(DateTime dateSent) {
		this.dateSent = dateSent;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the priceUnit
	 */
	public String getPriceUnit() {
		return priceUnit;
	}

	/**
	 * @param priceUnit the priceUnit to set
	 */
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

}
