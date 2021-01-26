package com.crmbank.testcases.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\webDriverBinaries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedtitle = "Facebook – Log in or sign up\r\n";
		String actualTitle = driver.getTitle();
		if (expectedtitle.equals(actualTitle)) {
			System.out.println("Title is as expected");
		} else {
			System.out.println(String.format("Title is not matching ---expected is:%s but actual is : %s",expectedtitle,actualTitle ));
		}
        System.out.println(actualTitle);
        System.out.println(" my name is ");
		driver.quit();

	}

}
