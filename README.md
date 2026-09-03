# SysDespacho-Conte

[![Integracion Continua](https://github.com/frankarone/SysDespacho-Conte-TIC/actions/workflows/ci.yml/badge.svg)](https://github.com/frankarone/SysDespacho-Conte-TIC/actions/workflows/ci.yml)

Proyecto académico TA1 de DevOps y CI/CD desarrollado con Java y Maven.

## Descripción

SysDespacho-Conte es un sistema para controlar y clasificar el despacho de contenedores de Agroindustrias Huaral.

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
    ├── ContainerDispatchTest.java
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

La aplicación crea un despacho de ejemplo y muestra el contenedor, cliente, destino y estado calculado.

## Pipeline CI/CD

El flujo `.github/workflows/ci.yml` se ejecuta automáticamente cuando se realiza un `push` o un `pull request` hacia la rama `main`.

La canalización realiza las siguientes tareas:

1. Descarga el código del repositorio.
2. Configura Java 21 y la caché de Maven.
3. Ejecuta las pruebas automatizadas.
4. Compila y genera el paquete JAR.
5. Copia el JAR a la carpeta temporal `staging`.
6. Publica el JAR como artefacto descargable.

Si una prueba falla, Maven devuelve un error y GitHub Actions detiene el pipeline. En ese caso no se ejecutan el empaquetado, el despliegue en `staging` ni la publicación del artefacto.

## Artefacto

Después de una ejecución exitosa en la rama `main`, el JAR puede descargarse desde la sección **Artifacts** de la ejecución correspondiente en GitHub Actions.

## Repositorio

[SysDespacho-Conte-TIC](https://github.com/frankarone/SysDespacho-Conte-TIC)