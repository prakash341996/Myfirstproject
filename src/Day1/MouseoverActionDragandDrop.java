package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverActionDragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PRAKASH HARIBABU\\\\eclipse-workspace\\\\SeleniumTask1\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
/*
		//QUESTION 2
		driver.navigate().to("http://www.amazon.iN");
		//driver.get(" http://www.amazon.iN");
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles, Computers')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Power Banks')]")).click();		

		//QUESTION 4
		driver.get("https://www.gettyimages.in/");
		driver.findElement(By.xpath("(//a[@target='_self'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Entertainment']")).click();

		//QUESTION 5
		driver.get("https://www.shopclues.com/wholesale.html");
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Rs.5001 - Rs.10000')]")).click();	

		//QUESTION 7 
		driver.get("http://greenstech.in/selenium-course-content.html");
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Software Testing ')]"))).perform();
		driver.findElement(By.xpath("//span[text()='Selenium Training']")).click();
		WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),' Learn ')]"));
		String text = findElement.getText();
		System.out.println(text);

		//QUESTION 8
		driver.get("http://greenstech.in/selenium-course-content.html");
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Oracle Training ']"))).perform();
		driver.findElement(By.xpath("//span[text()='Oracle SQL Training']")).click();
		WebElement findElement1 = driver.findElement(By.xpath("//li[contains(text(),'	Basic history ')]"));
		String text1 = findElement1.getText();
		System.out.println(text1);		

		//QUESTION 9
		driver.get("http://greenstech.in/selenium-course-content.html");
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Data Warehousing Training ']"))).perform();
		driver.findElement(By.xpath("//span[text()='Microstrategy Training']")).click();



		//QUESTION 6 not work
		driver.get("https://www.shopclues.com/wholesale.html ");
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Sports & More']"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[contains(text(),'GXN Rapid Gain Mass Gainer 2.72 kg, Chocolate Swirl')]")).click();

		//QUESTION 3 not work
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='TVs & Appliances']"))).perform();
		driver.findElement(By.xpath("//a[@title='Hitachi']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@type='button']")).click();  

		//QUESTION 10
		driver.get("http://greenstech.in/selenium-course-content.html");
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Web Designing Training']"))).perform();
		driver.findElement(By.xpath("//span[text()='JavaScript Training']")).click(); 

		//QUESTION 11
		driver.get("http://greenstech.in/selenium-course-content.html");
		act.moveToElement(driver.findElement(By.xpath("//a[text()='COURSES']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='SAP Training ']"))).perform();
		driver.findElement(By.xpath("//span[text()='SAP MM Training']")).click(); */
		
		//QUESTION 12
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='All Departments']"))).perform();
		WebElement findElement = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		act.moveToElement(findElement).perform();
		//act.moveToElement(driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"))).perform();
		driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']")).click();



	}

}
