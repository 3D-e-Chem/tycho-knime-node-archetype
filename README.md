# Tycho Knime node archetype

Generates [Knime](http://www.knime.org) workflow node skeleton repository with sample code.

The [Maven archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) will generate a multi-module project with the following structure:

* /, parent Maven project
  * plugin/, code for Knime node
  * tests/, tests of Knime node
  * feature/, eclipse feature
  * p2/, eclipse update site

## Requirements

* Java >=1.8
* Maven >=3.0

## Generate

1. Execute `mvn archetype:generate -DarchetypeGroupId=nl.esciencecenter -DarchetypeArtifactId=tycho-knime-node-archetype`
2. Enter the groupId
3. Enter the artifactId
4. Enter the name of the package under which your code will be created
5. Enter the version of your project
6. Enter the Github organization name or Github username.
7. Enter the Github repository name
8. Confirm
9. Change directory to generated code.
10. Fill in all placeholders (`[Enter ... here.]`) in

    * plugin/META-INF/MANIFEST.MF
    * plugin/src/**/*.xml
    * feature/feature.xml
    * p2/category.xml


Further instructions about generated project can be found in it's README.md file.

## New release



## Attribution

The https://github.com/open-archetypes/tycho-eclipse-plugin-archetype was used as inspiration for this archetype.
