package com.topscode.firebasedatabase;

public class Person {
    String fname;
    String lname;
    String email;
    String gender;
    String mobileNo;
    String Password;

    public Person(String fname, String lname, String email, String gender, String mobileNo, String password) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.gender = gender;
        this.mobileNo = mobileNo;
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}
