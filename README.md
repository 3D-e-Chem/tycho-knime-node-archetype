# Tycho Knime node archetype

[![Build Status](https://travis-ci.org/3D-e-Chem/tycho-knime-node-archetype.svg?branch=master)](https://travis-ci.org/3D-e-Chem/tycho-knime-node-archetype)
[ ![Download](https://api.bintray.com/packages/nlesc/tycho-knime-node-archetype/tycho-knime-node-archetype/images/download.svg) ](https://bintray.com/nlesc/tycho-knime-node-archetype/tycho-knime-node-archetype/_latestVersion)

Generates [Knime](http://www.knime.org) workflow node skeleton repository with sample code.

The [Maven archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) will generate a multi-module project with the following structure:

* / - parent Maven project
* /plugin/ - code for Knime node
* /tests/ - tests of Knime node
* /feature/ - eclipse feature
* /p2/ - eclipse update site

## Requirements

* Java >=1.8
* Maven >=3.0

## Generate

1. Execute
```
mvn archetype:generate -DarchetypeGroupId=nl.esciencecenter \
-DarchetypeArtifactId=tycho-knime-node-archetype \
-DarchetypeVersion=1.1.0 \
-DarchetypeRepository=https://dl.bintray.com/nlesc/tycho-knime-node-archetype
```
2. Enter the groupId
3. Enter the artifactId
4. Enter the name of the package under which your code will be created
5. Enter the version of your project
6. Enter the Github organization name or Github username
7. Enter the Github repository name
8. Enter the Knime node name
9. Confirm
10. Change directory to generated code.
11. Fill in all placeholders (`[Enter ... here.]`) in

    * plugin/META-INF/MANIFEST.MF
    * plugin/src/**/*.xml
    * feature/feature.xml
    * p2/category.xml


Further instructions about generated project can be found in it's README.md file.

## New release

1. Adjust version in pom.xml
2. Update CHANGELOG.md
3. Commit & push
4. Create Github release
5. Deploy to Bintray, see Deploy chapter

### Deploy

To deploy current version to Bintray.

1. Add bintray credentials to ~/.m2/settings.xml
2. Create version on bintray
2. Run `mvn deploy`

## Attribution

The https://github.com/open-archetypes/tycho-eclipse-plugin-archetype was used as inspiration for this archetype.
