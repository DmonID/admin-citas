# Sistema de administración de citas

* Descripción del proyecto
* Instalación y configuración
* Uso del programa
* Créditos
* Licencia

## Descripción del proyecto

Sistema de administración de citas es un programa en Java que simula un sistema de gestión de citas para un consultorio clínico. El programa permite dar de alta doctores, pacientes y citas, y relacionarlas entre sí. El programa también tiene un control de acceso mediante administradores, que son los únicos que pueden acceder al sistema.

El programa cuenta con las siguientes funcionalidades:

- Dar de alta doctores: se pueden registrar los doctores del consultorio médico, con su identificador, nombre, especialidad y contraseña.
- Dar de alta pacientes: se pueden registrar los pacientes que acudan al consultorio médico, con su identificador, nombre y contraseña.
- Crear una cita con fecha y hora: se pueden crear múltiples citas, con su identificador, fecha, hora y motivo. Cada cita debe estar relacionada con un doctor y un paciente.
- Tener control de acceso mediante administradores: solo los usuarios registrados como doctores o pacientes pueden acceder al sistema, mediante su identificador y contraseña. Los administradores pueden ver y modificar toda la información, mientras que los doctores y pacientes solo pueden ver y modificar la información relacionada con ellos.

## Instalación y configuración

Para instalar y configurar el proyecto, se deben seguir los siguientes pasos:

1. Clonar el repositorio de GitHub usando el comando:

```bash
git clone https://github.com/DmonID/admin-citas.git
```

2. Abrir el proyecto con IntelliJ IDEA y esperar a que se resuelvan las dependencias.
3. Ejecutar el programa desde la clase Principal.java.

## Uso del programa

Para usar el programa, se deben seguir los siguientes pasos:

* Ingresar al sistema con un identificador y una contraseña de administrador, doctor o paciente.
* Elegir una opción del menú principal: dar de alta doctores, dar de alta pacientes, crear una cita o salir.
* Seguir las instrucciones que se muestran en la pantalla para cada opción.
* Ver los resultados que se muestran en la pantalla o en los archivos de texto.

## Créditos

Este proyecto fue realizado por @DmonID como parte de la evidencia del curso Computación en Java. 

## Licencia

Este proyecto está bajo la licencia MIT, lo que significa que puedes usar, copiar, modificar y distribuir el código libremente, siempre y cuando reconozcas la autoría original y no lo uses con fines comerciales.
