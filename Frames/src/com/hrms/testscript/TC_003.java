package com.hrms.testscript;

import com.hrms.lib.General;

public class TC_003 {
public static void main (String args[]) throws Exception{
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.switchtoframe();
	obj.addemp();
	obj.edit();
	obj.exitframe();
	obj.logout();
	obj.closeApplication();
}
}
