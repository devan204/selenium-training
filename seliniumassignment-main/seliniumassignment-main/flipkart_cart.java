package seleniumassign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_cart {
    public static void main(String[] args)  {

    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();

    	driver.get("https://www.flipkart.com/");

    	driver.findElement(By.linkText("Cart")).click();

    	System.out.println("Clicked the Cart link");

    }
}