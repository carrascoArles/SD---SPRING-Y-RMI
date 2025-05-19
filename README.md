# Proyecto Spring RMI

Este proyecto es una base para implementar una aplicación distribuida usando Spring Boot y RMI (Remote Method Invocation).

## Características del Proyecto

- Framework: Spring Boot `3.4.5`
- Tipo de paquete: `JAR`
- Lenguaje: Java `17`
- Group ID: `org.grupo2`
- Artifact ID: `spring_rmi`

## Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Java 17 o superior
- Maven 3.8+
- IDE recomendado: Eclipse, VS Code

## Como ejecutar el proyecto

1. **Clona el repositorio**

```bash
git clone https://github.com/carrascoArles/SD---SPRING-Y-RMI.git
```
2. **Compilar el proyecto**

```bash
mvn compile
```
3. **Ejecutar el servidor**

```bash
java -cp target/classes org.grupo2.spring_rmi.Server
```
4. **Conectarse al servidor a traves del cliente**

```bash
mvn exec:java -Dexec.mainClass="org.grupo2.Cliente.MainCliente"
