package multiplewindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shettytest {
  @Test
  public void shetty() throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    String parentWindow = driver.getWindowHandle(); 

	    driver.findElement(By.id("openwindow")).click();
	    Set<String> allWindows = driver.getWindowHandles();
	    for (String win : allWindows) {
	        if (!win.equals(parentWindow)) {
	            driver.switchTo().window(win);  
	            Thread.sleep(2000);
	            driver.close();                   
	        }
	    }
	    driver.switchTo().window(parentWindow);
	    driver.findElement(By.id("opentab")).click();
	    Thread.sleep(2000);
	    Set<String> allTabs = driver.getWindowHandles();

	    for (String tab : allTabs) {
	        if (!tab.equals(parentWindow)) {
	            driver.switchTo().window(tab); 
	            Thread.sleep(2000);
	        }
	    }

	    driver.switchTo().window(parentWindow);   

	    System.out.println("Test Completed!");

	    driver.quit();

	    
		

	}
	

  }
