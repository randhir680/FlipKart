import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro{

	public static void main(String[] args) {
		
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Randhir kumar\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.className("replace-2x")).click();
		driver.findElement(By.xpath("//*[@text()='Testing']")).click();
	}
}
