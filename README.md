# Dynamoss

Dynamoss es una aplicacion backend multi-proposito.

- Dynamoss se encargara de recibir request del frontend procesar dicha request y responder acorde a lo pedido.
- Se encargara de centralizar recursos que usen las distintas aplicaciones frontend, reduciendo asi la carga sobre estas mismas.
- Se encargara de almacenar todos los datos del frontend(User Login, User Configuration, etc).
- Se encargara de automaticamente obtener datos de servicios de terceros, procesarlos acorde a la necesidad y mandarlo al frontend.
- Se encargara de todo lo relacionado a las Sesiones de los usuarios.

## Deployment [DEPRECATED]
The deployment is done by railway

- BASE-URL -> ~~https://dynamoss-production.up.railway.app/api/v1/pctools/~~
- PCTOOLS-SERVICE -> ~~https://BASE-URL/api/v1/pctools/~~

## Servicios [DEPRECATED]
- Servicio de tiendas Pctools - ~~[PcTools Service](https://dynamoss-production.up.railway.app/api/v1/pctools/)~~
- Servicio obtencion de info github - ~~[...](https://Servicio_ a_la_espera_de_implementarse)~~
## Swagger [DEPRECATED]
UI para la visualizacion de los servicios de Dynamoss ~~[Swagger UI](https://dynamoss-production.up.railway.app/swagger-ui/index.html#/)~~

## Instalacion

Clona este proyecto usando [git](https://git-scm.com/).

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
