package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import utilities.DataUtil;

public class Elements extends BaseTest {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp1")
	public void testbox(String fullname, String email, String curaddress, String peraddress, String expfullname,
			String expemail, String expcuraddress, String expperaddress) {

		click("elementsbutton_XPATH");
		click("textboxbutton_XPATH");
		type("fullnamefield_XPATH", fullname);
		type("email_XPATH", email);
		type("currentaddressfield_XPATH", curaddress);
		type("permanentaddress_XPATH", peraddress);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		click("submit_XPATH");

		Assert.assertTrue(validateElementText("outputname_CSS", expfullname));
		Assert.assertTrue(validateElementText("outputemail_CSS", expemail));
		Assert.assertTrue(validateElementText("outputcurrentaddress_CSS", expcuraddress));
		Assert.assertTrue(validateElementText("outputperaddress_CSS", expperaddress));
		/*
		 * SoftAssert softassert = new SoftAssert();
		 * softassert.assertTrue(isElementPresent("outputname_CSS"),
		 * "Name output not found");
		 * softassert.assertTrue(isElementPresent("outputemail_CSS"),
		 * "Email output not found");
		 * softassert.assertTrue(isElementPresent("outputcurrentaddress_CSS"),
		 * "Current Address output not found");
		 * softassert.assertTrue(isElementPresent("outputperaddress_CSS"),
		 * "Permanent Address output not found"); softassert.assertAll();
		 */ }

	@Test(priority = 1)
	public void checkbox() {
		click("elementsbutton_XPATH");
		click("checkboxbutton_XPATH");
		click("Homearrow_XPATH");
		click("Desktoparrow_XPATH");
		click("Documentsarrow_XPATH");
		click("Downloadsarrow_XPATH");

	}
}
