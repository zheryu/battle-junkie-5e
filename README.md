# Battle Junkie 5e

This is an application designed to provide a more fluid UI during main.combat.

## Requirements
```
java 11.0.8
gradle 5.0+ (as per https://openjfx.io/openjfx-docs/#gradle, only verified on 6.6.1)
```

## Run


On Windows Powershell:
```
.\gradlew build
.\gradlew run
```

On WSL Ubuntu, probably also Mac:
```
./gradlew build
./gradlew run
```

## TODO:
* Panel for combat turn composition
* Panel for valid actions during turn
* Domain object modeling for taking 5e turns
* Configuration parsing
* Configurations for Fighter:Samurai class

