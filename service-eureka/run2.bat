@echo on
set a=service-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=run2
title %a%
java -jar .\target\%a%
pause
