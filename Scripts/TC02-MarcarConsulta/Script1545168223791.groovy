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

WebUI.click(findTestObject('Object Repository/Consulta/a_Make Appointment'))

WebUI.rightClick(findTestObject('Object Repository/Consulta/input_Demo account_form-contro'))

WebUI.rightClick(findTestObject('Object Repository/Consulta/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Consulta/input_Username_username'), 'John Doe')

WebUI.rightClick(findTestObject('Object Repository/Consulta/input_Demo account_form-contro_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Consulta/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Consulta/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Consulta/select_Tokyo CURA Healthcare C'), 'Hongkong CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Object Repository/Consulta/label_Apply for hospital readm'))

WebUI.click(findTestObject('Object Repository/Consulta/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('Object Repository/Consulta/td_11'))

WebUI.setText(findTestObject('Object Repository/Consulta/textarea_Comment_comment'), 'Consulta')

WebUI.click(findTestObject('Object Repository/Consulta/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Consulta/p_Go to Homepage'))

