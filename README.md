# Migrating to Java 9 Modules

This repo contains the same application in 4 different states:

1. A classic Spring/Hibernate application running on the classpath
2. Reimplementation of this app with Java 9 modules *without* using the Spring/Hibernate libs
3. A port of the classpath based application to a single module running on Java 9 (with automatic modules)
4. Fully modularized version of the Spring/Hibernate app (with automatic modules)

These examples are explained in more detail in the O'Reilly book [Java 9 Modularity](http://shop.oreilly.com/product/0636920049494.do)

At Devoxx, this code was used for live demo's: https://www.youtube.com/watch?v=oy3202OFPpM
