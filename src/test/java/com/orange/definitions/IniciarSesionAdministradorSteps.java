package com.orange.definitions;

import static org.testng.Assert.assertEquals;

import com.orange.pages.DashboardPage;
import com.orange.pages.LoginPage;
import com.orange.utils.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IniciarSesionAdministradorSteps extends Base {
	
	LoginPage loginPage = new LoginPage();
	DashboardPage dashboardPage = new DashboardPage();
	
	@Given("Estoy en la página de inicio de sesión")
	public void estoy_en_la_página_de_inicio_de_sesión() {
		driver.get(BASE_URL);
	}

	@When("ingreso mi usuario")
	public void ingreso_mi_usuario() {
		driver.findElement(loginPage.txtUsername).sendKeys("Admin");
	}

	@When("ingreso mi contraseña")
	public void ingreso_mi_contraseña() {
		driver.findElement(loginPage.txtPassword).sendKeys("admin123");
	}

	@When("doy clic en el botón login")
	public void doy_clic_en_el_botón_login() throws InterruptedException {
		driver.findElement(loginPage.btnLogin).submit();
		Thread.sleep(2000);
	}

	@Then("inicio sesion correctamente")
	public void inicio_sesion_correctamente() {
		String header = driver.findElement(dashboardPage.header).getText();
	    assertEquals(header, "Dashboard");
	}

}
