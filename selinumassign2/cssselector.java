package selinumassign2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://life.saveetha.com/");
		driver.findElement(By.cssSelector("#txtusername")).sendKeys("212222240019");
		driver.findElement(By.cssSelector("#txtpassword")).sendKeys("Myselfbharath001");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btnLogin")).click();
		System.out.println("login success");
		
}
}