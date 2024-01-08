# springcoredemo
Spring Core concepts:

Inversion Of Control:
   The approach of outsourcing the contruction and management of objects.
Spring Container:
   Primary Functions: create and manage objects[Inversion of Control]
   Inject Object Dependencies[Dependency Injection]
We use Java Annotations and java source code
Dependency Injection: The Client delegates to another object the responsibility of providing its dependencies.
Instead of defining and assigning and initialization of objects, Dependency Injection takes care of all those things
Injection Types: 
Constructor Injection -- Use this when you have required dependencies
Setter Injection -- Use this when you have optional dependencies[inject dependencies by calling setter method on your class]
We can use Autowired Annotation for dependency injection --- spring will look for a class that matches by type[class/interface]
Example:  Injection of Coach Implementation
           1.Spring will scan for @Components
          2.Anyone implements the Coach Interface
          3.if so,lets inject them
@Component --- marks the class as Spring Bean and makes the bean available for dependency Injection
@SpringBootApplication --- enables--- Auto Configuration --Component Scanning--Additional Configuration
                       Composed of 3 annotations--- 
                        @EnableAutoConfiguration -- enables spring boot's auto-configuration support
                        @ComponentScan -- enable component scanning of current package and sub-packages
                       @Configuration -- able to register extra beans with @Bean /import other configuration classes
scanBasePackages={" "," ",} used for other packages other than current/subpackage

@Qualifier-- specify the bean id [Same name as class,first character lower-case] -- in specifying autowire dependency
@Primary -- specifies this is the bean which needs to inject itself in the Component
Moreover if you mix Qualifier and Primary, Qualifier has higher priority.

Lazy Initialization -- instead of creating all beans up front, a bean can be initizalied only if it is needed for dependency injection or it is explicitly requested by adding @Lazy annotation.
spring.main.lazy-initialization == true --global configuration for all beans 
one disadvantage is if you may not discover configuration issues until too late


Bean Scopes:
   refers to lifecycle of a bean
   default scope --singleton-- creates only one instance of the bean
   @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) --leaves upto implementation class
   we have singleton,prototype,request,session and global-session
   Bean LifeCycle:
       Container Started-- Bean Instantiated --- Dependencies Injected --Internal Spring Processing -- Your Custom Init Method-bean is ready to use -- Container is shutdown-- Your custom Destroy Method -STOP
      lifecycle methods--- @PostConstruct and @PreDestroy
   @Bean Annotation --- make an existing third-party class available for spring framework where we may not have access to the source code of third-party class and howeever we would like to use the third party class as a Spring Bean
   


