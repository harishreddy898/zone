package com.hrms.tility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Baseclass {
	
 public static WebDriver drive;
 
 public static void openApplication() {
	 drive = new ChromeDriver();
	 drive.get("http://183.82.103.245/nareshit/login.php");
 }
 public static void closeApplication() {
	drive.close(); 
 }
}
