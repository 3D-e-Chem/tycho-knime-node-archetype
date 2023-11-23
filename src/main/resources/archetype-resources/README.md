#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
KNIME node skeleton with sample code as described [here](https://tech.knime.org/developer-guide).

[![Java CI with Maven](https://github.com/${github_organization}/${github_repository}/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/${github_organization}/${github_repository}/actions?query=workflow%3A%22Java+CI+with+Maven%22)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=${github_organization}_${github_repository}&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=${github_organization}_${github_repository})
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=${github_organization}_${github_repository}&metric=coverage)](https://sonarcloud.io/summary/new_code?id=${github_organization}_${github_repository})


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

Configuration files to run Continuous Integration builds for GitHub actions are present.

See `./.github/workflows/ci.yml` file how to trigger a GitHub action workflow run for every push or pull request.
Also see `..github/workflows/ci.yml` file how to perform a [SonarCloud](https://sonarcloud.io/) analysis and code coverage.

To cite the KNIME node, a [DOI](https://en.wikipedia.org/wiki/Digital_object_identifier) can be generated when a GitHub release is made. To enable, the GitHub repository must be connected on https://zenodo.org/account/settings/github/ . The connection must be made before creating a GitHub release.
To [cite the software](https://research-software.org/citation/developers/) a human and computer readable file called `CITATION.cff` is included.

${symbol_pound} Development

Steps to get development environment setup based on https://github.com/knime/knime-sdk-setup#sdk-setup:

1. Install Java 17
2. Install Eclipse for [RCP and RAP developers](https://www.eclipse.org/downloads/packages/installer)
3. Configure Java 17 inside Eclipse Window > Preferences > Java > Installed JREs
4. Import this repo as an Existing Maven project
5. Activate target platform by going to Window > Preferences > Plug-in Development > Target Platform and check the `KNIME Analytics Platform (${knime_version}) - ${artifactId}.targetplatform/KNIME-AP-${knime_version}.target` target definition.
6. A KNIME Analytics Platform instance can be started by right clicking on the `targetplatform/KNIME\ Analytics\ Platform.launch` file and selecting `Run As → KNIME Analytics Platform`. The KNIME instance will contain the target platform together with all extensions defined in the workspace.

During import the Tycho Eclipse providers must be installed.

${symbol_pound}${symbol_pound} Tests

Tests for the node are in `tests/src` directory.
Tests can be executed with `mvn verify`, they will be run in a separate KNIME environment.
Test results will be written to `test/target/surefire-reports` directory.
Code coverage reports (html+xml) can be found in the `tests/target/jacoco/report/` directory.

The tests can be run against a different KNIME version using `mvn verify -Dtarget.file=KNIME-AP-5.1` where `5.1` is the major.minor version of KNIME and `KNIME-AP-5.1` is a target platform definition file called `targetplatform/KNIME-AP-5.1.target`.

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
#if( $branded == "Y")
9.  Make nodes available to 3D-e-Chem KNIME feature by following steps at https://github.com/3D-e-Chem/knime-node-collection#new-release
10. Update `CITATION.cff` file with new DOI, version, release date
#else
9.  Update `CITATION.cff` file with new DOI, version, release date
#end