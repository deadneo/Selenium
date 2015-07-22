package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMainClass  {
	//WebDriver driver = new FirefoxDriver();
    public static void main(String[] args) {
       
    	WebDriver driver2 = new FirefoxDriver();
    	boolean temp = testcheck(driver2);
        if (temp)
        {
        	System.out.println("Passed");
        }else
        {
        	System.out.println("Failed");
        }
    	
    }
    
    public static boolean testcheck(WebDriver driver)
    {
    	
    	driver.get("http://127.0.0.1");
 
    	String res = driver.getTitle();
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    	
        
        if (res.toLowerCase().startsWith("проблема"))
        {
        	return true;
        }else
        {
        	return false;
        }
    }
    
    
}


