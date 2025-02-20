# `Java`

## Overview

Compile to `bytecode`

```console
javac HelloWorld.java

```

It outputs a `.class` file which is the `bytecode` that the `JVM` understands.
To execute:

```console
java HelloWorld

```

The above command executed the compiled `class` not the `.java` file. Notice that it is ran
without the `.class` extension, in fact `java` looks for the class in the current directoy or 
`CLASSPATH`. The class *must* have a `main` method.


## `maven`

We need a `pom.xml` to define the project structure and dependencies. Then we run

```console
mvn install

```

and `maven` will install the dependencies in `~/.m2/repository`.



## `Java` installation

Install latest `java` development-kit:

```console
sudo pacman -S jdk-openjdk

```
To check the default version:

```console
java -version
javac -version

```

Since I first installed jdk17, this is set as the default. To see all available versions, 

```console
archlinux-java status

```

I set the latest `java` as default

```console
sudo archlinux-java set java-23-openjdk

```
    
Install `maven` to have the `java` language server. Maven is used for managing
dependencies and building projects.

```console
sudo pacman -S maven

```

`maven` requires jdk18 and upwards.

Then install the `java-language-server` in `nvim`'s `Mason`. 
