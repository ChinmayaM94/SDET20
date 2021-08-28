package com.vtiger.comcast.pomrepositorylib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.comcast.generalUtility.WebDriverUtility;

public class LeadsPage extends WebDriverUtility {
	WebDriver driver;
	
	public LeadsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createLeadImg;
	
	@FindBy(xpath = "//a[@class='hdrLink']")
	private WebElement leadsHeader;
	
	@FindBy(xpath = "//span[@vtfieldname='lead_no']/ancestor::tr[@class='lvtColData']")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(xpath = "//span[@vtfieldname='lead_no']/..")
	private List<WebElement> UniqueleadNoList;

	@FindBy(xpath = "//span[@vtfieldname='lastname']/preceding-sibling::a")
	private List<WebElement> lastNameList;
	
	@FindBy(xpath = "//img[@src='themes/images/next.gif']")
	private WebElement nextBtn;
	
	@FindBy(name = "pagenum")
	private WebElement pageNumEdt;
	
	public WebElement getPageNumEdt() {
		return pageNumEdt;
	}
	
	public List<WebElement> getUniqueleadNoList() {
		return UniqueleadNoList;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public List<WebElement> getLastNameList() {
		return lastNameList;
	}

	public WebElement getCreateLeadImg() {
		return createLeadImg;
	}
	
	public WebElement getLeadsHeader() {
		return leadsHeader;
	}
	
	
//	public void selectALead(String updatedLastName) {
//		int count=1;
//		outerloop:
//		for(;;) {
//			if(Integer.parseInt(pageNumEdt.getAttribute("value"))==count) {
//				for(WebElement ele:lastNameList) {
//					if(ele.getText().equals(updatedLastName)) {
//						ele.click();
//						break outerloop;
//					}
//				}
//				count++;
//				nextBtn.click();
//				waitForAttributeValue(driver, pageNumEdt, "value", String.valueOf(count));
//			} else {
//				break;
//			}
//		}
//	}
	
}
