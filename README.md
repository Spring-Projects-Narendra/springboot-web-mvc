# springboot-web-mvc 

- Springboot is basically made for rest application so by default it does not support jsp. To add jsp support:

  * We need to add 'tomcat-jasper' dependency.
  
  * Configure Internal resource view resolver or in application.properties file need to add property.

  * Bydeault springboot search inside webapp folder, therefore we need to create one webapp folder and put pages inside it.
  
  * Instead of using @RestController annotation, we need to use @Controller annotation.

- @SpringBootApplication is a convenience annotation that adds all of the following:

    * @Configuration tags the class as a source of bean definitions for the application context.

    * @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.

    * @ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.
    
 # Added @Async functionality
