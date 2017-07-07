# Scp Downloads

This module used by [ScpFoundationRu](https://github.com/mohaxspb/ScpFoundationRu) project for mass downloads of articles

# How to use

If it is published in `jcenter` you can just use this in `build.gradle(module app)`

    compile 'ru.kuchanov.scp:scp-downloads:1.0.1@aar'
    
Also you must add link to module repo in app-level `build.gradle` file

    buildscript {
        repositories {
            jcenter()
            mavenCentral()

            //use jcenter when it will be ready
            maven { url 'https://dl.bintray.com/mohaxspb/scp-downloads/' }
        }
    }
    
Do not forget to check latest version of module in [releases](https://github.com/mohaxspb/scpDownloads/releases) list in this repo.

If it's not already published in jcenter and maven-central, you could remove direct link to this repo in app-level `build.gradle`

    maven { url 'https://dl.bintray.com/mohaxspb/scp-downloads/' }
    
# How to update

Use git-flow system for making changes and adding features
To update lib in maven call
 
     gradlew install
     
and then 

    gradlew bintrayUpload
    
Of course, you need to add auth info to `local.properties` file in project to be able to upload new version

```# for publishing to jcenter

bintray.user={USER_NAME_IN_https://bintray.com}
bintray.apikey={API_KEY_FROM_https://bintray.com}
bintray.gpg.password={PASS_FOR_KEY_THAT_WAS_CREATED_BY_gpg}`