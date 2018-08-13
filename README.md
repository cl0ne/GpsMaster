GpsMaster
========

*GpsMaster* is a free (GNU GPL v2) and open source desktop application used to create, view, edit and analyse GPX files. The program is focused toward the analysis of recorded tracks, but also offers features for planning outdoor activities such as backpacking, hiking, and biking.

* Home page: [gpsmaster.org](http://gpsmaster.org), [OSM Wiki page](https://wiki.openstreetmap.org/wiki/GpsMaster)
* Author: Rainer Fügenstein
* Based on [GPXCreator](http://gpxcreator.com/) by Matt Hoover.

## About this repository
Initially, this repository contains contents of GpsMaster 0.63.20 [source archive](http://www.gpsmaster.org/download/GpsMaster_0.63.20_src.zip).

Current project state:

* it can be built and run with Intellij IDEA, Eclipse project files became obsolete and were deleted (I suppose, it would better to use Gradle/Maven)
* dependencies were updated to their current versions and local JAR references were replaced with Maven coordinates
* GIS library from gpsmaster.org replaced by [osm-tools](https://github.com/grundid/osm-tools)
* monkey-patched to get it running ¯\\\_(ツ)_/¯
* GpsMaster.config file in CWD probably should be replaced with StoredPreferences or equivalent solution
