# Billetera Virtual
(Proyecto de la materia Especialización en Backend I - CTD)

## Stack utilizado
- IntelliJ IDEA 2022.3.1
- SDK corretto 17
- MySQL Server 8.0.32
- MySQL Workbench 8.0.32

## Instalación
### 1. Crear base de datos
- Desde MySQL Workbench crear una base de datos llamada `billetera_virtual`
- Crear un usuario con las siguientes caracteristicas:
  - usuario: grupo2
  - contraseña: BEgrupo2
  - rol: DBA
### 2. Clonar el repositorio 
- `git clone https://github.com/damianmicheli/billetera-virtual.git`
- Desde IntelliJ Idea `File / Open` y buscar la carpeta `billetera-virtual` creada con el git clone.
### 3. Ejecutar
- El orden de ejecución de los servicios es:
  - config-server
  - eureka-server
  - api-customer
  - api-wallet

## Estructura de carpetas del proyecto
### 1. Carpetas de microservicios
- **api-customer**: Microservicio de clientes de la aplicación.
- **api-wallet**: Microservicio de la billetera de la aplicación.
- **config-server**: Servidor de Spring Cloud Config para centralizar todas las configuraciones.
- **eureka-server**: Servidor de Eureka, para implementar el patron Service Discovery (un catalogo de servicios activos)
### 2. Otras carpetas
- **docs**: Documentación general (Consignas del TP, configuración de DB, etc.)
- **initializr**: Todos los templates utilizados, generados en https://start.spring.io/, con captura de pantalla de cada configuración. 
- **postman**: Export de los test de Postman.