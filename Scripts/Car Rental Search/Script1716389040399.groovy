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

WebUI.callTestCase(findTestCase('Car Search/Open Car Rental Search Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/Car Rental Search Form/tab_Without Driver'))

WebUI.click(findTestObject('Homepage/Car Rental Search Form/input_Your Rental Location'))

WebUI.setText(findTestObject('Homepage/Car Rental Search Form/input_Your Rental Location'), 'Jakarta')

WebUI.verifyElementPresent(findTestObject('Homepage/Car Rental Search Form/h3_Location Search Result Jakarta'), 0)

WebUI.click(findTestObject('Homepage/Car Rental Search Form/h3_Location Search Result Jakarta'))

WebUI.callTestCase(findTestCase('Car Search/Add Start Date'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Car Search/Input Start Time'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Car Search/Add End Date'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/Car Rental Search Form/input_Rental End Date'))

WebUI.click(findTestObject('Homepage/Car Rental Search Form/data_Date Cell 29-5-2024'))

WebUI.click(findTestObject('Homepage/Car Rental Search Form/data_End Hour'))

WebUI.click(findTestObject('Homepage/Car Rental Search Form/data_End Minute'))

WebUI.click(findTestObject('Homepage/Car Rental Search Form/btn_Time Done'))

WebUI.click(findTestObject('Homepage/Car Rental Search Form/btn_Rental Search'))

WebUI.verifyElementPresent(findTestObject('Car Rental Search Result Page/h3_Daihatsu Ayla'), 0)

WebUI.click(findTestObject('Car Rental Search Result Page/btn_Continue'))

WebUI.verifyElementPresent(findTestObject('Car Rental Search Result Page/Car Providers List Page/text_Car Detail Information'), 
    0)

WebUI.closeBrowser()

