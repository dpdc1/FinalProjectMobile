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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/imo1kjtbri/Downloads/FINAL PROJECTS/MOBILE/app-debug.apk', true)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - deo.pdc'), 'deopdc', 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - '), '12345', 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LOGIN'), 0)

Mobile.getText(findTestObject('Object Repository/Login/android.widget.TextView - Good evening, Deo. Welcome to the Bank App Demo. Happy Monday'), 
    0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - App Settings'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.CheckedTextView - Logout'), 0)

Mobile.getText(findTestObject('Object Repository/Login/android.widget.TextView - Bank App Demo'), 0)

Mobile.closeApplication()

