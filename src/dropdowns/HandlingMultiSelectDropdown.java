package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/WCSA5/MultipleSelectDropdown.html");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiselectDD);
		sel.selectByIndex(1);
		sel.selectByVisibleText("Paani Puri");
		sel.selectByValue("v5");	
	
	}
}
