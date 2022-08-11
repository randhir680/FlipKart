
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropeDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Randhir kumar\\OneDrive\\Documents\\chromedriver.exe");
		//System.getProperty("webdriver.chrome.driver", "C:\\Users\\Randhir kumar\\OneDrive\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
			//driver.navigate().back();
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			driver.findElement(By.xpath("//a[@value='PAT']")).click();
			Thread.sleep(2000L);
			//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		
			//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

	}

}
