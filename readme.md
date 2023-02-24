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