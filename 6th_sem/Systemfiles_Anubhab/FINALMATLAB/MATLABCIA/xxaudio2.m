%xxaudio2.m : Write a program in MATLAB to play a reverse audio file(.wav)
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name = ','s');
file2=input('\nEnter Output Audio File Name = ','s');
[x,fs,nb]=wavread(file1);
[r,c]=size(x);
fprintf('r = %d c = %d fs = %d nb = %d\n',r,c,fs,nb);
y(1:r)=x(r:-1:1);
wavplay(y,fs); %To play reverse audio file
wavwrite(y,fs,file2); %To write reverse audio data in output file.