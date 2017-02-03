# Electron & ClojureScript

This repository contains Electron boilerplate written in ClojureScript. In
contrast to other examples out there this one uses ClojureScript for
both parts of the Electron app: the main process and the renderer.

Much of the code was forked from [Martin Klepsch's repository](https://github.com/martinklepsch/electron-and-clojurescript)

To make it boilerplate, I have removed the demo directory and edited `src/main.cljs` to
the latest ideomatic electron

#### Development

For development you can start the compiler with `boot watch dev-build`.
This will incrementally compile ClojureScript sources, push changes to your
running Electron app and provide a REPL connection
([docs](https://github.com/adzerk-oss/boot-cljs-repl))into the app.

You can start the electron process using
[electron-prebuilt](https://github.com/mafintosh/electron-prebuilt) or
using a downloaded `Electron.app` package:

```
electron target/                          # Do not omit the trailing '/'
```

The `build.boot` file is annotated so you can exactly understand
what's happening. When you make changes to the main process (the
`app.main` namespace) you will need to restart the
application. Probably automatic reloading could be added here too but
changes are the main process are not as frequent so I didn't bother
too much.

#### Packaging the app

The easiest way to package an electron app is by using
[`electron-packager`](https://github.com/maxogden/electron-packager):

```
electron-packager target/ MyApp --platform=darwin --arch=x64 --version=0.31.2
```

#### Video
[`Desktop Apps with ClojureScript - Martin Klepsch`](https://www.youtube.com/watch?v=tBnu2JmK4p0)
