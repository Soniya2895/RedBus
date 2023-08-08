 package pageEvents;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {

	ElementFetch ele = new ElementFetch();
	
	WebElement nextbutton;
	public String parentWindow = BaseTest.driver.getWindowHandle();
	JavascriptExecutor js;
	public void searchBus() {
		ele.getWebElement("CSS",HomePageElements.source).sendKeys("Indore");
		ele.getWebElement("CSS",HomePageElements.destination).sendKeys("Pune");
		
		ele.getWebElement("CSS", HomePageElements.dateicon).click();
		
		
		while (true) {
            
			nextbutton = ele.getWebElement("CSS",HomePageElements.nextButton);
            
            // Check if the calendar header contains "Dec 2023"
            if(ele.getWebElement("CSS", HomePageElements.monthTitle).getText().contains("Dec 2023")) {
            break;
        }
		
            nextbutton.click();
		
		
	}
		ele.getWebElement("CSS", HomePageElements.dateSelect).click();
		
		ele.getWebElement("CSS", HomePageElements.searchBus).click();
		
		//To switch to new window
		//parentWindow = BaseTest.driver.getWindowHandle();
		
		//to perform scroll to the bottom on RedBus

			 js = (JavascriptExecutor) BaseTest.driver;
		   //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		   js.executeScript("arguments[0].scrollIntoView();", ele.getWebElement("CSS", HomePageElements.contactUs));
		   
		   
		   
		   ele.getWebElement("CSS", HomePageElements.contactUs).click();
		   
		   for (String windowHandle : BaseTest.driver.getWindowHandles()) {
			    if(!parentWindow.contentEquals(windowHandle)) {
			        BaseTest.driver.switchTo().window(windowHandle);
			        break;
			    }
			}
		   
		   
}
	public void Twitter() {
		js = (JavascriptExecutor) BaseTest.driver;
		js.executeScript("arguments[0].scrollIntoView();", ele.getWebElement("CSS", HomePageElements.twitter));
		
		ele.getWebElement("CSS", HomePageElements.twitter).click();
	}
}
