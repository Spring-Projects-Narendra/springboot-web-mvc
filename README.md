# springboot-web-mvc 

- Springboot is basically made for rest application so by default it does not support jsp. To add jsp support:

  * We need to add 'tomcat-jasper' dependency.
  
  * Configure Internal resource view resolver or in application.properties file need to add property.

  * Bydeault springboot search inside webapp folder, therefore we need to create one webapp folder and put pages inside it.
  
  * Instead of using @RestController annotation, we need to use @Controller annotation.

