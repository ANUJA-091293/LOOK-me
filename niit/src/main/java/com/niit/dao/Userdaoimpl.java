package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Userinfom;

@Transactional
public class Userdaoimpl implements Userdao
 {
@Autowired
private SessionFactory session;
@SuppressWarnings({"unchecked","deprecation"})

@Override
public List<Userinfom> getAllproduct() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void insertUser(Userinfom u) {
	// TODO Auto-generated method stub
	
	session.getCurrentSession().persist(u);
	
}

@Override
public void updateUser(Userinfom u) {
	// TODO Auto-generated method stub
	
}

@Override
public Userinfom getUserID(int userid) {
	// TODO Auto-generated method stub
	return null;
}
	
}
