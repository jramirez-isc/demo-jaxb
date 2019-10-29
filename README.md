# demo-jaxb

Steps to reproduce:

1. `gradle clean build fatjar`
2. `native-image -H:ReflectionConfigurationFiles=config-dir/reflect-config.json -jar build/libs/demo.jaxb-all-1.0-SNAPSHOT.jar -H:+ReportExceptionStackTraces`
3. `./demo.jaxb-all-1.0-SNAPSHOT`