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

//=================================================== Variable ===================================================
def TestCase_Folder_Name = "TC_002_Login\\"

//=================================================== Script ===================================================
//WebUI.click(findTestObject('Object Repository/slc_General',[('PARAM') : 'combo_facility']))
//WebUI.executeJavaScript("document.querySelector('.selectize-dropdown-content>[data-value=\"Hongkong CURA Healthcare Center\"]').click()", null)

//WebUI.selectOptionByIndex(findTestObject('Object Repository/slc_General',[('PARAM') : 'combo_facility']), 1)
WebUI.selectOptionByIndex(findTestObject('Object Repository/CURA/drpdown_Facility'), facility)

if(apply_hospital == 'Checked') {
WebUI.click(findTestObject('Object Repository/General_Object/chkbox_General',[('PARAM') : 'chk_hospotal_readmission']))
}

CustomKeywords.'cura.healthcare_program'(healthcare_program)

WebUI.setText(findTestObject('Object Repository/General_Object/txt_General',[('PARAM') : 'txt_visit_date']), visit_date)

WebUI.click(findTestObject('Object Repository/General_Object/txtarea_General',[('PARAM') : 'txt_comment']))

WebUI.setText(findTestObject('Object Repository/General_Object/txtarea_General',[('PARAM') : 'txt_comment']), comment)

WebUI.takeScreenshot(GlobalVariable.ProjectFolder + TestCase_Folder_Name + 'Input_Make_Appointment' + GlobalVariable.JPG_Format,
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General_Object/btn_General',[('PARAM') : 'btn-book-appointment']))

WebUI.verifyElementText(findTestObject('Object Repository/CURA/lbl_Header-Confirm'), label_confirm)

WebUI.takeScreenshot(GlobalVariable.ProjectFolder + TestCase_Folder_Name + 'Make_Appointment_Success' + GlobalVariable.JPG_Format,
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General_Object/btn_a-Class-General',[('PARAM') : 'btn btn-default']))

//WebUI.closeBrowser()//Enable apabila ingin melakukan dry test