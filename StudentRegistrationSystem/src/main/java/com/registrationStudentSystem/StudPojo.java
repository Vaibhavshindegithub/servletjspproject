package com.registrationStudentSystem;

public class StudPojo {
	private int id;
   private	String fname,sname,address,email;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "StudPojo [id=" + id + ", fname=" + fname + ", sname=" + sname + ", address=" + address + ", email=" + email
			+ "]";
}
}
