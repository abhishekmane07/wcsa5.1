package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {

 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=6i520li5u84ep");
		
		//new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(null))
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(null))
	
		driver.findElement(By.xpath("//div[text()='Settings']/ancesetor::a")).click();
		
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("UploadNewLogoOption")).click();
		
		
	}

}
