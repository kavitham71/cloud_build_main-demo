package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+ projectPath);
		
		//Add Script in Eclipse IDE
		//For Firefox : 
     	//System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver/geckodriver");
     	//WebDriver driver= new FirefoxDriver() ;
		
		// For Chrome:
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
     	driver.get("http://seleniumhq.org");
     	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	driver.close();
     	//driver.quit();
	}

}