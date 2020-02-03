package live
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import halper.objectKatalon
import listObject.pageLive

class scriptLive {

	@Given('User want to button live')
	def userWanttoButtonLive() {
		Mobile.startApplication(GlobalVariable.APK, false)
		Mobile.tap(objectKatalon.testObject("xpath", String.format(pageLive.Lanjutkan)), 0)
	}

	@When('User click button live')
	def userClickButtonLive() {
		Mobile.verifyElementExist(objectKatalon.testObject("xpath", String.format(pageLive.ButtonLive)), 0)
		Mobile.tap(objectKatalon.testObject("xpath", String.format(pageLive.ButtonLive)), 0)
	}

	@Then('User direct to live page')
	def userDirecttoLiveButton() {
		Mobile.verifyElementExist(objectKatalon.testObject("xpath", String.format(pageLive.TypeLive)), 0)
		Mobile.verifyElementExist(objectKatalon.testObject("xpath", String.format(pageLive.TimeLive)), 0)
	}

	@Given('User want to click button type live')
	def userWantToClickButtonTypeLive(){
		Mobile.verifyElementExist(objectKatalon.testObject("xpath", String.format(pageLive.TypeLive)), 0)
	}

	@When('User click button type live')
	def clickButtonLive() {
		Mobile.tap(objectKatalon.testObject("xpath", String.format(pageLive.TypeLive)), 0)
	}

	@Then('User can be click type live')
	def canBeClickTypeLive() {
		Mobile.verifyElementExist(objectKatalon.testObject("xpath", String.format(pageLive.CloseTypeLive)), 0)
		Mobile.tap(objectKatalon.testObject("xpath", String.format(pageLive.CloseTypeLive)), 0)
		Mobile.closeApplication()
	}
}