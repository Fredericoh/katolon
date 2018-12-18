import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Hands on teste/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars (1) (1)'))

WebUI.click(findTestObject('Object Repository/Hands on teste/Page_CURA Healthcare Service/a_Login (1)'))

WebUI.setText(findTestObject('Object Repository/Hands on teste/Page_CURA Healthcare Service/input_Username_username (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/Hands on teste/Page_CURA Healthcare Service/input_Username_username (1) (1)'), 
    'John Doe')

WebUI.rightClick(findTestObject('Object Repository/Hands on teste/Page_CURA Healthcare Service/input_Demo account_form-contro_1 (1) (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Hands on teste/Page_CURA Healthcare Service/input_Password_password (1) (1)'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Hands on teste/Page_CURA Healthcare Service/button_Login'))

WebUI.closeBrowser()

