package com.niit.dao;

import java.util.List;
import com.niit.model.*;

public interface Userdao {
	public List<Userinfom> getAllproduct();
	public void insertUser(Userinfom u);
	public void updateUser(Userinfom u);
	public Userinfom getUserID(int userid);
}

