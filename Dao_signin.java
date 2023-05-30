package com.sign_in;

import java.sql.*;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao_signin extends validation_signin {
public Dao_signin(String store) {
		super(store);
	}

public static void main(String[] args) {
	boolean q=true;
	signin1 s=new signin1();
	String store = null;
	validation_signin s2=new validation_signin(store);
	System.out.println("1.enter the name 2.enter the mobile_no 3.enter the gender 4.enter the password 5.enter the dob 6.enter the age 7.enter the gmail 8.enter the alt_gmail 9.enter the alt_mobileno");
	while(q)
	{
		String f=sc.next();
		switch(f) {
		case "1":
			System.out.println("enter the name");
			s2.validateName(sc.next());
			String name12=s.getName();
			System.out.println("2.for mobile_no \n 3.for gender \n 4.for password \n 5.for Dob \n 6.for age \n 7.for gmail \n 8.for alt_gmail \n 9.for Alt_mobl_no");
			break;
		case "2":
			System.out.println("enter the mobile_no");
			s2.validateMobile(sc.nextLong ()); 
			long mb1no1=s.getMobile_no();
			System.out.println("3.for gender 4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case "3":
//			System.out.println("choose the gender");
//			System.out.println("select the gender");
//			System.out.println("click a.for MALE");1
//			System.out.println("click b.for FEMALE");
//			System.out.println("click c.for OTHERS");
			System.out.println("enter the gender");
			s2.validateGender(sc.next()); 
			//String gender1= s.getGender();
			System.out.println("4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;

		case "4":
			System.out.println("enter the password");
			s2.validatePassword(sc.next()); 
			String password1= s.getPassword();
			System.out.println("5.for Dob 6.for age 7.for gamil 8.for Alt_gmail 9.for Alt_mblno");
			break;

		case"5":
			System.out.println("enter the dob");
			s2.validateDob(sc.next());
			String dob1=s.getDob();
			System.out.println("6.for age 7. for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case"6":
			System.out.println("enter the age");
			s2.validateAge(sc.nextInt());
			int  age1=s.getAge();
			System.out.println("7. for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case"7":
			System.out.println("enter the gmail");
			s2.validateGmail(sc.next());
			String gmail1=s.getGmail();
			System.out.println("8.for Alt_gmail 9.for Alt_mblno");
			break;
		case"8":
			System.out.println("enter the Alt_gmail");
			s2.validateAlternate_gmail(sc.next());
			String alt_gmail=s.getAltgmail();
			System.out.println("9.for Alt_mblno");
			break;
		case "9":
			System.out.println("enter the Alt_mblno");
			s2.validateAlternate_mobileno(sc.nextLong());
			long alt_mobno1=s.getAltmobile_no();
			q=false;
			default:
				System.out.println("choose correct one");
			}
	}
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin1", "root", "root");
		PreparedStatement p=con.prepareStatement("insert into datastorage values (?,?,?,?,?,?,?,?,?)");
//	String name=s.getName();
//\\		long mblno=s.getMobile_no();
//\\		String gender=s.getGender();
//\\		String paswrd=s.getPassword();
//\\		String dob=s.getDob();
//\\		int age=s.getAge();
//\\		String gmail=s.getGmail();
//\\		String alt_gmail=s.getAltgmail();
//\\		long alt_mblno=s.getAltmobile_no();
		p.setLong(1,s1.getMobile_no());
		p.setString(2,s1.getName());
		p.setString(3,s1.getGender());
		p.setString(4,s1.getPassword());
		p.setString(5,s1.getDob());
		p.setInt(6,s1.getAge());
		p.setString(7,s1.getGmail());
		p.setString(8,s1.getAltgmail());
		p.setLong(9,s1.getAltmobile_no());
		p.executeUpdate();
	}
	catch(ClassNotFoundException  |  SQLException e)
	{
		e.printStackTrace();
		
	}
	if(con!=null) {
		try {
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	System.out.println("row inserted succesfully");
}
}
