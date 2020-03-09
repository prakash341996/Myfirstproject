package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		WebElement fndelemt = driver.findElement(By.id("email"));
		fndelemt.sendKeys("gmail.com");
		WebElement findElement = driver.findElement(By.id("pass"));
		findElement.sendKeys("23456");
		
		driver.get("https://www.redbus.in/ ");
		WebElement findbus = driver.findElement(By.id("src"));
		findbus.sendKeys("chennai");
		WebElement findbusto = driver.findElement(By.id("dest"));
		findbusto.sendKeys("delhi");
		
		driver.get("https://www.google.com");
		WebElement google = driver.findElement(By.name("q"));
		google.sendKeys("greenstechnology"); 
		
		driver.get("https://www.swiggy.com/");
		WebElement swiggy = driver.findElement(By.id("location"));
		swiggy.sendKeys("thiruvanmiyur");
		
		driver.get("https://www.snapdeal.com/login");
		WebElement sanapdeal = driver.findElement(By.name("username"));
		sanapdeal.sendKeys("345678");
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		WebElement insta = driver.findElement(By.name("username"));
		insta.sendKeys("_prakash_3");
		WebElement insta1 = driver.findElement(By.name("password"));
		insta1.sendKeys("234567");
		
		driver.get("https://www.irctc.co.in/");
		WebElement irctc = driver.findElement(By.className("ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
		irctc.sendKeys("chennai");
		WebElement irctc1 = driver.findElement(By.partialLinkText("ui-autocomplete ui-widget"));
		irctc1.sendKeys("345678");
		
		driver.get("www.adactin.com/HotelApp/");
		WebElement adactin = driver.findElement(By.id("username"));
		adactin.sendKeys("prakash341996@gmail.com");
		driver.findElement(By.id("password")).sendKeys("56890877");
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");		
		 driver.findElement(By.name("DUMMY1")).click();
		WebElement icici = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		icici.sendKeys("prakash@gmail.com");
		WebElement icici1 = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		icici1.sendKeys("345678"); 
		
		driver.get("https://netbanking.hdfcbank.com/");
		WebElement netbank = driver.findElement(By.name("fldLoginUserId"));
		netbank.sendKeys("prakash");
		
	}

}
