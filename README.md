# spring-cloud-feign
A simple feign declarative web service client using spring cloud.

Feign makes writing web service clients easier. 
To use Feign create an interface and annotate it. It has pluggable annotation support including Feign annotations and JAX-RS annotations. 
Feign also supports pluggable encoders and decoders. 
Spring Cloud adds support for Spring MVC annotations and for using the same HttpMessageConverters used by default in Spring Web. 
Spring Cloud integrates Ribbon and Eureka to provide a load balanced http client when using Feign.

### prerequisites
1. Java 1.8
2. Maven 3.5.2
3. Tomcat 7
4. Postgresql 42.1.4
5. Spring Tool Suite IDE

### setup
1. Clone this project
2. Open EurekaFeignServer, EurekaFeignProducerClient and EurekaFeignConsumerClient as separate maven projects.
3. Update maven dependencies in all the three.
4. Take separate jar builds of all projects and run them on server.
5. Hit `http://localhost:8221` for the Eureka server portal.
6. Check the running instances for the `EUREKAFEIGNPRODUCERCLIENT` and `EUREKAFEIGNCONSUMERCLIENT`. This means both services are registered in Eureka Server.
7. Hit the below methods to invoke producer via consumer.

	`http://localhost:8223/consumer/get/<Any string>` and `http://localhost:8223/consumer/post/<Any string>`

### code style formatter
[Spring Boot Java Conventions](https://gist.github.com/jyotsnasanthosh/e2fb456f0ff91aa42ad8203e148bff79)
Save this as xml and import into eclipse -> window -> preferences -> java -> code style -> formatter