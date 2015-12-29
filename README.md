# learn-by-examples
This repository will hold development work for learning purposes

To run with maven

mvn compile exec:java
To build a "fat jar"

mvn package
To run the fat jar:

java -jar target/maven-simplest-3.2.0-fat.jar
(You can take that jar and run it anywhere there is a Java 8+ JDK. It contains all the dependencies it needs so you don’t need to install Vert.x on the target machine).

Now point your browser at http://localhost:8080
