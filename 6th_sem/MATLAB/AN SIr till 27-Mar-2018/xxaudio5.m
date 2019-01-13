%xxaudio5.m : Write a program to input any audio file and reverse all sound
%data. Play new audio file and also save it.
clc;
clear all;
close all;
file1=input('\nEnter input audio file name=','s');
file2=input('Enter Output audio file name=','s');
[x,fs,nbits]=wavread(file1);
[nx,d]=size(x);
fprintf('nx=%d fs=%d nbits=%d\n',nx,fs,nbits);
plot(x);
r(1:nx)=x(nx:-1:1);
sound(r,fs);
wavwrite(r,fs,file2);
%end of program
