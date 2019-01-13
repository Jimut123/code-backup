%anaudio4.m : Write a program to input any audio file.
%Decrease the speed of the audio file. Play the modified audio
clc;
close all;
clear all;
file1=input('\nEnter input audio file name=','s');
file2=input('Enter output audio file name=','s');
[y,fs,nbits]=wavread(file1);
fprintf('fs=%d nbits=%d\n',fs,nbits);
ns1=input('\nEnter new fs value=');
sound(3*y,ns1*fs);
plot(3*y);
wavwrite(y,ns1*fs,file2);
