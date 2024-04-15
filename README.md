# spring-boot-examples
spring boot example


## Project lists

### Make parent project
- initialize project
```
mvn archetype:generate -DinteractiveMode=false -DarchetypeArtifactId=pom-root -DarchetypeVersion=RELEASE -DarchetypeGroupId=org.codehaus.mojo.archetypes -DgroupId=demo-group -DartifactId=spring-boot-examples
```

### Make project spring-boot-hello
- Initialize project
```
spring init --build=maven --java-version=17 --description="spring boot hello request api" --packaging=jar --group-id=com.dc --artifact-id=spring-boot-hello --package-name=com.dc --dependencies=web --name=hello spring-boot-hello
```
- Change `pox.xml` add modules
```
  <modules>
    <module>spring-boot-hello</module>
  </modules>
```
- Run the project
```
mvn clean package -Dmaven.test.skip=true spring-boot:run --projects spring-boot-hello
```

- Add `controller/HelloController.java` file and Run application by last command then check with curl command
```
curl http://127.0.0.1:8080
```
