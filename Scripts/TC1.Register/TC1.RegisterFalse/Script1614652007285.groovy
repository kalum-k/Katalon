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

WebUI.navigateToUrl('http://localhost/alumni/index.php/welcome/reg_alumni')

WebUI.setText(findTestObject('Object Repository/Page_/input__card_id'), '1730501138678')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_-                                   _e88667'), 
    'นางสาว', true)

WebUI.setText(findTestObject('Object Repository/Page_/input__fname'), 'สิรินทร์รัตน์')

WebUI.setText(findTestObject('Object Repository/Page_/input__lname'), 'ปานประดิษฐ์')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_-                                   _517805'), 
    'หญิง', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_  _p_number'), '129')

WebUI.setText(findTestObject('Object Repository/Page_/input__p_road'), '-')

WebUI.setText(findTestObject('Object Repository/Page_/input__p_district'), 'บางปลา')

WebUI.setText(findTestObject('Object Repository/Page_/input__p_amphoe'), 'บางเลน')

WebUI.setText(findTestObject('Object Repository/Page_/input__p_province'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/Page_/input__p_zipcode'), '73130')

WebUI.setText(findTestObject('Object Repository/Page_/input__tel'), '0958638389')

WebUI.setText(findTestObject('Object Repository/Page_/input_Facebook_facebook'), '้hna')

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_email'), 'hna@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_/input__student_id'), '614259029')

WebUI.setText(findTestObject('Object Repository/Page_/input__group'), '61/47')

WebUI.setText(findTestObject('Object Repository/Page_/input__branch'), 'วิศวกรรมซอฟต์แวร์')

WebUI.setText(findTestObject('Object Repository/Page_/input__faculty'), 'วิทยาศาสตร์')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_-                                   _517805_1'), 
    'ภาคเรียนปกติ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_-                                   _e88667_1'), 
    'ปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_-                            2553   _91abaf'), 
    '2561', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_-                            2553   _91abaf_1'), 
    '2563', true)

WebUI.setText(findTestObject('Object Repository/Page_/textarea__outstanding_work'), '-')

WebUI.setText(findTestObject('Object Repository/Page_/input__position'), 'CEO')

WebUI.setText(findTestObject('Object Repository/Page_/input__company'), 'home')

WebUI.setText(findTestObject('Object Repository/Page_/input__c_tel'), '0958638389')

WebUI.setText(findTestObject('Object Repository/Page_/input_  _c_number'), '129')

WebUI.setText(findTestObject('Object Repository/Page_/input__c_road'), '-')

WebUI.setText(findTestObject('Object Repository/Page_/input__c_district'), 'บางปลา')

WebUI.setText(findTestObject('Object Repository/Page_/input__c_amphoe'), 'บางเลน')

WebUI.setText(findTestObject('Object Repository/Page_/input__c_province'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/Page_/input__c_zipcode'), '73130')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.back()

WebUI.verifyTextPresent('ลงทะเบียน', false)

WebUI.closeBrowser()

