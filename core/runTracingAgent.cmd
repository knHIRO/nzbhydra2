@echo off

setlocal

call "C:\Program Files (x86)\Microsoft Visual Studio\2019\Community\VC\Auxiliary\Build\vcvarsall.bat" x64

set path=c:\Programme\graalvm-ce-java17-22.2.0\bin\;%PATH%;c:\Programme\graalvm-ce-java17-22.2.0\bin\
set java_home=c:\Programme\graalvm-ce-java17-22.2.0\
set HYDRA_NATIVE_BUILD=true
cd target
java -DspringAot=true -agentlib:native-image-agent=config-output-dir=hints -jar core-5.0.0-SNAPSHOT-exec.jar directstart

endlocal
