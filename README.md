# TrackHealthy

This is a App that enables user to track calories. 

###### Work in progress:


* Backend
  * ~~Create models for each enitity (user, Logs, Recipies)~~
  * ~~Create user service~~
  * Create Log services so user can log their meals
  * Enable users to make recipies

Frontend

* Design the UI
* Implement the userUI

How to start the TrackHealthy application
-----------------------------------------

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/beHealthy-1.0-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`

Health Check
------------

To see your applications health enter url `http://localhost:8081/healthcheck`
