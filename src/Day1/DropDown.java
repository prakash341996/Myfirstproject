package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown { 
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		 WebElement cityFind = driver.findElement(By.id("dcdrLocation"));
		 Select s=new Select(cityFind);
		 s.selectByVisibleText("chennai");
	}

}
