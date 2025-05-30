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

WebUI.navigateToUrl('https://devexpress.github.io/testcafe/example/')

WebUI.setText(findTestObject('Object Repository/Page_TestCafe Example Page/input_Your name_name'), 'John')

WebUI.click(findTestObject('Object Repository/Page_TestCafe Example Page/input_Your name_populate'))

WebUI.click(findTestObject('Object Repository/Page_TestCafe Example Page/label_Support for testing on remote devices'))

WebUI.click(findTestObject('Object Repository/Page_TestCafe Example Page/input_Easy embedding into a Continuous inte_a0aaa1'))

WebUI.click(findTestObject('Object Repository/Page_TestCafe Example Page/input_Windows_os'))

WebUI.click(findTestObject('Object Repository/Page_TestCafe Example Page/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Thank you/h1_Thank you, John'), 'Thank you, John!')

WebUI.closeBrowser()

