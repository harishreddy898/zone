package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.chrome.ChromeDriver;
public class General extends Global{
public void openApplication() {
	drive = new ChromeDriver();
	drive.get(url);
}
public void closeApplication() {
	drive.quit();
}
public void login(){
	drive.findElement(By.name(txt_Username)).sendKeys(un);
drive.findElement(By.name(txt_pass)).sendKeys(pass);
drive.findElement(By.name(login_btn)).click();
	
}
public void switchtoframe() {
	drive.switchTo().frame(idframe);
}
public void addemp()throws Exception {
	drive.findElement(By.xpath(xpathAdd)).click();
	Thread.sleep(2000);
	drive.findElement(By.name(txt_1stname)).sendKeys(fstname);
	drive.findElement(By.name(txt_lastname)).sendKeys(lstname);
	Thread.sleep(2000);
	drive.findElement(By.xpath(savebtn)).click();
	Thread.sleep(2000);
}
public void edit() throws Exception{
	drive.findElement(By.id(editbtn)).click();
	Thread.sleep(2000);
	drive.findElement(By.name(txt_1stname)).clear();
	Thread.sleep(2000);
	drive.findElement(By.name(txt_lastname)).clear();
	Thread.sleep(2000);
	drive.findElement(By.name(txt_1stname)).sendKeys("charlie");
	Thread.sleep(2000);
	drive.findElement(By.name(txt_lastname)).sendKeys("chaplin");
	Thread.sleep(2000);

drive.findElement(By.xpath(savebtn));
Thread.sleep(2000);

}
public void selectempid()throws Exception {
	Select st = new Select(drive.findElement(By.name(searchby)));
	st.selectByVisibleText(txt_empid);
	Thread.sleep(2000);

	drive.findElement(By.name(txt_searchfor)).sendKeys(searchfor);
	Thread.sleep(2000);

	drive.findElement(By.xpath(searchbtn)).click();
}
public void checkboxanddlt()throws Exception {
	drive.findElement(By.name(checkbox)).click();
	Thread.sleep(2000);

	drive.findElement(By.xpath(deletebtn)).click();
}
public void exitframe() {
	drive.switchTo().defaultContent();
}
public void logout() {
	drive.findElement(By.linkText(logout_link)).click();
}
}
