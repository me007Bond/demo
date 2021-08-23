package com.test1.aa.TestOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver;
    	WebDriverManager.chromedriver().setup();
    	driver =new ChromeDriver();
    	
    	driver.get("https://www.google.com/?gws_rd=ssl");
    	driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
    
    }
}
