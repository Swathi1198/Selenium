package TestScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FourthTest extends BaseClass{
	//test script 4
	@Test
	public void FourthTestt() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertEquals(skillraryDemo.getPageHeader(),"SkillRary-ECommerce");
		
		web.scrollToElement(skillraryDemo.getContactUs());
		skillraryDemo.clickContactUs();
		
		soft.assertTrue(contact.getpageHeader().isDisplayed());
		List<String> dataList = excel.fetchDataFromExcel("sheet1");
		contact.submitDetails(dataList.get(0), dataList.get(1), dataList.get(2), dataList.get(3));
		
		soft.assertAll();
		
	}

}
