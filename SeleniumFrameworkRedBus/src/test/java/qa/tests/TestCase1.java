package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.BusTickets;
import pageEvents.HomePageEvents;
import pageEvents.RedBusRyde;
import pageEvents.infoContactUs;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
	
  ElementFetch ele = new ElementFetch();	
  HomePageEvents hpg = new HomePageEvents();
  BusTickets bs = new BusTickets();
  infoContactUs icu = new infoContactUs();
  RedBusRyde rbr = new RedBusRyde();
  @Test
  public void sampleMethodForEnteringDetailsOnHomePage() {
	  hpg.searchBus();
	  bs.clickRedBus();
	  icu.contactUs();
	  rbr.redBusRyde();
	  hpg.Twitter();
	  
  }
}
