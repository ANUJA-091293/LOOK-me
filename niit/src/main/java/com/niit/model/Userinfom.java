package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userinfom {
	@Id
private int user_id;
private String user_name;
private String user_mail;
private long contact_no;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_mail() {
	return user_mail;
}
public void setUser_mail(String user_mail) {
	this.user_mail = user_mail;
}
public long getContact_no() {
	return contact_no;
}
public void setContact_no(long contact_no) {
	this.contact_no = contact_no;
}

}
