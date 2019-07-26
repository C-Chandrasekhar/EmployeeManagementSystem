package com.db.employeemanagementsystem.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.dao.LoginDAOImpl;

class LoginServiceImplTest {

	@Test
	void testAuthenticate() {
		LoginBean login = new LoginBean("sherlock", "221b");
		LoginServiceImpl loginService = new LoginServiceImpl();

		Assertions.assertEquals ( loginService.authenticate(login) , false );
		
	}

}
