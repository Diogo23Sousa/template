# TEMPLATE - Create your own projects
______________________________________________________
BACKEND - Java 17+ (Quarkus Framework)
1. Install JDK17, MAVEN and the needed dependencies: ``` mvn clean install ```
2. Open a terminal window and navigate to the root directory of your Quarkus project.
Execute the following command to build and run your Quarkus application:  ``` mvn quarkus:dev ```
3. To run the Quarkus application in production mode, you need to build a JAR file. You can do this by executing the following command:  ``` mvn clean package ```
4. To run the Quarkus application from the JAR file, execute the following command: ``` java -jar target/quarkus-app.jar ```
5. DATABASE (MYSQL + Hibernate) - Open mySQL and Hibernate will generate automatically the database.
