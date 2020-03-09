package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//NOTE: Login the gmail using debug steps.
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("prakash341996@gmail.com"+Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("234567y"+Keys.ENTER);

		//NOTE: Print the UserName and Password that you are entered.
		driver.get("http://www.adactin.com/HotelApp/ ");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Prakash");		
		String getatt = user.getAttribute("value");
		System.out.println(getatt);		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("12345678qwertyu");
		String pwdget = pwd.getAttribute("value");
		System.out.println(pwdget);

		//NOTE: Print all the input you given for registration.
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp ");
		WebElement getuser = driver.findElement(By.id("firstName"));
		getuser.sendKeys("Prakash");
		String attribute = getuser.getAttribute("value");
		System.out.println(attribute);
		WebElement findElement = driver.findElement(By.id("lastName"));
		findElement.sendKeys("hari");
		String attribute2 = findElement.getAttribute("value");
		System.out.println(attribute2);
		WebElement findElement2 = driver.findElement(By.id("username"));
		findElement2.sendKeys("prakashhari");
		String attribute3 = findElement2.getAttribute("value");
		System.out.println(attribute3);
		WebElement findElement3 = driver.findElement(By.xpath("//input[@name='Passwd']"));
		findElement3.sendKeys("123456789");
		String attribute4 = findElement3.getAttribute("value");
		System.out.println(attribute4);
		WebElement findElement4 = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		findElement4.sendKeys("123456789");
		String attribute5 = findElement4.getAttribute("value");
		System.out.println(attribute5); 
		
		//Print electronic,tv and applicances,men,women,baby&kids,home&furniture and offerzone.(findElement by xpath,text)
		driver.get("https://www.flipkart.com/ ");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();		
		WebElement flip1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String text = flip1.getText();
		System.out.println(text);		
		WebElement flip2 = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		String text2 = flip2.getText();
		System.out.println(text2);
		WebElement flip3 = driver.findElement(By.xpath("//span[text()='Men']"));
		String text3 = flip3.getText();
		System.out.println(text3);
		WebElement flip4 = driver.findElement(By.xpath("//span[text()='Women']"));
		String text4 = flip4.getText();
		System.out.println(text4);
		WebElement flip5 = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		String text5 = flip5.getText();
		System.out.println(text5);
		WebElement flip6 = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		String text6 = flip6.getText();
		System.out.println(text6);
		WebElement flip7 = driver.findElement(By.xpath("//span[text()='Offer Zone']"));
		String text7 = flip7.getText();
		System.out.println(text7);







	}

}
