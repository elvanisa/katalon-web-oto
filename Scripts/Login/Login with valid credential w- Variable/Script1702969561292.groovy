import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(url)

WebUI.click(findTestObject('ObjectSpy/Homepage/btn_menu-toggle'))

WebUI.click(findTestObject('ObjectSpy/Homepage/btn_nav_Login'))

WebUI.waitForElementVisible(findTestObject('ObjectSpy/Login/inpt_username'), 0)

WebUI.comment('Masuk section Login')

WebUI.setText(findTestObject('ObjectSpy/Login/inpt_username'), username)

WebUI.setText(findTestObject('ObjectSpy/Login/inpt_password'), password)

WebUI.click(findTestObject('ObjectSpy/Login/btn_Login'))

WebUI.waitForElementVisible(findTestObject('ObjectSpy/Appointment/h2_Make Appointment'), 0)

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Appointment/h2_Make Appointment'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Masuk section Appointment')

WebUI.click(findTestObject('ObjectSpy/Homepage/btn_menu-toggle'))

WebUI.verifyElementNotPresent(findTestObject('ObjectSpy/Homepage/btn_nav_Login'), 1)

WebUI.click(findTestObject('ObjectSpy/Homepage/btn_nav_Logout'))

WebUI.waitForElementVisible(findTestObject('ObjectSpy/Homepage/h1_HeaderCURAHealthcare'), 0)

WebUI.comment('Masuk section homepage (logout)')

WebUI.click(findTestObject('ObjectSpy/Homepage/btn_menu-toggle'))

WebUI.waitForElementVisible(findTestObject('ObjectSpy/Homepage/btn_nav_Login'), 0)

WebUI.verifyElementNotPresent(findTestObject('ObjectSpy/Homepage/btn_nav_Logout'), 1)

WebUI.delay(3)

WebUI.closeBrowser()

