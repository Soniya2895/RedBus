package pageEvents;

import java.time.Duration;

import base.BaseTest;
import pageObjects.BusTicketsElements;

import utils.ElementFetch;

public class BusTickets {

	ElementFetch ele = new ElementFetch();
	public void clickRedBus() {
		ele.getWebElement("CSS",BusTicketsElements.redBusIcon).click();
		BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
	}
}
