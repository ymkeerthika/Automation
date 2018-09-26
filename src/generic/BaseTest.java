package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

//In testNG public
//In POM everything is private
@Listeners(Result.class)
//public abstract class BaseTest implements IAutoConst{
public abstract class BaseTest implements IAutoConst{
	public WebDriver driver;
	//if we make it as static v can run on one specific browser,which is a disadv
	//public static String chrome_key="webdriver.chrome.driver";//runs on one browser
	//public static String chrome_value="./driver/chromedriver.exe";
	//public static String gecko_key="webdriver.gecko.driver";
	//public static String gecko_value="./driver/geckodriver.exe";
	//static coz it can be accessed by any class
	//final coz it is not changing
	public String url=Utility.getPropertyValue(CONFIG_PATH,"URL");
	String ITO=Utility.getPropertyValue(CONFIG_PATH,"ITO");
	public long duration=Long.parseLong(ITO);
	static {
		System.setProperty("chrome_key", "chrome_value");
		System.setProperty("gecko_key", "gecko_value");
	}
	@BeforeMethod
	public void openApp() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	driver.get(url);
	
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
