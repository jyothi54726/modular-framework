package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class General extends Global{
	
	public void openapplication() {
		driver=new FirefoxDriver();
		driver.navigate().to(url);
	}
	
	public void closebrowser() {
		driver.quit();
	}
	
	public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
	}
	
	public void addemp() {
		System.out.println("adding new emp");
	}
	
	public void delemp() {
		System.out.println("delete emp");
	}
}
