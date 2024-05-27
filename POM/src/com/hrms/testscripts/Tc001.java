package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Loginpage;
import com.hrms.pages.Logoutpage;
import com.hrms.pages.Verify;
import com.hrms.tility.Baseclass;

public class Tc001 {
@Test 
 public static void tc001() throws Exception{
	Baseclass.openApplication();
	Loginpage.login("nareshit", "nareshit");
	Thread.sleep(1000);
	Verify.verify("HRMS");
	Logoutpage.logout();
	Verify.verify("orange");
	Baseclass.closeApplication();
}
}
