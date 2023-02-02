package genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;
	public WebDriverUtility wUtils=new WebDriverUtility();
	
		
		@Beforesuite
			public void bsCounfig() {
			System.out.println("Connect to DB");
		}
		@Beforesuite
		public void bsCounfig() {
		System.setProperty("webdriver.chroeme.driver","/src/main/resources/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https;//demo.actitime.com/login.do");
		}
		@Beforesuite
		public void bMCounfig() {
			LoginPage login = new LoginPage(driver);
			login.loginAction("admin","manager");
		}
		
		
		
		
		

	}

}
