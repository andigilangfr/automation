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
import com.saucelabs.Constant

WebUI.verifyElementText(findTestObject(Constant.TEXT_PRICE_BACKPACK_CART), GlobalVariable.priceTag)

WebUI.click(findTestObject(Constant.BUTTON_CHECKOUT))

WebUI.setText(findTestObject(Constant.FIELD_FIRST_NAME_INFORMATION), 'SAUCE')

WebUI.setText(findTestObject(Constant.FIELD_LAST_NAME_INFORMATION), 'LABS')

WebUI.setText(findTestObject(Constant.FIELD_ZIP), '0000')

WebUI.click(findTestObject(Constant.BUTTON_CONTINUE))

WebUI.verifyElementText(findTestObject(Constant.TEXT_PRICE_BACKPACK_OVERVIEW), GlobalVariable.priceTag)

WebUI.click(findTestObject(Constant.BUTTON_FINISH))

WebUI.click(findTestObject(Constant.BUTTON_BACKHOME))