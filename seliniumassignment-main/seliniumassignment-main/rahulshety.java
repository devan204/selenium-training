package seleniumassign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulshety {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

       
        driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
        System.out.println("Radio Button 2 selected");

        driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();  
        driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]")).click(); 
        System.out.println("Checkbox 1 and Checkbox 3 selected");


        
       
    }
}