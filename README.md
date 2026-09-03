# SysDespacho-Conte

[![Integracion Continua](https://github.com/frankarone/SysDespacho-Conte-TIC/actions/workflows/ci.yml/badge.svg)](https://github.com/frankarone/SysDespacho-Conte-TIC/actions/workflows/ci.yml)

Proyecto académico TA1 de DevOps y CI/CD desarrollado con Java y Maven.

## Descripción

SysDespacho-Conte es un sistema básico para controlar y clasificar el despacho de contenedores de Agroindustrias Huaral.

Cada despacho se clasifica según el tiempo restante:

- `A_TIEMPO`: faltan más de 30 minutos.
- `PROXIMO`: faltan entre 0 y 30 minutos.
- `RETRASADO`: la hora programada ya pasó.

## Tecnologías

- Java 21
- Apache Maven
- JUnit
- Git y GitHub
- GitHub Actions

## Estructura principal

```text
src/
├── main/java/com/sysdespacho/
│   ├── App.java
│   ├── ContainerDispatch.java
│   ├── DispatchClassifier.java
│   └── DispatchStatus.java
└── test/java/com/sysdespacho/
    ├── AppTest.java
    └── DispatchClassifierTest.java
```

## Ejecutar las pruebas

```bash
mvn clean test
```

## Construir el proyecto

```bash
mvn clean package
```

El paquete se genera en:

```text
target/SysDespacho-Conte-1.0-SNAPSHOT.jar
```

## Ejecutar la aplicación

```bash
java -jar target/SysDespacho-Conte-1.0-SNAPSHOT.jar
```

## Integración y entrega continua

El flujo `.github/workflows/ci.yml` se ejecuta automáticamente cuando se realiza un `push` o un `pull request` hacia la rama `main`.

La canalización realiza las siguientes tareas:

1. Descarga el código del repositorio.
2. Configura Java 21.
3. Compila el proyecto.
4. Ejecuta las pruebas unitarias.
5. Genera el paquete JAR.
6. Publica el JAR como artefacto descargable.

## Repositorio

[SysDespacho-Conte-TIC](https://github.com/frankarone/SysDespacho-Conte-TIC)