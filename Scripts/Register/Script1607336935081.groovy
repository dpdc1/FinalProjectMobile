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

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - CREATE A PROFILE'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - First Name'), 'Deo', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Last Name'), 'PDC', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Country'), 'Indonesia', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Username'), 'deo.pdc', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Password'), '12345', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Confirm Password'), '12345', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Create Profile'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - deo.pdc'), 'deopdc', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

