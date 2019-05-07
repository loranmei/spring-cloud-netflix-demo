@echo on
set a=service-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=run1
title %a%
java -jar .\target\%a%
pause
