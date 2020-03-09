package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsTextGet {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		WebElement getText = driver.findElement(By.xpath("(//div[@class='box'])[2]"));
		String text = getText.getText();
		System.out.println(text);
	
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'Any fresh')]")).getText();
		System.out.println(text2);
		
		String text3 = driver.findElement(By.xpath("//p[contains(text(),'Selenium is one of')]")).getText();
		System.out.println(text3);
		String text4 = driver.findElement(By.xpath("//p[contains(text(),'Emerging as')]")).getText();
		System.out.println(text4);
		
		String text5 = driver.findElement(By.xpath("//p[contains(text(),'Balamurugan')]")).getText();
		System.out.println(text5); 
		
		driver.get("https://www.facebook.com/ ");
		WebElement getat = driver.findElement(By.xpath("//input[contains(@type,'email')]"));
		getat.sendKeys("Prakash");
		String attribute = getat.getAttribute("value");
		System.out.println(attribute);
		WebElement userpwd = driver.findElement(By.xpath("(//input[contains(@type,'password')])[1]"));
		userpwd.sendKeys("3456789iujhg");
		String attribute2 = userpwd.getAttribute("value");
		System.out.println(attribute2); 
		
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("greens velmurugan"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Selenium Training In Chennai")).click();
		
	}

}
