#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
KNIME node skeleton with sample code as described [here](https://tech.knime.org/developer-guide).

[![Build Status](https://travis-ci.org/${github_organization}/${github_repository}.svg?branch=master)](https://travis-ci.org/${github_organization}/${github_repository})
[![SonarCloud Gate](https://sonarcloud.io/api/badges/gate?key=${groupId}:${artifactId})](https://sonarcloud.io/dashboard?id=${groupId}:${artifactId})
[![SonarCloud Coverage](https://sonarcloud.io/api/badges/measure?key=${groupId}:${artifactId}&metric=coverage)](https://sonarcloud.io/component_measures/domain/Coverage?id=${groupId}:${artifactId})

This project uses [Eclipse Tycho](https://www.eclipse.org/tycho/) to perform build steps.

${symbol_pound} Installation

Requirements:

* KNIME, https://www.knime.org, version ${knime_version} or higher

Steps to get the ${node} KNIME node inside KNIME:

1. Goto Help > Install new software ... menu
2. Press add button
3. Fill text fields with url of update site which contains this node.
4. Select --all sites-- in `work with` pulldown
5. Select the node
6. Install software
7. Restart KNIME

${symbol_pound} Usage

1. Create a new KNIME workflow.
2. Find node in Node navigator panel.
3. Drag node to workflow canvas.

${symbol_pound} Build

To build the node extension and verify the tests run with the following command:
```
mvn verify
```

Make sure all code is commited as the snapshot version is determined by git commit timestamp.

An Eclipse update site will be made in `p2/target/repository` directory.
The update site can be used to perform a local installation.

${symbol_pound}${symbol_pound} Continuous Integration

Configuration files to run Continuous Integration builds on Linux (Travis-CI), OS X (Travis-CI) and Windows (AppVeyor) are present.

See `./.travis.yml` file how to trigger a Travis-CI build for every push or pull request.
Also see `./.travis.yml` file how to perform a [SonarCloud](https://sonarcloud.io/) analysis and code coverage.

See `./appveyor.yml` file how to run on https://www.appveyor.com .

${symbol_pound} Development

Steps to get development environment setup:

1. Download KNIME SDK from https://www.knime.org/downloads/overview
2. Install/extract KNIME SDK
3. Start KNIME SDK
4. Install m2e (Maven integration for Eclipse) + Test workflows in JUnit

    1. Goto Help > Install new software ...
    2. Make sure Update site http://update.knime.org/analytics-platform/${knime_version} and https://3d-e-chem.github.io/updates are in the pull down list otherwise add them
    3. Select --all sites-- in work with pulldown
    4. Select m2e (Maven integration for Eclipse)
    5. Select `Test Knime workflows from a Junit test`
    6. Select `Splash & node category for 3D-e-Chem KNIME nodes` (only required for 3D-e-Chem node)
    7. Install software & restart

5. Import this repo as an Existing Maven project

During import the Tycho Eclipse providers must be installed, Eclipse will ask for your permission.

${symbol_pound}${symbol_pound} Tests

Tests for the node are in `tests/src` directory.
Tests can be executed with `mvn verify`, they will be run in a separate KNIME environment.
Test results will be written to `test/target/surefire-reports` directory.
Code coverage reports (html+xml) can be found in the `tests/target/jacoco/report/` directory.

${symbol_pound}${symbol_pound}${symbol_pound} Unit tests

Unit tests written in Junit4 format can be put in `tests/src/java`.

${symbol_pound}${symbol_pound}${symbol_pound} Workflow tests

See https://github.com/3D-e-Chem/knime-testflow${symbol_pound}3-add-test-workflow

${symbol_pound}${symbol_pound} Speed up builds

Running mvn commands can take a long time as Tycho fetches indices of all p2 update sites.
This can be skipped by running maven offline using `mvn -o`.

${symbol_pound} New release

1. Update versions in pom files with `mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=<version>-SNAPSHOT` command.
2. Create package with `mvn package`, will create update site in `p2/target/repository`
3. Run tests with `mvn verify`
4. Optionally, test node by installing it in KNIME from a local update site
5. Append new release to an update site
  1. Make clone of an update site repo
  2. Append release to the update site with `mvn install -Dtarget.update.site=<path to update site>`
6. Commit and push changes in this repo and update site repo.
7. Create a Github release
8. Update Zenodo entry
  1. Correct authors
  2. Correct license
9. Make nodes available to 3D-e-Chem KNIME feature by following steps at https://github.com/3D-e-Chem/knime-node-collection#new-release
