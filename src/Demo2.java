import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Randhir kumar\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//input[@value='radio3']")).click();
	driver.findElement(By.id("autocomplete")).sendKeys("jhsdffj");
	driver.findElement(By.id("dropdown-class-example")).click();
	driver.findElement(By.cssSelector("option[value='option2']")).click();
	driver.findElement(By.id("checkBoxOption2")).click();

	}

}
