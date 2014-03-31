@ECHO OFF

SET WD=%CD%
SET SD=%~dp0
SET PARAMS=%*

cd "%SD%"

set MAVEN_OPTS=-Xmx512m -XX:MaxPermSize=128m
call mvn clean install %PARAMS%

cd "%WD%"

PAUSE
