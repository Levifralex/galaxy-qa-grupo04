package com.orange.pages;

import org.openqa.selenium.By;

public class ListadoEmpleadoPage {
	public By menuPIM = By.xpath("//*[@class=\"oxd-sidepanel-body\"]/ul/li[2]/a");
	public By btnAdd = By.xpath("//*[@class=\"orangehrm-paper-container\"]/div/button");
	public By btnSearch = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[1]/div[2]/form/div[2]/button[2]");
	public By employeeName = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input");
	public By employmentStatus = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div");
	public By employeeId = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input");
	public By countRecords = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[2]/div[2]/div/span");

	public By btnEdit = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[2]");
	public By btnDelete = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[1]");

	public By confirmDelete = By.xpath("//*[@class=\"oxd-dialog-container-default\"]/div/div/div[3]/button[2]");
	
	public By dataColumnEmployee = By.xpath("//*[@class=\"oxd-layout-context\"]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div");
	public By textSuccess = By.className("oxd-text--toast-title");

}
