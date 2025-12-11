package selinumassign2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class numofanchor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://lms2.ece.saveetha.in/");
		driver.manage().window().maximize();
		List<WebElement> href=driver.findElements(By.tagName("a"));
		System.out.println("number of <a> tags :" +href.size());
		
	}

}