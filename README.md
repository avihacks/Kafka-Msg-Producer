C:\kafka\kafka\bin\windows>kafka-storage.bat random-uuid
2025-05-15T12:57:34.783889800Z main ERROR Reconfiguration failed: No configuration found for 'c387f44' at 'null' in 'null'
p8oQnVZdSEmj_qfb_a83Lw


format logs kafka

C:\kafka\kafka\bin\windows>kafka-storage.bat format -t 12345678-abcd-efgh-ijkl-1234567890ab -c C:\kafka\kafka\config\kafka.properties

start kafka 

kafka-server-start.bat C:\kafka\kafka\config\kafka.properties

create topics

C:\kafka\kafka\bin\windows>kafka-topics.bat --create --topic user-topics --bootstrap-server localhost:9092
2025-05-15T13:23:48.687647Z main ERROR Reconfiguration failed: No configuration found for 'c387f44' at 'null' in 'null'
Created topic user-topics.

list topics
C:\kafka\kafka\bin\windows>kafka-topics.bat --list --bootstrap-server localhost:9092
2025-05-15T13:25:15.007083500Z main ERROR Reconfiguration failed: No configuration found for 'c387f44' at 'null' in 'null'
quickstart-events
user-topics


produce topics text


C:\kafka\kafka\bin\windows>kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092

Consume topics text

C:\kafka\kafka\bin\windows>kafka-console-consumer.bat --topic user-topics --from-beginning --bootstrap-server localhost:9092
