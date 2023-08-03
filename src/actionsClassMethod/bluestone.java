package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/"); 
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement targetCoins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		  Actions act = new Actions(driver);
		  act.moveToElement(targetCoins).perform();
		  
		     driver.findElement(By.xpath("//span[(text()='1 gram'and (@data-p='gold)]")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//div[contains(@class,'filter 1gms')]")).click();
	}

}
