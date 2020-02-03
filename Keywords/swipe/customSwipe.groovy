package swipe

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class customSwipe {
	@Keyword
	public static buttonToTop(){
		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()
		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * 0.30
		int endY = device_Height * 0.70
		Mobile.swipe(startX, endY, endX, startY)
	}
	
	@Keyword
	public static topToButton(){
		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()
		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * 0.30
		int endY = device_Height * 0.70
		Mobile.swipe(startX, startY, endX, endY)
	}
	
	@Keyword
	public static swipeRighToLeft(){
		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()
		int startY = device_Height / 2
		int endY = startY
		int startX = device_Width * 0.30
		int endX = device_Width * 0.70
		Mobile.swipe(endX, startY, startX, endY)
	}
	
	@Keyword
	public static swipeLeftToRigh(){
		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()
		int startY = device_Height / 2
		int endY = startY
		int startX = device_Width * 0.30
		int endX = device_Width * 0.70
		Mobile.swipe(startX, startY, endX, endY)
	}
}
