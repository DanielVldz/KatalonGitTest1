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

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/div_Listado'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/div_Todas las plazas_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/span_Mazatln'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/svg_Selecciona el mes_mat-datepicker-toggle_9b036a'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/div_28'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/span_Consultar reservaciones'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/input_1_search'), 
    'astolfo')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/mat-icon_create'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/div_Prereservado_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/span_Reservado'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Reservacion/CambiarEstadoReservacionL/Page_Gastiganto Admin/span_Actualizar'))

WebUI.delay(6)

