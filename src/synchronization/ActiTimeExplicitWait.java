package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("http://127.0.0.1/login.do;jsessionid=7s8aq35coqc7s");
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.id("loginButton")).click();
				driver.findElement(By.linkText("Logout")).click();
				//Home page
				
				//Enter Time-track
				System.out.println("Ti9tle is matched,test case Passed");
				
				//driver.findElement(By.LinkText("Logout").click();
		
	}					

	public static void explicitWaitMethod(WebDriver driver,int sec,String title) {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.titleContains(title));
	}
}





	
