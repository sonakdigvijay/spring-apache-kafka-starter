# spring-apache-kafka-starter
This is a spring-kafka integration starter application using Lightbend Lagom Kafka Server Plugin

Run the following maven goal on the parent project to start the Lagom integrated kafka server:
mvn lagom:runAll

Start the consumer project: spring-kafka-consumer

Start the producer project: spring-kafka-producer

For testing use the '/sendit' api as shown below:

![postman example](/images/kafka-postman.png)
