package Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotclassContexclickDoubleclick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PRAKASH HARIBABU\\\\eclipse-workspace\\\\SeleniumTask1\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		Robot r=new Robot();
		
		
		//QUESTION 1
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Prakash");
		act.doubleClick(email).perform();
		act.contextClick(email).perform();
		
		for(int i=0;i<2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement pwd = driver.findElement(By.id("pass"));
		act.contextClick(pwd).perform();
		for (int j=0; j<2; j++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
		
		
		//Question 2
		driver.get("https://www.google.co.in/webhp ");
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		driver.findElement(By.xpath("//span[text()='Gmail']")).click(); 
		
		//QUESTION 4
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(5000);
		WebElement interview = driver.findElement(By.xpath("//a[text()='CTS Interview Question']"));
		interview.click(); 
		
		//QUESTION 12
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement newtab = driver.findElement(By.xpath("(//a[contains(text(),'VIEW ALL')])[1]"));
		act.contextClick(newtab).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
		
		//QUESTION 11
		driver.get("https://www.snapdeal.com/offers/quirky");
		WebElement newtab2 = driver.findElement(By.xpath("//p[text()='Help Center']"));
		act.contextClick(newtab2).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
		
		//QUESTION 10
		driver.get("https://www.amazon.in/");
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello. Sign in']"))).perform();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
		WebElement amazon = driver.findElement(By.id("ap_email"));
		amazon.sendKeys("Prakash");
		act.doubleClick(amazon).perform();
		act.contextClick(amazon).perform();
		
		for (int e=0; e<2; e++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("continue")).click(); 
		
		//QUESTION 9
		
		
		
		
		
		
	}

}
      