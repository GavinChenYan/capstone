# capstone-game

capstone-game API is the microservice restful API for volcano campsite reservation.


### Prerequisites

- JDK 17

- Maven 3.8.1+

- SpringBoot

### API design:

#### Backend repository Design

The capstone API is used to handle user and game data, the database structure is simple:


| Table        | Comments                                     |
|--------------|----------------------------------------------|
| user         | user information password/email/username etc |
| verification | verification table to store codes            |
| game         | Game information (scores/result/etc)         |
  

By default, when the API starts, h2 will start in-memory database testdb and create tables listed above.

```yaml
  datasource:
    url: jdbc:mysql://localhost:3306/cribbage
    username: Helen
    password: 12345678
    driverClassName: org.h2.Driver
```
The data in the database will disappear after API shutdown. In case if we need keep the data, change the url to use file base h2 database:

    url: jdbc:mysql://localhost:3306/cribbage

ER-diagram:

![ERD](doc/ER_diagram.png)
  

#### API Endpoints Design

- Get: /api/user           -- get user

- POST: /api/user                  --create user

- Put:  /user/{userId}        -- update user

- Delete: /user/{userId}      -- Delete user by Id

- POST: /api/user                  --create game

For the detail, please refer to the openapi spec [here](src/main/resources/openapi.yaml).


For detail work sequence, please refer [here](doc/workflow.md) .

### Local build

There are several ways to start API:

- From IDE, run the /src/main/java/com.capstone.api.capstoneapi/service/CapstoneApiApplication.java

- Start from command line:

```text
cd /workspace/capstone-api
mvn clean install
java -jar target/capstone-api-0.0.1-SNAPSHOT.jar
```

- Start from local docker environment

From the API root folder, run docker command:
```yaml
docker build -t volcano/campsite .
docker run -p 8080:8080 volcano/campsite
```
  

### API  verification

Swagger ui:  http://localhost:8080/swagger-ui.html

API health check:   http://localhost:8080/actuator/health
 
Postman could be used to send https request to test the API:

![postman](doc/test.png)


For detailed test cases, please refer the [test cases](doc/test_cases.md) document.

### Performance 


Jmeter could be used to verify the API performance. 

From jmeter, open the jmeter file: ./jmeter/campsite-get.jmx. The test plan set 10 concurrent threads to access the GET campsite endpoint (http://localhost:8080/api/campsite?startDate=2021-11-10&endDate=2021-11-18).

For performance result detail, please refer to [performance](doc/performance.md) document.

---
### Appendix

#### Error Codes:

- ERR10000      System error code, http code 500
- ERR10001      Backend Data process error, http code 500
- ERR10002      Data not found error,  http code 400

- ERR20001      Invalid  data range from input,  http code 422
- ERR20002      Invalid  data input,  http code 422
- ERR20003      Data over limit error,  http code 422