package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FirstTest extends BaseClass {
@Test
public void firstTest() {
	SoftAssert soft = new SoftAssert();
	home.clickGears();
	home.clickSkillrarydemoApp();
	home.switchToChildBrowser();
	
	soft.assertEquals(skillraryDemo.getPageHeader(),"SkillRary-ECommerce");
	skillraryDemo.mouseHoverTocourse(web);
	skillraryDemo.clickSeleniumTraining();
	
	selenium.doubleClickPlusButton(web);
	selenium.clickAddToCart();
	web.handleAlert();
	

	soft.assertTrue(selenium.getItemAddedMessage());
	
	soft.assertAll();
	
	
	
	
	
}
}
