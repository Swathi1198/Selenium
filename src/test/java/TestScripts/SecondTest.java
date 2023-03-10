package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass {
	@Test
	public void secondTest() {
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertEquals(skillraryDemo.getPageHeader(),"SkillRary-ECommerce");
		skillraryDemo.selectCategory(web, 1);
		
		soft.assertEquals(testing.getPageHeader(), "Testing");
		web.dragAndDropElement(testing.getJavaImage(),testing.getCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		soft.assertAll();
	}

}
