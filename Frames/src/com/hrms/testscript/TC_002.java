package com.hrms.testscript;

import com.hrms.lib.General;

public class TC_002 {
public static void main (String args[])throws Exception {
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.switchtoframe();
	obj.addemp();
	obj.exitframe();
	obj.logout();
	obj.closeApplication();
}
}
