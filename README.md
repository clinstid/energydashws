energydashws
============

# Web Service for [Energydash](https://github.com/clinstid/energydash)

Check out the <a href="https://github.com/clinstid/energydashws/wiki">wiki</a> for details on the API and available resources.

## Java

* MongoDB driver with Morphia for Persistence
* JUnit testing
* Built using gradle.

Left to do:

* Build the RESTful API - Started, have an "hours" resource with a start and end parameters and "readings" resource that can give the last raw reading.

## Building

### Create Eclipse Project Files

`$ ./gradlew eclipse`

### Build and Run Tests

`$ ./gradlew build`

### Build the WAR File

`$ ./gradlew war`

### Deploy the WAR File on JBoss/Wildfly

I'm working with Wildfly 8 RC1 and in order to deploy to it, you'll first need to set the `JBOSS_HOME` environment variable to the path to your JBoss/Wildfly install.

`$ export JBOSS_HOME=/path/to/jboss`

Next you can use gradle to deploy the WAR file:

`$ ./gradlew deploy`

When you want to run JBoss, you'll need to set the system properties for your MongoDB configuration. Add `system-properties` after the `extensions` section in standalone.xml (or domain.xml, I have only tested standalone).


```
    <system-properties>
        <property name="MONGO_HOST" value="localhost"/>
        <property name="MONGO_PORT" value="27018"/>
        <property name="MONGO_DATABASE" value="energydash"/>
    </system-properties>
```

The values shown above are the defaults used if the system properties aren't defined, so if you're ok with them, you don't need to add them.

