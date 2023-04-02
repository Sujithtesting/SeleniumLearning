package testCases;

import org.testng.annotations.Test;

import base.BaseTest;

public class Elements extends BaseTest {
	@Test
	public void elements() {

		click("elementsbutton_XPATH");
		click("textboxbutton_XPATH");
		type("fullnamefield_XPATH", "SujithRaj V");
		type("email_XPATH", "SujithRaj@gmail.com");
		type("currentaddressfield_XPATH", "Kakinada");
		type("permanentaddress_XPATH", "Tallarevu");
		click("submit_XPATH");
	}

}
