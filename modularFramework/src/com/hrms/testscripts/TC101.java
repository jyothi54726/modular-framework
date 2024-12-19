package com.hrms.testscripts;

import com.hrms.lib.*;

public class TC101 {

	public static void main(String[] args) throws Exception {
		General g= new General();
		g.openapplication();
		g.login();
		g.addemp();
		g.delemp();
		g.logout();
		g.closebrowser();
	}
}
