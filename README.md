# Heroku SparkWeb

En esta práctica de laboratorio, tiene como objetivo realizar aplicativo web diseñado en Java haciendo uso del framework Spark,para calcular la media y la  desviación estándar y media de un conjunto de n números reales, utilizando una Linked list para almacenar los n números para los cálculos.

## Información del proyecto 📁

Para ver detalle del darrollo de la práctica y concepto clave, puede consultar el documento del laboratorio que se creo en latex y esta en formato pdf:

> Para abrir informe del laboratorio [click acá](https://github.com/PaulaSanchez810/Lab2-AREP-Heroku/blob/master/Taller%20Heroku.pdf)

### Despliegue en Heroku

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://calculadora-app-arep.herokuapp.com/calculadoraArep)

### Integración Continua

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/PaulaSanchez810/Lab2-AREP-Heroku)

### Pre-requisitos 📜

* [Java 13.0.2](https://www.oracle.com/co/java/technologies/javase-jdk13-downloads.html)- Entorno de desarrollo.
* [Maven](https://maven.apache.org) - Gestión de dependencias.
* [Git](https://git-scm.com)- Sistema de control de versiones.
* [Spark](http://sparkjava.com) - framework para crear aplicaciones web

Asegúrate de tener estos programas instalados correctamente y la versión que necesitamos con los siguientes comandos:

```
mvn --version
```
```
git --version 
```
```
java -showversion 
```
### Instalación 💿

1. Clonar el repositorio

```
git clone https://github.com/PaulaSanchez810/AREP-2021-1-Lab1-Calculadora.git
```

2. Compila el proyecto:

```
mvn package
```
3. Ejecutando el programa:
> Para ejecutar la aplicación de manera local por consola
Distribución Windows:
```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.SparkWebApp
```
> Distribución Linux y MacOs
```
java  -cp target/classes:target/dependency/* edu.escuelaing.arep.SparkWebApp
```
De esta manera podemos ver que la aplicación esta corriendo de forma local

![](https://github.com/PaulaSanchez810/Lab2-AREP-Heroku/blob/master/img/ejecutando%20aplicacion.png)

> Para ver la aplicación de manera local 
```
 http://localhost:4567/calculadoraArep
```
veremos la aplicacación ejecutando localmente:
 
![](https://github.com/PaulaSanchez810/Lab2-AREP-Heroku/blob/master/img/Calculadora2.png)
 
4. Documentación JavaDoc
 
> por consola 

```
mvn javadoc:javadoc
```
> En Repositorio

[Apidocs](https://github.com/PaulaSanchez810/Lab2-AREP-Heroku/tree/master/site/apidocs)
## Ejecutando las pruebas ✅

En una terminal:

```
mvn test
```
![](https://github.com/PaulaSanchez810/Lab2-AREP-Heroku/blob/master/img/test.PNG)
## Construido con 🛠️

* [Java 13.0.2](https://www.oracle.com/co/java/technologies/javase-jdk13-downloads.html)- Entorno de desarrollo.
* [Maven](https://maven.apache.org) - Gestión de dependencias.
* [Git](https://git-scm.com)- Sistema de control de versiones.
* [Spark](http://sparkjava.com) - framework para crear aplicaciones web


## Autor ✒️

* Paula Andrea Guevara Sánchez

## Licencia 📄

Este proyecto está bajo la Licencia GNU General Public License - [LICENSE](https://github.com/PaulaSanchez810/Lab2-AREP-Heroku/blob/master/LICENSE.txt) 
