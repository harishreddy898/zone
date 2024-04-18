package com.hrms.testscript;

import com.hrms.lib.General;

public class TC004 {
public static void main(String args[]) throws Exception{
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.switchtoframe();
	obj.selectempid();
	obj.checkboxanddlt();
	obj.exitframe();
	Thread.sleep(2000);
	obj.logout();
	Thread.sleep(2000);

	obj.closeApplication();
}
}
