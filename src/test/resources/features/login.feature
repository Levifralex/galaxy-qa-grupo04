Feature: Inicio y cierre de sesion.

@iniciarSesion 
Scenario: Iniciar sesión con Administrador
	Given Estoy en la página de inicio de sesión
	When ingreso mi usuario
	And ingreso mi contraseña
	And doy clic en el botón login
	Then inicio sesion correctamente
	
@CerrarSesion 
Scenario: Cerrar Sesión
	Given que estoy logeado
	When me dirigo al menú de usuario
	And doy clic en logout
	Then el usuario está desconectado