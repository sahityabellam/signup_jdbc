package com.sign_in;

public class signin1 {
private String name;
private long mobile_no;
private String gender;
private String dob;
private String gmail;
private String password;
private int age;
private long altmobile_no;
private String altgmail;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile_no() {
	return mobile_no;
}
public void setMobile_no(long mobile_no) {
	this.mobile_no = mobile_no;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public long getAltmobile_no() {
	return altmobile_no;
}
public void setAltmobile_no(long altmobile_no) {
	this.altmobile_no = altmobile_no;
}
public String getAltgmail() {
	return altgmail;
}
public void setAltgmail(String altgmail) {
	this.altgmail = altgmail;
}
public void dispdetails() {
	System.out.println("you name          :"+getName());
	System.out.println("your mobile no    :"+getMobile_no());
	System.out.println("your gender       :"+getGender());
	System.out.println("your dob          :"+getDob());
	System.out.println("your gmail        :"+getGmail());
	System.out.println("your password     :"+getPassword());
	System.out.println("your age          :"+getAge());
	System.out.println("your altmoblie_no :"+getAltmobile_no());
	System.out.println("your altgmail     :"+getAltgmail());
	
}	
}
