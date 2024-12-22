# Chapter 02
Spring Boot In Practice Book Chapter02

tl;dr
```bash
# build
mvn compile

# test
mvn test

# Create package (e.g., JAR/WAR) without running tests
mvn package -DskipTests

# run jar
java -jar ./target/YOUR_JAR.jar
```

Basic build scripts:
```bash
# build
mvn compile

# test
mvn test

# Create package (e.g., JAR/WAR) without running tests
mvn package -DskipTests

# Clean and create package
mvn clean package

# Install to local repository without running tests
mvn clean install -DskipTests

# Building Specific Profiles
mvn clean install -P profile-name

# Build with different java version
mvn clean install -Dmaven.compiler.source=11 -Dmaven.compiler.target=11
```

Run jar file:
```bash
java -jar ./target/YOUR_JAR.jar
```
