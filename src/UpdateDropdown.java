import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Randhir kumar\\OneDrive\\Documents\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Randhir kumar\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
//		//driver.findElement(By.id("hrefIncAdt")).click();
//		for(int i=1;i<5;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
int i=1;
while(i<5) {
	driver.findElement(By.id("hrefIncAdt")).click();
	i++;
	
}
driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
