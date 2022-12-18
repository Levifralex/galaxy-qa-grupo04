Feature: Administración de Empleados y verificación de los mismos.
	
@regEmpleadoyUsuario
Scenario: Registrar Empleado y usuario
	Given Inicio sesion correctamente
	When me dirigo al menu PIM
	And doy clic en Add
	And completo la información correspondient
	And hago clic en el boton guardar para crear empleado y usuario
	Then se ha creado el empleado
	
@registrarEmplesoSinUsuario
Scenario Outline: Registrar Empleado
Given que inicio sesion correctamente
	When me dirigo al menu PIM
	And doy clic en Agregar
	And completo el primer nombre "<firstName>"
	And segundo nombre "<middleName>"
	And primer apellido "<lastName>"
	And hago clic en el boton guardar para crear empleado
	Then se ha creado el empleado
	Examples:
	|	firstName			|	middleName		|	lastName					|
	|	Erick	 				|	Lizana				|	Nevado						|
	|	Andrés	 			|	Edg						|	Lizana						|
	|	Leonardo	 		|	 							|	Villegas					|

@buscarEmpleado 
Scenario Outline: Buscar Empleado
	Given que inicio sesion correctamente
	When me dirigo al menu PIM
	And indico nombre de empleado "<employee_name>"
	And estado de empleado "<employment_status>"
	And doy clic en buscar
	Then valido si encuentro resultados
	Examples:
	|	employee_name			|	employment_status		|
	|	Arturo						| 										|
	|	A									| Freelance						|
	|	Al								| Full-Time Permanent |
	
@agregarContactoDeEmergenciaEmpleado 
Scenario Outline: Agregar Contacto de Emergencia
	Given que inicio sesion correctamente
	When me dirigo al menu PIM
	And indico el id del empleado "<employee_id>"
	And doy clic en buscar
	And valido si encuentro resultados
	And doy clic en la fila
	And doy clic en contacto de emergencia
	And doy clic en agregar
	And lleno el nombre "<name>"
	And relacion "<relationship>"
	And telefono de casa "<home_telephone>"
	And celular "<celular>"
	And doy clic en guardar
	Then el contacto de emergencia es agregado al empleado
	Examples:
	|	employee_id			|	name							| relationship		| home_telephone 	| celular
	|	0221						|	Helen Perez				| Padre						| 9528358484 			| 
	|	0204						|	Domingo Ruiz			| Madre						|   							| 955825368
	|	007							|	Arnold Rodriguez	| Hermano					| 856239  				| 123456789
	

@eliminarEmpleado
Scenario: Eliminar Empleado
	Given que inicio sesion correctamente 
	When me dirigo al menu PIM
	And indico nombre de empleado "<employee_name>"
	And verificamos resultado obtenido
	And doy clic en el boton eliminar
	And confirmo eliminacion
	Then el usuario se elimino correctamente
	Examples:
	|	employee_name				|
	|	Erick Lizana Nevado	|
	|	Andrés Perez				|
	|	Leonardo Villegas		|
	