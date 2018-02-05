Jitpack library
===============
Jitpack library project is a sample android library which demonstrates usage of <https://www.jitpack.io>. 
Jitpack (an any other repository) resolves problems with including transitive dependencies into final `.aar` package.

### Integration

Library project can be easily integrated into Android application by using Gradle dependency management.

Register Jitpack in project's `build.gradle`.

```groovy
allprojects {
    repositories {
        maven {
            url 'https://www.jitpack.io'
        }
    }
}
```

and then include dependency in app's `build.gradle`.

```groovy
dependencies {
    compile 'com.github.jakubgruber:jitpack-library:1.4'
}
```
