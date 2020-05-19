# Merge log

Scroll down for the original README.md!

Base revision: 7afcc0d658d3c0bcfd243613467e3fd31176db9c

|Pull Request|Commit|Title|Author|Merged?|
|----|----|----|----|----|
|[6](https://github.com/citra-emu/citra-canary/pull/6)|[d9c3e53](https://github.com/citra-emu/citra-canary/pull/6/files/)|Canary Base (MinGW Test)|[liushuyu](https://github.com/liushuyu)|Yes|
|[5120](https://github.com/citra-emu/citra/pull/5120)|[fc251b3](https://github.com/citra-emu/citra/pull/5120/files/)|service/fs: Update file size on write|[zhaowenlan1779](https://github.com/zhaowenlan1779)|Yes|
|[5116](https://github.com/citra-emu/citra/pull/5116)|[2801449](https://github.com/citra-emu/citra/pull/5116/files/)|service/cam: Implement Vsync interrupt events|[zhaowenlan1779](https://github.com/zhaowenlan1779)|Yes|
|[5115](https://github.com/citra-emu/citra/pull/5115)|[1223dde](https://github.com/citra-emu/citra/pull/5115/files/)|Update translations (2020-03-01)|[zhaobot](https://github.com/zhaobot)|Yes|
|[5089](https://github.com/citra-emu/citra/pull/5089)|[e4af2ac](https://github.com/citra-emu/citra/pull/5089/files/)|Set render window's focus policy to Qt::StrongFocus|[vitor-k](https://github.com/vitor-k)|Yes|
|[5083](https://github.com/citra-emu/citra/pull/5083)|[a50ba71](https://github.com/citra-emu/citra/pull/5083/files/)|video_core, citra_qt: Video dumping updates|[zhaowenlan1779](https://github.com/zhaowenlan1779)|Yes|
|[5049](https://github.com/citra-emu/citra/pull/5049)|[981bdc0](https://github.com/citra-emu/citra/pull/5049/files/)|HLE Audio: Increase frame position by input buffer sample rate|[jroweboy](https://github.com/jroweboy)|Yes|
|[5025](https://github.com/citra-emu/citra/pull/5025)|[276d56c](https://github.com/citra-emu/citra/pull/5025/files/)|Add CPU Clock Frequency slider|[jroweboy](https://github.com/jroweboy)|Yes|
|[5017](https://github.com/citra-emu/citra/pull/5017)|[3eb6856](https://github.com/citra-emu/citra/pull/5017/files/)|video_core: add texture filtering|[BreadFish64](https://github.com/BreadFish64)|Yes|


End of merge log. You can find the original README.md below the break.

------

**BEFORE FILING AN ISSUE, READ THE RELEVANT SECTION IN THE [CONTRIBUTING](https://github.com/citra-emu/citra/wiki/Contributing#reporting-issues) FILE!!!**

Citra
==============
[![Travis CI Build Status](https://travis-ci.com/citra-emu/citra.svg?branch=master)](https://travis-ci.com/citra-emu/citra)
[![AppVeyor CI Build Status](https://ci.appveyor.com/api/projects/status/sdf1o4kh3g1e68m9?svg=true)](https://ci.appveyor.com/project/bunnei/citra)
[![Bitrise CI Build Status](https://app.bitrise.io/app/4ccd8e5720f0d13b/status.svg?token=H32TmbCwxb3OQ-M66KbAyw&branch=master)](https://app.bitrise.io/app/4ccd8e5720f0d13b)

Citra is an experimental open-source Nintendo 3DS emulator/debugger written in C++. It is written with portability in mind, with builds actively maintained for Windows, Linux and macOS.

Citra emulates a subset of 3DS hardware and therefore is useful for running/debugging homebrew applications, and it is also able to run many commercial games! Some of these do not run at a playable state, but we are working every day to advance the project forward. (Playable here means compatibility of at least "Okay" on our [game compatibility list](https://citra-emu.org/game).)

Citra is licensed under the GPLv2 (or any later version). Refer to the license.txt file included. Please read the [FAQ](https://citra-emu.org/wiki/faq/) before getting started with the project.

Check out our [website](https://citra-emu.org/)!

Need help? Check out our [asking for help](https://citra-emu.org/help/reference/asking/) guide.

For development discussion, please join us on our [Discord server](https://citra-emu.org/discord/) or at #citra-dev on freenode.

### Development

Most of the development happens on GitHub. It's also where [our central repository](https://github.com/citra-emu/citra) is hosted.

If you want to contribute please take a look at the [Contributor's Guide](https://github.com/citra-emu/citra/wiki/Contributing) and [Developer Information](https://github.com/citra-emu/citra/wiki/Developer-Information). You should also contact any of the developers in the forum in order to know about the current state of the emulator because the [TODO list](https://docs.google.com/document/d/1SWIop0uBI9IW8VGg97TAtoT_CHNoP42FzYmvG1F4QDA) isn't maintained anymore.

If you want to contribute to the user interface translation, please checkout [citra project on transifex](https://www.transifex.com/citra/citra). We centralize the translation work there, and periodically upstream translation.

### Building

* __Windows__: [Windows Build](https://github.com/citra-emu/citra/wiki/Building-For-Windows)
* __Linux__: [Linux Build](https://github.com/citra-emu/citra/wiki/Building-For-Linux)
* __macOS__: [macOS Build](https://github.com/citra-emu/citra/wiki/Building-for-macOS)


### Support
We happily accept monetary donations or donated games and hardware. Please see our [donations page](https://citra-emu.org/donate/) for more information on how you can contribute to Citra. Any donations received will go towards things like:
* 3DS consoles for developers to explore the hardware
* 3DS games for testing
* Any equipment required for homebrew
* Infrastructure setup

We also more than gladly accept used 3DS consoles! If you would like to give yours away, don't hesitate to join our [Discord server](https://citra-emu.org/discord/) and talk to bunnei.
