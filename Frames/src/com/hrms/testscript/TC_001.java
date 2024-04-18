package com.hrms.testscript;

import com.hrms.lib.General;

public class TC_001 {
public static void main (String args[])throws Exception {
	General obj = new General();
	obj.openApplication();
	obj.login();
	Thread.sleep(2000);
	obj.logout();
	Thread.sleep(2000);

	obj.closeApplication();
}
}
