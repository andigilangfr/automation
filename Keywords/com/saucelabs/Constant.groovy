package com.saucelabs

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Constant {
	
	public static String pathLogin = 'Object Repository/LOGIN/'
	public static String pathDashboard = 'Object Repository/DASHBOARD/'
	public static String pathInformation = 'Object Repository/INFORMATION/'
	public static String pathOverview = 'Object Repository/OVERVIEW/'
	public static String pathCart = 'Object Repository/CART/'
	
	//LOGIN SECTION
	public static final String BUTTON_LOGIN = pathLogin + 'buttonLogin'
	public static final String FIELD_PASSWORD = pathLogin + 'fieldPassword'
	public static final String FIELD_USERNAME = pathLogin + 'fieldUsername'
	public static final String TEXT_PASSWORD_CREDENTIAL = pathLogin + 'textLoginPasswordCredential'
	public static final String TEXT_USERNAME_CREDENTIAL = pathLogin + 'textLoginUsernameCredential'
	
	//DASHBOARD SECTION
	public static final String BUTTON_ADD_TO_CART = pathDashboard + 'buttonAddToCart'
	public static final String BUTTON_SHOPPING_CART = pathDashboard + 'buttonShoppingCart'
	public static final String TEXT_PRICE_BACKPACK = pathDashboard + 'textPriceBackpack'
	public static final String TEXT_SAUCE_LABS_BACKPACK = pathDashboard + 'textSauceLabsBackpack'
	public static final String BUTTON_BURGER_MENU = pathDashboard + 'buttonBurgerMenu'
	public static final String BUTTON_LOGOUT = pathDashboard + 'buttonLogout'
	public static final String BUTTON_BACK_TO_PRODUCTS = pathDashboard + 'buttonBackToProducts'
	public static final String BUTTON_CART = pathDashboard + 'buttonCart'
	
	//CART SECTION
	public static final String BUTTON_CHECKOUT = pathCart + 'buttonCheckout'
	public static final String TEXT_PRICE_BACKPACK_CART = pathCart + 'textPriceBackpackCart'
	
	//INFORMATION SECTION
	public static final String FIELD_FIRST_NAME_INFORMATION = pathInformation + 'fieldFirstNameInformation'
	public static final String FIELD_LAST_NAME_INFORMATION = pathInformation + 'fieldLastNameInformation'
	public static final String FIELD_ZIP = pathInformation + 'fieldZip'
	public static final String BUTTON_CONTINUE = pathInformation + 'buttonContinue'
	
	//OVERVIEW SECTION
	public static final String TEXT_PRICE_BACKPACK_OVERVIEW = pathOverview + 'textPriceBackpackOverview'
	public static final String BUTTON_FINISH = pathOverview + 'buttonFinish'
	public static final String BUTTON_BACKHOME = pathOverview + 'buttonBackHome'
}
