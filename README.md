# ecommerce-microservices
Micro-Services architecture for ECommerce Websites.
This repository deals with the micro-services based architecture for e commerce websites. The entire ecommerce site is segregated as services based on the different business functionalities the website caters.

#Tech Stack
1. Gradle
2. Spring Boot
3. Mongo DB
4. Hystrix
5. Angular 2 with Node
6. Eureka Service discovery
7. Spring Cloud config server

To use this repository follow the steps given below
# Mongo DB
1. Download and install mongo db.
2. Configure the DB path and start the mongodb.
# Github Repositories
1. Clone the repositories to you local drive.
2. Start the individual services in this order  
  a. Config Server - Modify the properties file location to your local git/git repository
  b. Eureka Server - Register the services to eureka and other services will use Eureka to communicated with 
  c. Product-Service
  d. User-Service
  e. Spring-Hystrix - Client consuming the product service. Hystrix enabled.
  f. EComm-frontend - Angular 2 with Node. To provide a user interface for the services
