SANDBOX DEMO

IDE Utilizado: IntelliJ IDEA CE


| TOOLSET     | COMENTARIO                                                       | PRE-REQUISITO                                                        |
|-------------|------------------------------------------------------------------|----------------------------------------------------------------------|
| DOCKER      | Corriendo sobre Windows, contenedores Linux                      | [WSL2](https://docs.microsoft.com/en-us/windows/wsl/install-manual)  |
| SPRING BOOT | Proyecto creado en [Spring Initializr](https://start.spring.io/) | [OpenJDK-11](https://docs.microsoft.com/es-mx/java/openjdk/download) |
| MAVEN       | En Contenedor                                                    | [DOCKER](https://www.docker.com/products/docker-desktop)                                                           |

###### ** REVISAR ARCHIVO .ENV **

Test:

En directorio del proyecto ejecutar "docker-compose up"

Una vez levantado el proyecto en el contenedor, abrir http://localhost:8080/
