# Spring Learning Journey 🌱

## [Installing & Configuring a Maven Project for Spring](https://medium.com/@xjfreddie/creating-a-maven-project-in-vscode-1f7de148ee55) 

- Assure that Maven is installed and its path is correctly set in your system environment variables.


## Notes

### Structure of pom.xml 
- The pom.xml file defines project details (groupId, artifactId, version), dependencies, build plugins, and execution configurations.
```
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                             http://maven.apache.org/maven-v4_0_0.xsd">
  
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.springlearning</groupId>
  <artifactId>01springdemo</artifactId>
  <version>1.0</version>
  <packaging>jar</packaging>
  <name>01springdemo</name>
  <url>http://maven.apache.org</url>

  <dependencies>
    <!-- Dependencies section -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  
  <build>
    <plugins>
      <!-- Plugins Section -->
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>3.0.0</version>
        <executions>
          <execution>
            <goals>
              <goal>java</goal>
            </goals>
            <configuration>
              <mainClass>com.springlearning.App</mainClass>
              <!-- Additional configurations can be added here -->
            </configuration>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>

</project>
```

📦 <packaging>: Specifies the packaging type as JAR.
📚 <dependencies>: Lists project dependencies.
🛠️ <build>: Configures Maven build process.
⚙️ <plugins>: Specifies Maven plugins used.
▶️ <goal>: Indicates the task (java in this case) to execute.
🚀 <mainClass>: Specifies the main class for execution.


### Compile and Package 📦
```
  mvn clean package
```
- Compiles the project and packages it into a JAR file in the target/ directory.


### Run Application ▶️
```
  mvn exec:java -Dexec.mainClass="com.springlearning.App
```
- Executes the main class (App.java) using the exec-maven-plugin.
