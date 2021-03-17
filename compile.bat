@echo off
chcp 65001 
cd C:\Users\堀口達也\java-app\Fortune-Telling
start /b /wait javac -encoding UTF-8 root/*.java
start /b /wait javac -encoding UTF-8 test/*.java
pause