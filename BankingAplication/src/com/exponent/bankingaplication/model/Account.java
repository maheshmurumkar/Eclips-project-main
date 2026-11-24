package com.exponent.bankingaplication.model;

public class Account {
	private int accNo;
	private String name;
	private long adharCardNo;
	private String panCardNo;
	private long contact;
	private String emailId;
	private double accBalance;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharCardNo() {
		return adharCardNo;
	}
	public void setAdharCardNo(long adharCardNo) {
		this.adharCardNo = adharCardNo;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Account Details\nAccNo       = " + accNo + ",\nName        = " + name + ",\nAdharCardNo = " + adharCardNo + ",\nPanCardNo   = "
				+ panCardNo + ",\nContact     = " + contact + ",\nEmailId     = " + emailId + ",\nAccBalance  = " + accBalance + "";
	}
	
	

}
