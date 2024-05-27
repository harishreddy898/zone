package com.hrms.pages;
import org.openqa.selenium.By;

import com.hrms.tility.Baseclass;
public class Loginpage extends Baseclass{
static By txt_username = By.name("txtUserName");
static By txt_password = By.name("txtPassword");
static By btn_login = By.name("Submit");

public static void login(String un,String pw) {
	drive.findElement(txt_username).sendKeys(un);
	drive.findElement(txt_password).sendKeys(pw);
	drive.findElement(btn_login).click();
}

}
