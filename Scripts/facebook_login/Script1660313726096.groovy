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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'), 'bela@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_pass'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/div_The password that youve entered is inco_890204'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'), 'belakjh')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_pass'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/div_The email address or mobile number you _93c7eb'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/div_Forgotten password'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/a_Forgotten password'))

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/a_Not you'))

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'))

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/a_Cancel'))

WebUI.closeBrowser()

