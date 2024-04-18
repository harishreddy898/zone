package com.hrms.link;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import com.hrms.Utility.Log;

public class General extends Global {
 public void open() {
	 drive = new ChromeDriver();
	 drive.get(url);
	
 }
 public void close () throws Exception {
	 drive.findElement(By.linkText(logout_link)).click();
	 Thread.sleep(2000);
	 drive.quit();
 }
 public void login() {
	 drive.findElement(By.name(txt_Username)).sendKeys("nareshit");
	 drive.findElement(By.name(txt_pass)).sendKeys("nareshit");
	 drive.findElement(By.name(login_btn)).click();
	 Log.info("login completed");
	 
 }
 public void job() {
	 Actions ac = new Actions(drive);
	 ac.moveToElement(drive.findElement(By.linkText(lnk_Admin))).perform();
	 ac.moveToElement(drive.findElement(By.linkText(lnk_job))).perform();
	 drive.findElement(By.linkText(lnk_jobttl)).click();
	 drive.switchTo().frame("rightMenu");
	 drive.findElement(By.name(selectid)).click();
	Select sc = new Select(drive.findElement(By.name(selectid)));
	sc.selectByVisibleText("ID");
	drive.findElement(By.name(srchfr)).sendKeys("JOB003");
	drive.findElement(By.xpath("//input[@value ='Search']")).click();
	drive.switchTo().defaultContent();
	Log.info("misson proxcicuted");
 }
 public void location() throws Exception{
	 Actions ac = new Actions(drive);
	 ac.moveToElement(drive.findElement(By.linkText(lnk_Admin))).perform();
	 ac.moveToElement(drive.findElement(By.linkText(lnk_Company))).perform();
	drive.findElement(By.linkText(lnk_loc)).click();
	 drive.switchTo().frame("rightMenu");
	 drive.findElement(By.name(chekbox)).click();
	 Thread.sleep(2000);

	 drive.findElement(By.xpath(Dltbtn)).click();
	 Thread.sleep(1000);

	 Alert al = drive.switchTo().alert();
	 Thread.sleep(2000);

	 al.dismiss();
	 Thread.sleep(2000);
		drive.switchTo().defaultContent();
Log.info("loacation tressed");
	 
 }
 
}
