@echo on
set a=service-provider-0.0.1-SNAPSHOT.jar --spring.profiles.active=provider1
title %a%
java -jar .\target\%a%
pause