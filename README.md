# demo-jaxb

Steps to reproduce:

1. `gradle clean build fatjar`
2. `native-image -jar build/libs/demo.jaxb-all-1.0-SNAPSHOT.jar`
3. `./demo.jaxb-all-1.0-SNAPSHOT`