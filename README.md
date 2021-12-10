# Logging Demo
Sample app exposing a JAX-RS Resource that logs all levels to each request.
WildFly profile is created in the maven-war-plugin under configuration section and it is attached to WildFly during deploy time.
Logging profile is useful if you want to achieve hot reload capabilities to logging subsystem.
### Requirements
1. JDK11
2. WildFly 14+
3. Maven 3.6+

### Build war file
mvn clean package
