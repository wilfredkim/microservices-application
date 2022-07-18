# microservices-application
- Project has two independent services - Customer Service and Department Service.
- It has an API Gateway repo - acts as a reverse proxy to accept all application programming interface (API) calls, aggregate the various services required to fulfill them,and return the appropriate result. API Gataway has also fallback url which will call incase any service is down.
- It has Service Registry repo - It has  Eureka Server which is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.
- HystrixDashboard repo -The Hystrix Dashboard displays the health of each circuit breaker in an efficient manner.
