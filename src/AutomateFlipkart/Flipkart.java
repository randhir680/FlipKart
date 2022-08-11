package AutomateFlipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Randhir kumar\\OneDrive\\Documents\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	
	driver.findElement(By.className("VJZDxU")).sendKeys("randhir680@gmail.com");
	driver.findElement(By.className("_3mctLh")).sendKeys("9031651099");
	Thread.sleep(2000L);
	driver.findElement(By.className("_3AWRsL")).click();
	Thread.sleep(2000L);
	driver.findElement(By.className("_3704LK")).sendKeys("mobile");
	driver.findElement(By.className("L0Z3Pu")).click();
	Thread.sleep(2000L);
	driver.findElement(By.className("MIXNux")).click();
	Thread.sleep(2000L);
	driver.findElement(By.className("_2KpZ6l")).click();

	
	}

}
