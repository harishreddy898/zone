package com.hrms.pages;

import org.openqa.selenium.By;

import com.hrms.tility.Baseclass;

public class Logoutpage extends Baseclass{
	static By txt_logout = By.linkText("Logout");
  public static void logout() {
	 drive.findElement(txt_logout).click();
  }
}
