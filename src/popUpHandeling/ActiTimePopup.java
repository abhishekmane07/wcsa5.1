package popUpHandeling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimePopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // open the browser firefox //used upcasting -for the gernerlaisationd
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the ActiTime
		driver.get("http://127.0.0.1/login.do;jsessionid=1lec102fsedpl");

		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));

		// perform login operation
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);

		// homepage
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		Thread.sleep(1000);
		// click on setting Module..
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		Thread.sleep(1000);
		// click on logo and color
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		// click on use custom logo
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(1000);
		// click on button to select the file
		// driver.findElement(By.name("formCustomInterfaceLogo.logo")).click();
		// perform Double Click
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();

		Runtime.getRuntime().exec("./autoItProgram/Fileupload1.exe");

		Thread.sleep(2000);
		driver.quit();
	}

}
