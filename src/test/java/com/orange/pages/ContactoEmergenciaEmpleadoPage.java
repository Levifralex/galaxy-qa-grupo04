package com.orange.pages;

import org.openqa.selenium.By;

public class ContactoEmergenciaEmpleadoPage {

	public By menuEmergencyContacts = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a");
	public By txtNameContact = By.xpath("//*[@class=\"oxd-form\"]/div[1]/div/div[1]/div/div[2]/input");
	public By txtRelationShipContact = By.xpath("//*[@class=\"oxd-form\"]/div[1]/div/div[2]/div/div[2]/input");
	public By txtHomeTelephoneContact = By.xpath("//*[@class=\"oxd-form\"]/div[2]/div/div[1]/div/div[2]/input");
	public By txtMobileContact = By.xpath("//*[@class=\"oxd-form\"]/div[2]/div/div[2]/div/div[2]/input");
	
	public By btnAdd = By.xpath("//*[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/div/button");
	public By btnSave = By.xpath("//*[@class=\"oxd-form\"]/div[3]/button[2]");
	
}
