energydashws
============

# Web Service for [Energydash](https://github.com/clinstid/energydash)

## Java

* MongoDB driver with Morphia for Persistence
* JUnit testing
* Built using gradle.

Left to do:

* Move the configuration out to XML instead of hardcoded in the MongoDB class
* Build the RESTful API - Started, have an "hours" resource with a start and end parameters and "readings" resource that can give the last raw reading.

## Building

### Create Eclipse Project Files

`$ gradle eclipse`

### Build and Run Tests

`$ gradle build`

### Build the WAR File

`$ gradle war`


