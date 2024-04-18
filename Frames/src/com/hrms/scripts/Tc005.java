package com.hrms.scripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.link.General;

public class Tc005 {
//public static void main (String args[]) {
	@Test
	public void tc005() throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
	General gn = new General();
	gn.open();
	gn.login();
	gn.job();
	gn.close();
}
}
