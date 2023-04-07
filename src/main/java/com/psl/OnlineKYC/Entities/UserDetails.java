package com.psl.OnlineKYC.Entities;

public class UserDetails {
    private String userName;
    private int phoneNumber;
    private String aadhaarNumber;
    private String dob;
    private String emailID;
    private String address;

    public UserDetails(String userName, int phoneNumber, String aadhaarNumber, String dob, String emailID, String address) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.dob = dob;
        this.emailID = emailID;
        this.address = address;
    }
    public UserDetails(){
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
