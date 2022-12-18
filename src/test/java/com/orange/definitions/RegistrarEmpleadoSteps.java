package com.orange.definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import com.orange.pages.ContactoEmergenciaEmpleadoPage;
import com.orange.pages.ListadoEmpleadoPage;
import com.orange.pages.LoginPage;
import com.orange.pages.RegistroEmpleadoPage;
import com.orange.utils.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrarEmpleadoSteps extends Base {
	LoginPage loginPage = new LoginPage();
	ListadoEmpleadoPage listEmpleadoPage = new ListadoEmpleadoPage();
	RegistroEmpleadoPage regEmpleadoPage = new RegistroEmpleadoPage();
	ContactoEmergenciaEmpleadoPage contEmergenciaEmpleadoPage = new ContactoEmergenciaEmpleadoPage();
	
	@Given("que inicio sesion correctamente")
	public void que_inicio_sesion_correctamente() throws InterruptedException {
		driver.get(BASE_URL);
		driver.findElement(loginPage.txtUsername).sendKeys(USER_ADMIN);
		driver.findElement(loginPage.txtPassword).sendKeys(PASSWORD_ADMIN);
		driver.findElement(loginPage.btnLogin).submit();
		Thread.sleep(MILI_SECONDS);
	}

	@When("me dirigo al menu PIM")
	public void me_dirigo_al_menu_pim() throws InterruptedException {
		driver.findElement(listEmpleadoPage.menuPIM).click();
		Thread.sleep(MILI_SECONDS);
	}

	@When("doy clic en Agregar")
	public void doy_clic_en_agregar() throws InterruptedException {
		driver.findElement(listEmpleadoPage.btnAdd).click();
		Thread.sleep(MILI_SECONDS);		
	}

	@When("completo el primer nombre {string}")
	public void completo_el_primer_nombre(String string) {
		driver.findElement(regEmpleadoPage.txtFirstName).sendKeys(string);
	}

	@When("segundo nombre {string}")
	public void segundo_nombre(String string) {
		driver.findElement(regEmpleadoPage.txtMiddleName).sendKeys(string);
	}

	@When("primer apellido {string}")
	public void primer_apellido(String lastName) {
		driver.findElement(regEmpleadoPage.txtLastName).sendKeys(lastName);
	}

	@When("hago clic en el boton guardar para crear empleado")
	public void hago_clic_en_el_boton_guardar_para_crear_empleado() throws InterruptedException {
		driver.findElement(regEmpleadoPage.btnSave).submit();
		Thread.sleep(MILI_SECONDS);
	}

	@Then("se ha creado el empleado")
	public void se_ha_creado_el_empleado() {
	 	String header = driver.findElement(listEmpleadoPage.textSuccess).getText();
	    assertEquals(header, "Success");
	}
	
	@When("indico nombre de empleado {string}")
	public void indico_nombre_de_empleado(String employee_name) {
		driver.findElement(listEmpleadoPage.employeeName).sendKeys(employee_name);
	}

	@When("indico el id del empleado {string}")
	public void indico_el_id_del_empleado(String employee_id) {
		driver.findElement(listEmpleadoPage.employeeId).sendKeys(employee_id);
	}
	@When("estado de empleado {string}")
	public void estado_de_empleado(String string) {
		driver.findElement(listEmpleadoPage.employmentStatus).sendKeys(string);
	}

	@When("doy clic en buscar")
	public void doy_clic_en_buscar() {
		driver.findElement(listEmpleadoPage.btnSearch).click();
	}

	@Then("valido si encuentro resultados")
	public void valido_si_encuentro_resultados() {
		String verificacion = driver.findElement(listEmpleadoPage.countRecords).getText();
		assertNotEquals(verificacion, "No Records Found");
	}
	
	@When("indico el id del empleado {string}")
	public void completo_el_id_del_empleado(String employee_id) {
		driver.findElement(listEmpleadoPage.employeeId).sendKeys(employee_id);
	}
	
	@When("doy clic en la fila")
	public void doy_clic_en_la_fila() throws InterruptedException {
		driver.findElement(listEmpleadoPage.btnEdit).click();
		Thread.sleep(MILI_SECONDS);
	}

	@When("doy clic en contacto de emergencia")
	public void doy_clic_en_contacto_de_emergencia() throws InterruptedException {
		driver.findElement(contEmergenciaEmpleadoPage.menuEmergencyContacts).click();
		Thread.sleep(MILI_SECONDS);
	}

	@When("lleno el nombre {string}")
	public void lleno_el_nombre(String string) {
		driver.findElement(contEmergenciaEmpleadoPage.txtNameContact).sendKeys(string);
	}

	@When("relacion {string}")
	public void relacion(String relation_ship) {
		driver.findElement(contEmergenciaEmpleadoPage.txtRelationShipContact).sendKeys(relation_ship);
	}

	@When("telefono de casa {string}")
	public void telefono_de_casa(String telephone_home) {
		driver.findElement(contEmergenciaEmpleadoPage.txtHomeTelephoneContact).sendKeys(telephone_home);
	}

	@When("celular {string}")
	public void celular(String celular) {
		driver.findElement(contEmergenciaEmpleadoPage.txtMobileContact).sendKeys(celular);
	}

	@When("doy clic en guardar")
	public void doy_clic_en_guardar() {
		driver.findElement(contEmergenciaEmpleadoPage.btnSave).submit();
	}

	@Then("el contacto de emergencia es agregado al empleado")
	public void el_contacto_de_emergencia_es_agregado_al_empleado() {
		String textElement = driver.findElement(listEmpleadoPage.textSuccess).getText();
		assertEquals(textElement, "Success");
	}

	@When("busco el empleado por nombre {string}")
	public void busco_el_empleado_por_nombre(String name_employee) {
		driver.findElement(listEmpleadoPage.employeeName).sendKeys(name_employee);
	}

	@When("verificamos resultado obtenido")
	public void verificamos_resultado_obtenido() {
	 	String texto = driver.findElement(listEmpleadoPage.employeeId).getText();
		String textoColumna = driver.findElement(listEmpleadoPage.dataColumnEmployee).getText();
		assertEquals(texto, textoColumna);
	}

	@When("doy clic en el boton eliminar")
	public void doy_clic_en_el_boton_eliminar() {
		driver.findElement(listEmpleadoPage.btnDelete).click();
	}

	@When("confirmo eliminacion")
	public void confirmo_eliminacion() {
		driver.findElement(listEmpleadoPage.confirmDelete).click();
	}

	@Then("el usuario se elimino correctamente")
	public void el_usuario_se_elimino_correctamente() {
		String textElement = driver.findElement(listEmpleadoPage.textSuccess).getText();
		assertEquals(textElement, "Success");
	}

}
