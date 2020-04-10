# AcnhAPI

A simple Animal Crossing New Horizons API

## Description

This API is designed for helping purpose. It is possible to combine it to a Web interface to enhance the experience.
With it you can, for example, get the animals that can spawn in a defined period and at a precise time or get the most valuable fishes or insects to sell !

## Getting Started

### Dependencies

* Kotlin
* KMongo
* Javalin
* Konf

### Things to be done
:white_check_mark: Give it a try with some intuitive endpoints  
:pencil2: Define which data is relevant & which endpoints are needed  
:pencil2: A simple web GUI to use the API  
:pencil2: Allow too have a local configuration easily

### Executing program

* Fork/Clone the project
* Head to the `/src` folder
* Run the main in *AnchAPI.kt*

As configured, il will be reachable from `localhost:7000/api`.

The port is defined through:
```Kotlin
// AcnhAPI.kt
val app = Javalin.create().start(7000)
```

## Authors & Contributors

[Tony Delattre](https://twitter.com/ToDelattre) - Idea &  First dev  
