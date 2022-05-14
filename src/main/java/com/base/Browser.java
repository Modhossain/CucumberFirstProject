package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		open_browser();
	}
	
	public static WebDriver dr;
	public static WebDriver open_browser() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return dr;
		
	}

}
