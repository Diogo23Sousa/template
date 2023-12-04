# TEMPLATE - Create your own projects with a defined template.

Configurations

BACKEND - Java 17+ (Quarkus Framework) connected to MYSQL Database using Hibernate Framework
1. Install JDK and MAVEN
2. Install the needed dependencies using MAVEN;
``` mvn clean install ```
3. Run the server;

DATABASE (MYSQL + Hibernate) - Open mySQL and Hibernate will generate automatically the database.
1. Open the file: '../main/resources/application.properties':
```spring.jpa.hibernate.ddl-auto=create``` to ```spring.jpa.hibernate.ddl-auto=validate```
2. To enable emailSender you have to put your GMAIL credentials in:
```
spring.mail.username=youremail@gmail.com
spring.mail.password="yourpassword"
```
3. If you want to use Kafka.

FRONTEND (template-ui) - Angular 12+ using JWT authentication
1. Install NPM (Node Package Manager)
2. Install the Angular CLI by running the following command:
```npm install -g @angular/cli```
3. Install the needed modules for the project by running the following command:
```npm install```
4. Running the server locally:
```npm start```
5. Open you browser on the following url:
```http://localhost:4200/```

6. Running the server on your network -> check your ip
```ng --yourip```
7. Open you browser on the following url:
```http://yourip:4200/```
