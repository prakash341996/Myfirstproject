package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLanch {
	public static void main(String[] args) {		
		//lanch firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\geckodriver.exe");
		WebDriver driv=new FirefoxDriver();
		driv.get("http://www.greenstechnologys.com/");
		driv.get("https://www.facebook.com/");
		driv.get("https://www.amazon.in");
		driv.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driv.quit();
		//lanch chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.greenstechnologys.com/");
				driver.get("http://gmail.com/");
				driver.get("http://www.flipkart.com/");
				driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
				driver.quit();
		// lanch internet explorer
		System.setProperty("webdriver.ie.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\IEDriverServer.exe");
		WebDriver drive=new InternetExplorerDriver();
		drive.get("http://www.greenstechnologys.com/");
		drive.get("http://demo.automationtesting.in/Register.html");
		drive.get("http://www.greenstechnologys.com/selenium-course-content.html");
		drive.quit();
	}
}
