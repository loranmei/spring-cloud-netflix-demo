@echo on
set a=service-zuul-0.0.1-SNAPSHOT.jar --spring.profiles.active=zuul2
title %a%
java -jar .\target\%a%
pause
