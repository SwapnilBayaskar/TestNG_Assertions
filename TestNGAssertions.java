package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Generic.BaseTest;

public class TestNGAssertions extends BaseTest {
	
	By loc_txtHotels = By.xpath("(//span[@class='chNavText darkGreyText'])[2]");
	By loc_txtTrains = By.xpath("(//span[@class='chNavText darkGreyText'])[5]");
	
	public void clickOnHotelsLink() {
		driver.findElement(loc_txtHotels).click();
	}
	
	public void clickOnTrainsLink() {
		driver.findElement(loc_txtTrains).click();
	}
	
	//AssertEquals
	public void verifyTitleOfPage() {
		String strExpectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		String strActualTitle = driver.getTitle();
		
		Assert.assertEquals(strExpectedTitle, strActualTitle);
	}
	
	//AssertTrue
	public void verifyHotelsUrl() {		
		String strExpectedUrl = "https://www.makemytrip.com/hotels/";
		Assert.assertTrue(strExpectedUrl.equalsIgnoreCase(driver.getCurrentUrl()), "Url is not Equal");
		
		driver.navigate().back();
	}
	
	//AssertFalse
	public void verifyTrainsUrl() {
		String strExpectedUrl = "https://www.makemytrip.com/railways/123";
		Assert.assertFalse(strExpectedUrl.equalsIgnoreCase(driver.getCurrentUrl()), "Url is Equal");
		driver.navigate().back();
	}
	
	//AssertNull
	public void verifyObjectIsNull() {
		TestNGAssertions objTestNGAssertions = new TestNGAssertions();
		Assert.assertNull(objTestNGAssertions, "Object is not Null");
	}
	
	//AssertNotNull
	public void verifyObjectIsNotNull() {
		TestNGAssertions objTestNGAssertions = new TestNGAssertions();
		Assert.assertNotNull(objTestNGAssertions, "Object is Null");
	}
	
	//AssertSame
	public void verifyObjectIsSame() {
		TestNGAssertions objAssert = new TestNGAssertions();
		TestNGAssertions objTestNG = new TestNGAssertions();
		
		Assert.assertSame(objAssert, objTestNG, "Objects are equal");
	}
	
	//AssertNotSame
	public void verifyObjectIsNotSame() {
		TestNGAssertions objAssert = new TestNGAssertions();
		TestNGAssertions objTestNG = new TestNGAssertions();
			
		Assert.assertNotSame(objAssert, objTestNG, "Objects are not equal");
	}
	
	//AssertNotEqual
	public void verifyArraysAreNotEqual() {
		String strExpectedArray[] = {"Apple", "Samsung", "Oneplus", "Vivo"};
		String strActualArray[] = {"Apple", "Samsung", "Oneplus", "Vivo", "Oppo"};
		
		Assert.assertNotEquals(strExpectedArray, strActualArray, "Arrays are Equal");
	}

}
