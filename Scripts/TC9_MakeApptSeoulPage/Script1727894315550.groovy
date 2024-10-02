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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/a_Login'))

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/input_Demo account_form-control_1'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/span_Demo account_glyphicon glyphicon-lock'))

WebUI.setEncryptedText(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/th_'))

WebUI.click(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/td_10'))

WebUI.setText(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/textarea_Comment_comment'), 'Seoul appointment')

WebUI.verifyElementText(findTestObject('Object Repository/TC9_MakeApptSeoulPage_OR/h2_Make Appointment'), 'Make Appointment')

WebUI.closeBrowser()

