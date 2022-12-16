Feature: Cambio de contraseña de usuarios creados

@cambiarContraseña 
Scenario: Cambiar contraseña de usuario nuevo
	Given inicio sesion correctamente con usuario administrador
	When creo un nuevo empleado y usuario
	And cierro sesion del usuario administrador
	And inicio sesion correctamente con usuario nuevo
	And ingreso a opcion para cambiar contraseña
	And ingreso datos del formulario
	And cierro sesion del usuario nuevo
	And ingreso nueva contraseña
	Then accede correctamente tras cambiar contraseña