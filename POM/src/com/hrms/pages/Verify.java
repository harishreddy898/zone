package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.tility.Baseclass;

public class Verify extends Baseclass{
	public static void verify(String title) {
		if (drive.getTitle().equals(title)){
			Reporter.log(drive.getTitle());
			Reporter.log("title matched");
		}else {
			Reporter.log("title not Matched ");
			Reporter.log(drive.getTitle());
			
		}
	}
}
