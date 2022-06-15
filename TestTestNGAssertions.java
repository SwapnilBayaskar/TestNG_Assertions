package com.Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageFactory.TestNGAssertions;

public class TestTestNGAssertions {
	
	private TestNGAssertions objTestNGAssertions;
	
	public void initilizeWebPages() {
		objTestNGAssertions = new TestNGAssertions();
	}
	
	@BeforeClass
	public void initilizeWebEnv() {
		this.initilizeWebPages();
		objTestNGAssertions.initializeWebdriver("https://www.makemytrip.com/");
	}
	
	@AfterClass
	public void tearDown() {
		objTestNGAssertions.tearDownMethod();
	}
	
	@Test
	public void TCID_101_VerifyAssertEqualsAssertion() {
		objTestNGAssertions.verifyTitleOfPage();
	}
	
	@Test
	public void TCID_102_VerifyAssertTrueAssertion() {
		objTestNGAssertions.clickOnHotelsLink();
		objTestNGAssertions.verifyHotelsUrl();
	}
	
	@Test
	public void TCID_103_VerifyAssertFalseAssertion() {
		objTestNGAssertions.clickOnTrainsLink();
		objTestNGAssertions.verifyTrainsUrl();
	}
	
	@Test
	public void TCID_104_VerifyAssertNullAssertion() {
		objTestNGAssertions.verifyObjectIsNull();
	}
	
	@Test
	public void TCID_105_VerifyAssertNotNullAssertion() {
		objTestNGAssertions.verifyObjectIsNotNull();
	}
	
	@Test
	public void TCID_106_VerifyAssertSameAssertion() {
		objTestNGAssertions.verifyObjectIsSame();
	}
	
	@Test
	public void TCID_107_VerifyAssertNotSameAssertion() {
		objTestNGAssertions.verifyObjectIsNotSame();
	}
	
	@Test
	public void TCID_108_VerifyAssertNotEqualAssertion() {
		objTestNGAssertions.verifyArraysAreNotEqual();
	}

}
