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

boolean hospital_readmission = true

String facility = 'Seoul CURA Healthcare Center'

String visit_date = '30/07/2024'

String comment = 'comment like and subscribe'

String healthcare_program = 'Medicaid'

WebUI.callTestCase(findTestCase('Login/block-login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('ObjectSpy/Appointment/drop_facility'), facility, false)

if (hospital_readmission == true) {
    WebUI.check(findTestObject('ObjectSpy/Appointment/inpt_hospital_readmission'))
}

def select_radio = healthcare_program

switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.click(findTestObject('ObjectSpy/Appointment/radio_programs_Medicare'))

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.click(findTestObject('ObjectSpy/Appointment/radio_programs_Medicaid'))

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.click(findTestObject('ObjectSpy/Appointment/radio_programs_None'))

        break
    default:
        println(select_radio)

        WebUI.click(findTestObject('ObjectSpy/Appointment/radio_programs_None'))

        break
}

WebUI.setText(findTestObject('ObjectSpy/Appointment/inpt_visit_date'), visit_date)

WebUI.setText(findTestObject('ObjectSpy/Appointment/inpt_comment'), comment)

WebUI.click(findTestObject('ObjectSpy/Appointment/btn_BookAppointment'))

WebUI.comment('Navigate to appointment confirmation')

WebUI.waitForElementVisible(findTestObject('ObjectSpy/Appointment-Confirmation/h2_Appointment Confirmation'), 0)

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Appointment-Confirmation/h2_Appointment Confirmation'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Appointment-Confirmation/txt_Please be informed txt'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Appointment-Confirmation/btn_GoToHomepage'))

WebUI.comment('Verify data appointment')

WebUI.verifyElementText(findTestObject('ObjectSpy/Appointment-Confirmation/txt_facility'), facility)

if (hospital_readmission == true) {
    WebUI.verifyElementText(findTestObject('ObjectSpy/Appointment-Confirmation/txt_hospital_readmission'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('ObjectSpy/Appointment-Confirmation/txt_hospital_readmission'), 'No')
}

def path_text_program = findTestObject('ObjectSpy/Appointment-Confirmation/txt_program')

//switch (select_radio) {
//	
//	case select_radio = 'medicare':
//		println(select_radio)
//		WebUI.verifyElementText(path_text_program, 'Medicare')
//		break
//	case select_radio = 'medicaid':
//		println(select_radio)
//		WebUI.verifyElementText(path_text_program, 'Medicaid')
//		break
//	case select_radio = 'none':
//		println(select_radio)
//		WebUI.verifyElementText(path_text_program, 'None')
//		break
//	default:
//		println(select_radio)
//		WebUI.verifyElementText(path_text_program, 'None')
//		break
//}
/*
 * konsep compare value:
 * GET TEXT dari suatu object (path_text_program)
 * lalu, gunakan verifymatch (WebUI.verifyMatch)
 * */
String result_text_program = WebUI.getText(path_text_program)

switch (result_text_program) {
    case result_text_program = 'Medicare':
        println(result_text_program)

        WebUI.verifyMatch(result_text_program, healthcare_program, true)

        break
    case result_text_program = 'Medicaid':
        println(result_text_program)

        WebUI.verifyMatch(result_text_program, healthcare_program, true)

        break
    case result_text_program = 'None':
        println(result_text_program)

        WebUI.verifyMatch(result_text_program, healthcare_program, true)

        break
    default:
        println(result_text_program)

        WebUI.verifyMatch(result_text_program, healthcare_program, true)

        break
}

WebUI.delay(0)

WS.sendRequest(findTestObject(null))

