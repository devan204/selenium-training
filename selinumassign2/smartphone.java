package selinumassign2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class smartphone {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("smart phone");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/button")).click();
		String phonename=driver.findElement(By.xpath("(//div[@class='RG5Slk'])[2]")).getText();
		System.out.println(phonename);
		
	}

}