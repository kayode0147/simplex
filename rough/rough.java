package rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import stanbicIBTCBuyProductTestpage.buyProductPage;

public class rough {
	


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
		term.EnterEmail("backup@yopmail.com"); //http://13.72.110.60/stanbicportal/auth/login
		term.EnterPassword("123456Kb$"); //1234qwerKb$
		term.ClickBtn();
		Thread.sleep(5000);
		term.clickBuyProduct();
		Thread.sleep(10000);

		
	}
	@Test
	public void sunset_wholeLife() throws InterruptedException {
		buyProductPage term = new buyProductPage(driver);
		
		term.clickwholeLife();
		Thread.sleep(5000);
		term.SelectDuratnCover("22");
		term.SelectPreFre("Monthly");
		term.EnterSumAss("350000");
		Thread.sleep(2000);
		term.clickbtn11();
		Thread.sleep(2000);
		term.texterrorSunset();
		Thread.sleep(2000);
		term.clickOk();
		term.EnterSumAss("650000");
		Thread.sleep(2000);
		term.clickbtn11();
		Thread.sleep(2000);
		term.clickTerms();
		Thread.sleep(2000);
		term.clickAccept();
		term.clickSubmit();
		Thread.sleep(10000);
		System.out.println("Sunset whole life successfully created");


	}


}
