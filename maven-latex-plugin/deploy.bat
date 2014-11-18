@ECHO OFF

SET WD=%CD%
SET SD=%~dp0
SET PARAMS=%*

cd "%SD%"

set MAVEN_OPTS=-Xmx512m -XX:MaxPermSize=128m
call mvn clean deploy -DaltDeploymentRepository=at.ac.ait.hbs.homer.core::default::http://dev.arcsmed.at/nexus/content/repositories/homer.core-snapshots -DaltSnapshotDeploymentRepository=at.ac.ait.hbs.homer.core.snapshots::default::http://dev.arcsmed.at/nexus/content/repositories/homer.core-snapshots %PARAMS%

cd "%WD%"
