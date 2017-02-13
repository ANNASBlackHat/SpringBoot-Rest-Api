# SpringBoot-Rest-Api
Creating Rest API using Springboot

This project provide example of creating REST Api using Springboot. Data that provided is using List instead of database (not yet).
For project that already using MySQL database, Go to this link =>
[SpringBoot-RestAPI-MySQL](https://github.com/ANNASBlackHat/SpringBoot-RestAPI-MySQL)

### Running The App
Download this repository, and when you have done follow these steps below :
  - cd into SpringBoot-Rest-Api/taget
  - run commandline below
```sh
java -jar course-api-0.0.1-SNAPSHOT.jar
```
  - wait a moment, this proces will start tomcat and run the service on port 8080
  - open your favourite browser, and then type **http://localhost:8080/topic**
  
  
### API
Action handled by this app.

| METHOD | PATH | DESCRIPTION |
| ------ | ------ | ----------- |
| GET | /topic | Get All Topic |
| GET | /topic/{id} | Get Topic base on ID |
| POST | /topic | Add Topic |
| PUT | /topic/{id} | Update Topic base on ID |
| DELETE | /topic/{id} | Delete Topic base on ID |



