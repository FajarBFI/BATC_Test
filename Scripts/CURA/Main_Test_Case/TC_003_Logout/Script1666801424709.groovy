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
def TestCase_Folder_Name = "TC_003_Logout\\"

//=================================================== Script ===================================================

WebUI.click(findTestObject('General_Object/btn_Link-General',[('PARAM') : 'menu-toggle']))

WebUI.takeScreenshot(GlobalVariable.ProjectFolder + TestCase_Folder_Name + 'Logout_User_CURA' + GlobalVariable.JPG_Format,
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General_Object/btn_a-href-General',[('PARAM') : 'authenticate.php?logout']))

WebUI.verifyElementPresent(findTestObject('General_Object/btn_Link-General',[('PARAM') : 'btn-make-appointment']), 5)

WebUI.takeScreenshot(GlobalVariable.ProjectFolder + TestCase_Folder_Name + 'Logout_User_CURA_Success' + GlobalVariable.JPG_Format,
	FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()//Enable apabila ingin melakukan dry test