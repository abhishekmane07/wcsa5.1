package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // open the browser firefox //used upcasting -for the gernerlaisationd
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the omayoblogpost
		driver.get("http://omayo.blogspot.com/");
		// to get the address of current or parent window
		
		 String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		 
		 // to launch child window
		 
		 driver.findElement(By.partialLinkText("Open a popup window")).click();
		 
		 Thread.sleep(2000);

	}

}
