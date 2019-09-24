# Change Log
All notable changes to this project will be documented in this file.
This project adheres to [Semantic Versioning](http://semver.org/).
The file is formatted as described on http://keepachangelog.com/.

## [Unreleased]

## [2.0.2] - 2019-09-24

### Fixed

* Include KNIME launch configuration during generation

## [2.0.1] - 2019-09-19

### Added

* KNIME launch configuration

### Changed

* Bump dependencies to latest versions

### Fixed

* Run tests on mac book with a touch bar

## [2.0.0] - 2019-07-02

### Added

* CITATION.cff and .zenodo.json files, for better citation support

### Changed

* Requires KNIME version 4 ([#19](https://github.com/3D-e-Chem/tycho-knime-node-archetype/issues/19))
* Switched from KNIME SDK to Eclipse + target platform ([#18](https://github.com/3D-e-Chem/tycho-knime-node-archetype/issues/18))
* Source jars for plugin have been replaced with source reference in MANIFEST.MF

## [1.7.0] - 2018-03-23

### Changed

* 3D-e-Chem branding is optional (#16)

## [1.6.0] - 2018-02-07

### Added

* Source feature (#11)
* Instructions to generate skeleton from inside KNIME SDK
* vendor as property 

### Changed

* Update source feature version when repo version is updated (#12)
* Use Jacoco 0.8.0 for coverage

## [1.5.0] - 2017-01-24

### Changed

* Replaced Codacy with SonarCloud (#13)

## [1.4.1] - 2017-03-09

### Added

* Skeleton includes a .gitignore file
* 3D-e-Chem splash & node explorer category
* Support for reproducible version qualifiers, aka timestamp in version based on last git commit (#10)

### Changed

* Raise default KNIME version to 3.3

### Fixed

* Tests require KNIME 3.3

## [1.4.0] - 2017-03-09

### Added

* Use source references in MANIFEST (#11)
* Append timestamp to version (#10)
* Chapter how to use Maven in offline mode (#7)

### Changed

* Upgrade to Tycho 1.0.0 (#12)

### Removed

* Source feature (#11)

## [1.3.0] - 2017-02-01

### Added

* Code coverage (#3)
* AppVeyor support (#8)
* OS X Travis-CI support (#9)

## [1.2.1] - 2017-01-24

### Added

* Instruction to add the generated repo to the 3D-e-Chem KNIME feature (https://github.com/3D-e-Chem/knime-node-collection/issues/3)

### Fixed

* Travis-CI build failed due to missing X environment

## [1.2.0] - 2016-07-11

### Added

* Workflow test (#4)

### Changed

* Moved *.java files to src/java/ directory (#2)

## [1.1.0] - 2016-06-03

### Changed

* Node name configurable (#1)

## [1.0.0] - 2016-05-20

Initial release
