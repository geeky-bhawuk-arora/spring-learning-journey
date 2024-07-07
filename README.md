# Spring Learning Journey

## [Installing & Configuring Spring](https://medium.com/@xjfreddie/creating-a-maven-project-in-vscode-1f7de148ee55)


## Notes

- The pom.xml file defines project details (groupId, artifactId, version), dependencies, build plugins, and execution configurations.

### Compile and Package: 
```
  mvn clean package
```
- Compiles the project and packages it into a JAR file in the target/ directory.

### Run Application
```
  mvn exec:java -Dexec.mainClass="com.example.App"
```
- Executes the main class (App.java) using the exec-maven-plugin.




