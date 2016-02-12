# Furitsuki
A simple CLI application which adds furigana to Japanese text, using the methods in [jcore](https://github.com/stephenmac7/jcore).

### Using Furitsuki
There are no command line arguments at the moment. Place sentences on stdin, and furigana-containing sentences appear on stdout (in [Anki](http://ankisrs.net/) format):
```
➜ java -jar furitsuki-assembly-SNAPSHOT.jar
コーヒーが好きです。
コーヒーが 好[す]きです。
➜
```

To quit, just use the EOF character (Ctrl+D). Or, if you prefer, you can pipe in your input:
```
➜ echo "お寿司が食べたい。" | java -jar furitsuki-assembly-SNAPSHOT.jar 
お 寿[す]司[し]が 食[た]べたい。
```

### License
jcore is licensed under the Apache License, Version 2.0. See LICENSE for details.

### Contributing
Open up an issue if something isn't working properly or as expected. Likewise, open an issue for any feature requests. Pull requests are also more than welcome.

If you're looking to see or make changes to the internals of the process, you might have better luck looking in the [jcore](https://github.com/stephenmac7/jcore) repository, which does all the heavy lifting.
