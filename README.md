# Dynamoss

Dynamoss es una aplicacion backend multi-proposito.

- Dynamoss se encargara de recibir request del frontend procesar dicha request y responder acorde a lo pedido.
- Se encargara de centralizar recursos que usen las distintas aplicaciones frontend, reduciendo asi la carga sobre estas mismas.
- Se encargara de almacenar todos los datos del frontend(User Login, User Configuration, etc).
- Se encargara de automaticamente obtener datos de servicios de terceros, procesarlos acorde a la necesidad y mandarlo al frontend.
- Se encargara de todo lo relacionado a las Sesiones de los usuarios.

## Deployment
The deployment is now done by render (previously was done on reailway). Please refer to issue #55 for the new deployment process.

- BASE-URL -> https://synamoss-service.onrender.com
- PCTOOLS-SERVICE -> https://synamoss-service.onrender.com/api/v1/pctools

## Servicios
- Servicio de tiendas Pctools - [PCTOOLS](https://synamoss-service.onrender.com/api/v1/pctools)
- Servicio obtencion de info github - [https://Servicio_ a_la_espera_de_implementarse](https://synamoss-service.onrender.com/)
## Swagger
UI para la visualizacion de los servicios de Dynamoss [Swagger UI](https://synamoss-service.onrender.com/swagger-ui/index.html#/)

## Instalacion

Clonar este proyecto usando [git](https://git-scm.com/).

```bash
git clone https://github.com/ihabfallahy2/dynamoss.git
```

## Uso local

```java
#comando 'clean install'
clean install

#comando 'run'
spring-boot:run

```

## Contribuciones

Son bienvenidos los pull request. Para cambios importantes, porfavor abrir una issue primero para discutir los cambios que se quieren realizar.

Por favor aseguraos de tener actualizados los tests como es debido.

## Licencia

[MIT](https://choosealicense.com/licenses/mit/) ©2023 HIITENFA, Inc. Todos los derechos reservados
