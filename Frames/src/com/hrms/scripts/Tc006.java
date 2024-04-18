package com.hrms.scripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.link.General;

public class Tc006 {
	@Test
	public void tc006() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		
		General gm = new General();
		gm.open();
		gm.login();
		gm.location();
		Reporter.log("till now");
		gm.close();
	}

}
