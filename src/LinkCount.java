import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Randhir kumar\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.id("glbfooter"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		for(int i=25;i<footer.findElements(By.tagName("a")).size();i++) {
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			//Thread.sleep(2000L);
		}

	}

}
