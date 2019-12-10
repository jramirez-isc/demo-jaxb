# Simple demo JAXB Native Image

Prerequisites:
* `Latest version of GraalVM, currently 19.3.0`

Steps:

1. `gradle clean build fatjar`

2. `native-image -H:ReflectionConfigurationFiles=reflect.json -H:-UseServiceLoaderFeature --no-server --no-fallback --report-unsupported-elements-at-runtime -jar build/libs/demo.jaxb-all-1.0-SNAPSHOT.jar`

3. `./demo.jaxb-all-1.0-SNAPSHOT`