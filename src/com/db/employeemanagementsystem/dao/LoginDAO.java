package com.db.employeemanagementsystem.dao;

import com.db.employeemanagementsystem.bean.LoginBean;

// main purpose of interface is to declare the contracts
// and we declare contracts by implementing the interfaces

public interface LoginDAO {
	
	public boolean authentication (LoginBean login);
}
