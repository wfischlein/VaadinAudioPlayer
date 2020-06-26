# AudioPlayer Add-on for Vaadin

This is a work in progress.

AudioPlayer is an add-on for Vaadin that, when complete, uses WebAudio to allow streaming playback of an arbitrary server-side PCM data buffer. Audio can be transported as OGG, MP3 or WAV. It also supports server-side control of the audio playback such as audio and stereo balance, as well as advanced control via pluggable effects, such as high- and lowpass filters.

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

## Publishing to Vaadin Directory

You can create the zip package needed for [Vaadin Directory](https://vaadin.com/directory/) using
```
mvn versions:set -DnewVersion=2.0 # You cannot publish snapshot versions 
mvn install -Pdirectory
```

The package is created as `target/audio-player-2.0.zip`

For more information or to upload the package, visit https://vaadin.com/directory/my-components?uploadNewComponent


## License & Authors

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

AudioPlayer is written by Patrik Lindström and Drew Harvey of Vaadin Ltd.

V14 port was done by Vesa Nieminen and Anton Platonov.


