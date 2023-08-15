package stanbicIBTCBuyProducttest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import stanbicIBTCBuyProductTestpage.buyProductPage;

public class buyProducttest { 

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
	public void TermAssurance() throws InterruptedException {
		buyProductPage term = new buyProductPage(driver);
		
		term.clickTermAssuranace();
		Thread.sleep(5000);
		term.SelectDuratnCover("3");
		term.SelectPreFre("Quarterly");
		term.EnterSumAss("150000");
		Thread.sleep(2000);
		term.clickbtn11();
		Thread.sleep(5000);
		term.Gettext();
		Thread.sleep(5000);
		term.clickOk();
		term.EnterSumAss("2000000");
		Thread.sleep(2000);
		term.clickbtn11();
		Thread.sleep(2000);
		term.clickTerms();
		Thread.sleep(2000);
		term.clickAccept();
		term.clickSubmit();
		Thread.sleep(10000);
		System.out.println("Term Assurance successfully created");
	}
@Test
public void stanbicIBCTannuity() throws InterruptedException {
//	buyProductPage term = new buyProductPage(driver);
	
//	term.clickBuyProduct();
//	Thread.sleep(5000);
//	term.clickStanbicIBTCannuity();
//	Thread.sleep(3000);
//	term.enterPurAmt("120000");
//	term.SelectFrePay("Monthly");
//	term.selectIncrese("5");
//	Thread.sleep(5000);
//	term.clickTerms();
//	Thread.sleep(2000);
//	term.clickAccept();
//	term.clickSubmit();
//	System.out.println("Stanbic IBCT Annuity successfully created");
//	Thread.sleep(15000);
	
}
@Test
public void stanbicIBTCeducation() throws InterruptedException {
	
buyProductPage term = new buyProductPage(driver);
	
	term.clickBuyProduct();
	Thread.sleep(2000);
	term.clickStanbicIBTCeductn();
	Thread.sleep(5000);
	term.SelectDuratnCover("10");
	term.SelectPreFre("Yearly");
	term.EnterSumAss("12000");
	Thread.sleep(2000);
	term.clickbtn11();
	Thread.sleep(5000);
	term.getErrormessa();
	Thread.sleep(5000);
	term.clickOk();
	term.EnterSumAss("1200000");
	term.clickbtn11();
	Thread.sleep(2000);
	term.clickTerms();
	Thread.sleep(2000);
	term.clickAccept();
	term.clickSubmit();
	System.out.println("Stanbic IBTC Education successfully created");
	Thread.sleep(10000);
	
	
}

@Test
public void stanbicIBTCmortgage() throws InterruptedException {
	
buyProductPage term = new buyProductPage(driver);
	
	term.clickBuyProduct();
	Thread.sleep(2000);
	term.clickStanbicIBTCmortgage();
	Thread.sleep(5000);
	term.SelectDuratnCover("10");
	term.SelectPreFre("Yearly");
	term.EnterSumAss("14000");
	Thread.sleep(2000);
	term.clickbtn11();
	Thread.sleep(5000);
	term.getErrormessa();
	Thread.sleep(5000);
	term.clickOk();
	Thread.sleep(5000);
	term.EnterSumAss("1500000");
	term.clickbtn11();
	Thread.sleep(2000);
	term.clickTerms();
	Thread.sleep(2000);
	term.clickAccept();
	term.clickSubmit();
	System.out.println("Stanbic IBTC Mortgage successfully created");
	Thread.sleep(10000);
	
}

@Test
public void sunset_5years() throws InterruptedException {
	buyProductPage term = new buyProductPage(driver);
	
	term.clickBuyProduct();
	Thread.sleep(2000);
	term.clickSunset();
	Thread.sleep(5000);
	term.SelectDuratnCover("5");
	term.SelectPreFre("Quarterly");
	term.EnterSumAss("150000");
	Thread.sleep(2000);
	term.clickbtn11();
	Thread.sleep(5000);
	term.texterrorSunset();
	Thread.sleep(5000);
	term.clickOk();
	term.EnterSumAss("550000");
	Thread.sleep(2000);
	term.clickbtn11();
	Thread.sleep(2000);
	term.clickTerms();
	Thread.sleep(2000);
	term.clickAccept();
	term.clickSubmit();
	System.out.println("Sunset 5 years successfully created");
	Thread.sleep(10000);
	
}

@Test
public void sunset_wholeLife() throws InterruptedException {
	buyProductPage term = new buyProductPage(driver);
	
	term.clickBuyProduct();
	Thread.sleep(2000);
	term.clickwholeLife();
	Thread.sleep(5000);
	term.SelectDuratnCover("22");
	term.SelectPreFre("Monthly");
	term.EnterSumAss("350000");
	Thread.sleep(2000);
	term.clickbtn11();
	Thread.sleep(5000);
	term.texterrorSunset();
	Thread.sleep(5000);
	term.clickOk();
	term.EnterSumAss("650000");
	Thread.sleep(2000);
	term.clickbtn11();
	Thread.sleep(2000);
	term.clickTerms();
	Thread.sleep(2000);
	term.clickAccept();
	term.clickSubmit();
	System.out.println("Sunset whole life successfully created");
	Thread.sleep(10000);
	
}

@AfterTest
public void closedown() {
	driver.close();
	
}

}
