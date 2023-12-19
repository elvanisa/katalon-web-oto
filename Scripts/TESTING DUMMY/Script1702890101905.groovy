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

/*
def my_username = "Mas Bambang"

println("Usernameku: "+ my_username)

WebUI.comment(my_username)
*/
/*
String isi_dari_string = "Ini adalah String"

println('Isi dari string: '+ isi_dari_string)
*/

/*
Integer angka1 = 2
Integer angka2 = 3
Integer jumlah = angka1 + angka2
println('Hasil penjumlahan: '+ jumlah)
*/

/*
boolean default_true = false
if(default_true == true)
	{
		println ("hasilnya pasti true")
	}
	else {
		println("hasilny lain nih")
	}
*/

String userDirectory = System.getProperty('user.dir')

println ('path projectnya: '+userDirectory)

String filePath = userDirectory + '/DUMMYASSET/fileimage.png'

println ('path LOKASI FILENYA: '+filePath)
