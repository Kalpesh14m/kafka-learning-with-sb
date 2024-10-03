# kafka-learning-with-sb

## Run zookeeper
C:\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

##Run server
C:\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

### Option zookeeper is deprecated, use --bootstrap-server instead.
```
kafka_2.11-2.1.0
zookeeper-3.4.10
```
## To check list of running topics
C:\kafka>.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

## To check list of running consumers
C:\kafka>.\bin\windows\kafka-consumer-groups --bootstrap-server localhost:9092 –list
