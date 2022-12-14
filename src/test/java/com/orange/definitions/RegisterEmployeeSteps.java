package com.orange.definitions;

import org.openqa.selenium.By;

import com.orange.utils.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterEmployeeSteps extends Base {

	@Given("El usuario inicia sesion")
	public void el_usuario_inicia_sesion() throws InterruptedException {
		//name input usuario => username
		//name input password => password
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).submit();
		Thread.sleep(10000);
		
	}

	@When("ingresa opcion pim")
	public void ingresa_opcion_pim() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("clic en el boton registrar empleado")
	public void clic_en_el_boton_registrar_empleado() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("ingresa datos del empleado")
	public void ingresa_datos_del_empleado() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("se crear el empleado con exito")
	public void se_crear_el_empleado_con_exito() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
