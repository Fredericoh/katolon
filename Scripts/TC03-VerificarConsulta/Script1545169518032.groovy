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

WebUI.click(findTestObject('Object Repository/Verificar/a_Make Appointment'))

WebUI.rightClick(findTestObject('Object Repository/Verificar/input_Demo account_form-contro'))

WebUI.rightClick(findTestObject('Object Repository/Verificar/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Verificar/input_Username_username'), 'John Doe')

WebUI.rightClick(findTestObject('Object Repository/Verificar/input_Demo account_form-contro_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Verificar/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Verificar/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Verificar/select_Tokyo CURA Healthcare C'), 'Seoul CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Object Repository/Verificar/input_Apply for hospital readm'))

WebUI.click(findTestObject('Object Repository/Verificar/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/Verificar/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('Object Repository/Verificar/td_17'))

WebUI.setText(findTestObject('Object Repository/Verificar/textarea_Comment_comment'), 'Consulta')

WebUI.click(findTestObject('Object Repository/Verificar/button_Book Appointment'))

WebUI.check(findTestObject('Object Repository/Verificar/div_Appointment Confirmation'))

WebUI.click(findTestObject('Object Repository/Verificar/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Verificar/a_History'))

WebUI.check(findTestObject('Object Repository/Verificar/div_17122018'))

WebUI.click(findTestObject('Object Repository/Verificar/a_Go to Homepage'))

