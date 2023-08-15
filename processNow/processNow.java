package processNow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import stanbicIBTCBuyProductTestpage.buyProductPage;

public class processNow {
	
static WebDriver driver;
	
	@BeforeTest	
	public void setup() throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ORANMITAN kayode Abe\\Desktop\\toolsIntaller\\new chromemememe\\test\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		 driver= new ChromeDriver(options);
		 driver.get("http://13.72.110.60/stanbicportal/auth/login"); 
		 driver.manage().window().maximize();
		 Robot robot = new Robot();
		 Thread.sleep(5000);
			for (int i = 0; i < 4; i++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
	}
		 
		buyProductPage term = new buyProductPage(driver);
		term.EnterEmail("adetunde@yopmail.com"); //http://13.72.110.60/stanbicportal/auth/login
		term.EnterPassword("111111Kb$"); //1234qwerKb$
		term.ClickBtn();
		Thread.sleep(5000);

		
	}
	@Test
	public void life_Insurance_process () throws InterruptedException {
		buyProductPage term = new buyProductPage(driver);
		
		term.selectAction();
		Thread.sleep(2000);
		term.clickProcessNow();
		Thread.sleep(5000);
		term.clickUpload();
		Thread.sleep(5000);
		
		
		System.out.println("Term Assurance successfully created");
	}

}
