
// all services should have a interface and its implementation
// all interface name should ends with a service and implementaion with Impl

package com.db.employeemanagementsystem.service;

import com.db.employeemanagementsystem.bean.LoginBean;

public interface LoginService {
	public boolean authenticate(LoginBean login);
}
