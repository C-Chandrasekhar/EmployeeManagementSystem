package com.db.employeemanagementsystem.service;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.dao.LoginDAO;
import com.db.employeemanagementsystem.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService{
 
	 
	LoginDAO loginDAO = new LoginDAOImpl();
	public boolean authenticate(LoginBean login) {
		return loginDAO.authentication(login);
		
	}

}
