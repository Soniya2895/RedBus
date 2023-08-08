package pageEvents;

import org.openqa.selenium.JavascriptExecutor;

import base.BaseTest;
import pageObjects.HomePageElements;
import pageObjects.RedBusRydeElements;
import utils.ElementFetch;

public class RedBusRyde {

	ElementFetch ele = new ElementFetch();
	HomePageEvents hg = new HomePageEvents();
	
	public void redBusRyde() {
		//to perform scroll to the bottom on RedBus

		   JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
		   //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		   js.executeScript("arguments[0].scrollIntoView();", ele.getWebElement("CSS", RedBusRydeElements.youtubevideo));
		   
		   ele.getWebElement("CSS", RedBusRydeElements.videoPlay).click();
		   
		   BaseTest.driver.close();
		   
		 //Switch back to the old tab or window
		   BaseTest.driver.switchTo().window(hg.parentWindow);
		   
		   
	}
}
