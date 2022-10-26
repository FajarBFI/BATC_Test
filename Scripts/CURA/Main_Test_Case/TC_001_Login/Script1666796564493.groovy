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
def TestCase_Folder_Name = "TC_001_Login\\"

//=================================================== Script ===================================================
WebUI.openBrowser(GlobalVariable.url_cura)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('General_Object/btn_Link-General',[('PARAM') : 'btn-make-appointment']), 5)

WebUI.click(findTestObject('General_Object/btn_Link-General',[('PARAM') : 'btn-make-appointment']))

WebUI.verifyElementPresent(findTestObject('General_Object/txt_General',[('PARAM') : 'txt-username']), 5)

WebUI.setText(findTestObject('General_Object/txt_General',[('PARAM') : 'txt-username']), GlobalVariable.username)

WebUI.setText(findTestObject('General_Object/txt_General',[('PARAM') : 'txt-password']), GlobalVariable.password)

WebUI.takeScreenshot(GlobalVariable.ProjectFolder + TestCase_Folder_Name + 'Login_User_CURA' + GlobalVariable.JPG_Format,
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General_Object/btn_General',[('PARAM') : 'btn-login']))

WebUI.verifyElementPresent(findTestObject('General_Object/slc_General',[('PARAM') : 'combo_facility']), 5)

WebUI.takeScreenshot(GlobalVariable.ProjectFolder + TestCase_Folder_Name + 'Login_User_CURA_Success' + GlobalVariable.JPG_Format,
	FailureHandling.STOP_ON_FAILURE)

//WebUI.closeBrowser()//Enable apabila ingin melakukan dry test