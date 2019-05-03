import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		
		// TODO Auto-generated method stub E:\chromedriver_win32
		String exePath = "E:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automatorsworld");

	}

}
