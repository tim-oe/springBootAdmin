# Spring boot Admin POC

## purpose
- create [admin application](server/README.md)
- create [sample client](client/README.md)
- determine [UI customization points](server/ui/README.md)
- leverage [GraalVM](https://www.graalvm.org)
    - [spring boot and GraalVM](https://www.baeldung.com/spring-native-intro)
    - WIP

## requirements
- jdk 17
    - installed via [SDKMan](https://sdkman.io/jdks#grl)
- [GraalVM 23.x.r17](https://www.graalvm.org/latest/docs/)
    - installed via [SDKMan](https://sdkman.io/jdks#grl)
    - [gradle plugin](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html)
    - needs libz-dev ```sudo apt install -y libz-dev```
    - set envar GRAALVM_HOME <graalvm install dir>
    - set envar JAVA_HOME="$GRAALVM_HOME"
    - needes min of 6g of memory or 137 return error
        - JAVA_OPTS='-Xmx8g'
- [nodejs 16](https://nodejs.org/en/)
    - installed via [nodesource](https://github.com/nodesource/distributions)
- [npm 8](https://www.npmjs.com/)
    - installed via [nodesource](https://github.com/nodesource/distributions)

## run demo
- ```./gradlew server:bootRun```
- ```./gradlew client:bootRun```
- [access SBA](http://localhost:8080/applications)

## TODO
- jmx
- terraform