package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		// to identify webElement we use locators
		driver.findElement(By.id("id_userLoginId")).sendKeys("abhi@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//button")).sendKeys("dare@gmail.com");
		
	

	}

}
