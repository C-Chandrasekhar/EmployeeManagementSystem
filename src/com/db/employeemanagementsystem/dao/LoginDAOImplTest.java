package com.db.employeemanagementsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;

class LoginDAOImplTest {
	
	
	@Test
	void testAuthentication() {
		
		LoginBean login = new LoginBean("sherlock", "221b");
		LoginDAOImpl loginDAOImpl = new LoginDAOImpl();

		Assertions.assertEquals ( loginDAOImpl.authentication(login) , false );
		
		
	}

}
