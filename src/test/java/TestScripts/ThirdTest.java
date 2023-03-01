package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class ThirdTest extends BaseClass {
	@Test
	public void thirdTest() throws InterruptedException {
	SoftAssert soft = new SoftAssert();
	
	home.searchFor("core java for selenium");
	soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELENIUM");
	
	coreJava.clickCoreJavaForSeleniumLink();
	soft.assertEquals(javavideo.pageHeader()," Core Java For Selenium Training");
	javavideo.closepopUp();
	web.handleChildBrowser();
	javavideo.clickPlayButton();
	Thread.sleep(2000);
	javavideo.cliclPauseButton();
	
	web.switchBackFromFrame();
	
	javavideo.clickAddToWishList();
	soft.assertAll();
	
	
	

}
}
