package stanbicIBTCBuyProductTestpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyProductPage {
	WebDriver driver;
	
	@FindBy(id = "accountCode")
	WebElement EmailField;
	
	@FindBy(id = "userpassword")
	WebElement PasswordField;
	
	@FindBy(tagName = "button")
	WebElement SigninBtn;
	
	@FindBy(xpath = "//a[@id='buyOtherProductBtn']")
	WebElement BuyProduct;
	
	@FindBy(xpath = "//h4[normalize-space()='TERM ASSURANCE']")
	WebElement termAssurance;
	
	@FindBy(xpath = "//select[@id='coverDuration']") 
	WebElement SelectDropDwn;

	@FindBy(xpath = "//select[@id='premFrequency']")  
	WebElement SelectPremFre;

	@FindBy(id = "sumAssured")
	WebElement SumAss;
	
	@FindBy(xpath = "//div[@class='br-mainpanel']//div[6]//div[2]")
	WebElement button;
	
	@FindBy(xpath = "//button[normalize-space()='ok']")
	WebElement buttonOK;
	
	@FindBy(xpath = "//div[contains(text(),'Minimum SumAssured is 2,000,000.00')]")
	WebElement getText;
	
	@FindBy(xpath = "//button[normalize-space()='ok']")
	WebElement butOk;
	
	@FindBy(id = "btnTermsandCondition")
	WebElement termsbtn;
	
	@FindBy(id = "btnAccept")
	WebElement Accept;
	
	@FindBy(id = "submitData")
	WebElement submit;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/a[2]/h4")
	WebElement StanbicIBTCannuity;
	
	@FindBy(id = "rsaBalance")
	WebElement purchaseAmt;
	
	@FindBy(id = "benefitGap")
	WebElement frePayout;
	
	@FindBy(id = "increase")
	WebElement increase;
	
	@FindBy(xpath = "//h4[contains(text(),'Stanbic IBTC Education Endowment Assurance Product')]")
	WebElement StanbicIBTCeducatn;
	
	@FindBy(xpath = "//div[contains(text(),'Minimum SumAssured is 1,000,000.00')]")
	WebElement text;
	
	@FindBy(xpath = "/html/body/div[10]/div[2]/div/div/div/div/div/div/div/div[3]/div/div")
	WebElement moTtext;
	
	@FindBy(xpath = "//button[normalize-space()='ok']")
	WebElement okError;
	
	@FindBy(xpath = "//h4[normalize-space()='Stanbic IBTC Mortgage Protection Assurance product']")
	WebElement StanbicIBTCmortgage;
	
	@FindBy(xpath = "//span[normalize-space()='Policies']")
	WebElement polices;
	
	@FindBy(xpath = "//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[1]")
	WebElement Action;
	
	@FindBy(xpath = "//a[normalize-space()='Pay Now']")
	WebElement Paynow;
	
	@FindBy(xpath = "//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[1]")
	WebElement action;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Process Now']")
	WebElement processNow;
	
	@FindBy(xpath = "//label[@id='loadUploadRetireeFile']")
	WebElement uploadPix;
	
	@FindBy(xpath = "//h4[normalize-space()='Stanbic IBTC SunSet Five Year Plan']")
	WebElement sunset;
	
	@FindBy(xpath = "//div[contains(text(),'Minimum SumAssured is 500,000.00')]")
	WebElement errorSunset;
	
	@FindBy(xpath = "//h4[normalize-space()='Stanbic IBTC SunSet Whole-Life Plan']")
	WebElement sunsetWholelife;
	
	
public buyProductPage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}

public void EnterEmail(String text) {
	EmailField.clear();
	EmailField.sendKeys(text);
}
public void EnterPassword(String text) {
	PasswordField.clear();
	PasswordField.sendKeys(text);
	
}
public void ClickBtn() {
	SigninBtn.click();
	
}
public void clickBuyProduct() {
	BuyProduct.sendKeys(Keys.RETURN);
	
}
public void clickTermAssuranace() {
	termAssurance.click();
	
}
public void SelectDuratnCover(String value) {
	SelectDropDwn.sendKeys(value);
//	Select select= new Select(SelectDropDwn);
//	select.selectByValue("3");
	
	
}
public void SelectPreFre(String text) {
	SelectPremFre.sendKeys(text);
//	Select groupBy= new Select(SelectPremFre);
//	groupBy.selectByValue("06");
	
}
public void EnterSumAss(String text) {
	SumAss.clear();
	SumAss.sendKeys(text);
}
public void clickbtn11() {
	button.click();
}
public void clickOk() {
	buttonOK.click();
}
public void clickOkok() {
	butOk.click(); 
}
public void Gettext() {
//	String nam = getText.getText();
//	String nam2 = "Minimum SumAssured is 1,000,000.00";
//	Assert.assertEquals(nam, nam2);
//	System.out.println("Assert passed");
	
	String note = getText.getText();
	System.out.println("Error message "+note);
//	//System.out.println(getText.getText());
}
public void clickTerms() {
	termsbtn.click();
}
public void clickAccept() {
	Accept.click();	
}
public void clickSubmit() {
	submit.click();
}
public void clickStanbicIBTCannuity() {
	StanbicIBTCannuity.click();
}
public void enterPurAmt(String text) {
	purchaseAmt.clear();
	purchaseAmt.sendKeys(text);
}
public void SelectFrePay(String text) {
	frePayout.sendKeys(text);
}
public void selectIncrese(String text) {
	increase.sendKeys(text);
	
}
public void clickStanbicIBTCeductn() {
	StanbicIBTCeducatn.click();
}
public void getErrormessa() {
//	String not = text.getText();
//	String not2 = "Minimum SumAssured is 2,000,000.00";
//	Assert.assertEquals(not, not2);
//	System.out.println("Assert passed");	
		
	String txt = text.getText();
	System.out.println("Error message "+txt);   
	////System.out.println(text.getText());       
}
public void texterrorSunset() {
//	String txt = errorSunset.getText();
//	String txt2 = "Minimum SumAssured is 500,000.00";
//	Assert.assertEquals(txt, txt2);
//	System.out.println("Assert passed");
	
	String err = errorSunset.getText();
	System.out.println("error message "+err);
}

public void moTerror() {
	System.out.println(moTtext.getText());

}
public void clickOkerror() {
	okError.click();
}
public void clickStanbicIBTCmortgage() {
	StanbicIBTCmortgage.click();
	
}
public void clickPolices() {
	polices.click();
}
public void clickAction() {
	Action.click();
}
public void clickPayNow() {
	Paynow.click();
}
public void selectAction() {
	action.click();	
}
public void clickProcessNow() {
	processNow.click();
//}
//public void clickUpload() {
//	uploadPix.click();
//	uploadPix.sendKeys("C:\\Users\\ORANMITAN kayode Abe\\Pictures\\pictures saver\\luv.jpg");

}
public void clickSunset() {
	sunset.click();
}
public void clickwholeLife() {
	sunsetWholelife.click();
}
}

