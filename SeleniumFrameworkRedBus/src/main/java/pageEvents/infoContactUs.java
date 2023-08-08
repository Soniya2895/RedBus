package pageEvents;

import pageObjects.HomePageElements;
import pageObjects.InfoContactUsElements;
import utils.ElementFetch;


public class infoContactUs {
	
	ElementFetch ele = new ElementFetch();
	
	public void contactUs() {
		ele.getWebElement("CSS", InfoContactUsElements.ryde).click();
	}
}
