package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//QUESTION 1
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.id("OKTab")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Welcome Prakash");
		System.out.println(alert3.getText());     
		alert3.accept();	
		
		//QUESTION 3
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		Alert canaraAlert = driver.switchTo().alert();
		System.out.println(canaraAlert.getText());
		canaraAlert.accept();

		//QUESTION 4
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE TO LOGIN')]")).click();
		driver.findElement(By.id("Button2")).click();
		Alert sbiAlert = driver.switchTo().alert();
		sbiAlert.accept();

		//QUESTION 5
		driver.get("https://www.sprint.com/");
		driver.findElement(By.xpath("//p[text()='Sign In']")).click();
		driver.findElement(By.id("loginHeaderButton")).click();

		//QUESTION 6
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		
		//QUESTION 8
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.findElement(By.id("DUMMY1")).click();
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("Harish");	
		WebElement findElement = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		findElement.sendKeys("Prakash3456");
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();

		//QUESTION 2  Not Working 
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");		
		driver.switchTo().frame("login_page");		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("Prakash");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();			
		driver.findElement(By.xpath("//img[@alt='Login']")).click();

		//QUESTION 7 Not Working 
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("Prakash");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.xpath("(//frameset[@border='false'])[1]")));
		driver.switchTo().frame(driver.findElement(By.xpath("(//frameset[@border='false'])[2]")));
		driver.switchTo().frame("login_page");		
		driver.findElement(By.name("fldPassword")).sendKeys("3456789");















	}

}
