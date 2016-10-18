# Hello Kotlin
A simple "Hello, World!" app, written in JetBrains' [Kotlin language](https://kotlinlang.org/)

## Building
This project is configured for use with Gradle. To compile a JAR file and execute the app, run the following command, appending one or more names as parameters:
```
./gradlew clean jar test && java -jar build/libs/hello-world-1.0-SNAPSHOT.jar {YOUR_NAME_HERE}
```
