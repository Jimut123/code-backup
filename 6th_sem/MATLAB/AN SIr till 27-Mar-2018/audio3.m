%audio3.m: Write a program to input any audio file. Reverse the sound file.
%Play and save the same file.
clc;
close all
clear all;
file1=input('\nEnter input audio file name=','s');
file2=input('Enter output audio file name=','s');
[x,fs,nb]=wavread(file1);
[nx,d]=size(x);
fprintf('nx=%d d=%d fs=%d nb=%d\n',nx,d,fs,nb);
y(1:nx)=x(nx:-1:1); % reversing sound data
plot(y); % To plot final audio file
sound(y,fs); % To play audio file
wavwrite(y,fs,file2);
%end of file


