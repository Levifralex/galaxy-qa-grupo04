Feature: Feature de prueba 
	Description: proposito de la prueba

Scenario: Registrar un nuevo empleado 
	Given El usuario inicia sesion
	When ingresa opcion pim
	When clic en el boton registrar empleado
	When ingresa datos del empleado
	Then se crear el empleado con exito