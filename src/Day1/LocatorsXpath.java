package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.findElement(By.xpath("//a[@href='contact.php']")).click();
		driver.findElement(By.id("InputName")).sendKeys("prakash");
		driver.findElement(By.id("InputEmail1")).sendKeys("prakash341996@gmail.com");
		driver.findElement(By.id("InputSubject")).sendKeys("7845548771");
		driver.findElement(By.xpath("(//select[@name='courses'])[1]")).sendKeys("selenium");		
		driver.findElement(By.xpath("(//select[@name='branch'])[1]")).sendKeys("tambaram");
		driver.findElement(By.xpath("(//select[@name='time'])[1]")).sendKeys("in a");
		driver.findElement(By.xpath("(//textarea[@name='comments'])[1]")).sendKeys("greens task selenium");
		driver.findElement(By.id("submit")).click();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Prakash");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("12345678");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prakash341996@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("3456789776");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.id("checkbox3")).click();
		//driver.findElement(By.id("msdd")).sendKeys("English");
		driver.findElement(By.id("Skills")).sendKeys("software");
		driver.findElement(By.id("countries")).sendKeys("india");
		driver.findElement(By.id("yearbox")).sendKeys("1996");
		driver.findElement(By.xpath("(//select[@type='text'])[4]")).sendKeys("april");
		driver.findElement(By.xpath("(//select[@type='text'])[5]")).sendKeys("3");
		driver.findElement(By.id("firstpassword")).sendKeys("3456");
		driver.findElement(By.id("secondpassword")).sendKeys("345678");
		driver.findElement(By.id("submitbtn")).click();
		
		
			


	}
}
