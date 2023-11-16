# spring-apache-kafka-demo
Primer demo de apache kafka con Spring Boot (producer y consumer)

# Video tutorial
Spring Boot con Apache Kafka - Guía completa 
https://www.youtube.com/watch?v=UbbyW5Z1lv8

# Lista de comandos
▶️ Iniciar Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

▶️ Iniciar Kafka
.\bin\windows\kafka-server-start.bat .\config\server.properties

▶️ Crea un nuevo topic en el servidor de kafka
.\bin\windows\kafka-topics.bat --create --topic {topic-name} --bootstrap-server {host}:9092
.\bin\windows\kafka-topics.bat --create --topic topic-test --bootstrap-server localhost:9092

▶️ Decribir los detalles de un topic
.\bin\windows\kafka-topics.bat --describe --topic {topic-name} --bootstrap-server {host}:9092

▶️ Listar todos los topics que existen dentro del broker
.\bin\windows\kafka-topics.bat --list --bootstrap-server {host}:9092
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

▶️ Inicia una consola para ver mensajes de un topic específico
.\bin\windows\kafka-console-consumer.bat --topic {nombreTopic} --bootstrap-server {host}:9092

▶️ Inicia una consola para enviar mensajes a un topic específico
.\bin\windows\kafka-console-producer.bat --broker-list {host}:9092 --topic {topic-name}

# Instalación 
1. Ir a https://kafka.apache.org/quickstart
2. Clic en botón de Download -> Clic en el link para descargar kafka_vX.tgz
3. Cortar el archivo y pegarlo en C
4. Extraer el contenido de .tgz
5. Extraer el contenido de .tar y en caso de desearlo renombrar la carpeta (ejemplo Kafka, rutas hijas Kafka/bin, Kafka/config, etc)
6. Abrir diferentes terminales en modo administrador en la ruta base (ejemplo C:\Kafka)
7. Ejecutar comandos (Iniciar Zookeeper, Iniciar Kafka) en diferentes terminales
8. Explorar con el resto de comandos para ver la lista de topicos, y escuchar sobre algunos.
