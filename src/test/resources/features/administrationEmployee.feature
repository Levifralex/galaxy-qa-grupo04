Feature: Administración de Empleados y verificación de los mismos.
	
@regEmpleadoyUsuario
Scenario: Registrar Empleado y usuario
	Given Inicio sesion correctamente
	When me dirigo al menú PIM
	And doy clic en Add
	And completo la información correspondient
	And hago clic en el boton guardar para crear empleado y usuario
	Then se ha creado el empleado
	
@registrarEmplesoSinUsuario
Scenario: Registrar Empleado
Given Inicio sesion correctamente
	When me dirigo al menú PIM
	And doy clic en Add
	And completo la información correspondiente
	And hago clic en el boton guardar para crear empleado
	Then se ha creado el empleado
	And sus credenciales de acceso
	
@buscarEmpleado 
Scenario: Buscar Empleado
	Given que estoy logeado
	When me dirigo al menú PIM
	And completo el formulario de información
	And doy clic en search
	Then validar si encontraste resultados
	
@agregarContactoDeEmergenciaEmpleado 
Scenario: Agregar Contacto de Emergencia
	Given que estoy logeado
	When me dirigo al menu PIM
	And completo el formulario de busqueda
	And doy clic en search
	And seleccionaré usuario a editar
	And doy clic en la fila
	And doy clic en emergency contacts
	And doy clic en add
	And lleno el formulario
	And doy clic en save
	Then el contacto de emergencia es agregado al empleado

@eliminarEmpleado
Scenario: Eliminar Empleado
	Given que estoy logeado
	When me dirigo al menu PIM
	And creo un nuevo empleado
	And busco el empleado por nombre
	And doy click en el boton eliminar
	And confirmo eliminacion
	Then el usuario se elimino correctamente