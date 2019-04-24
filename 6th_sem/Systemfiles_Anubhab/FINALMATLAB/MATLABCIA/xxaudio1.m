%xxaudio1.m : Write a program in MATLAB to read and play any audio
%file(.wav)
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name = ','s');
file2=input('\nEnter Output Audio File Name = ','s');
[x,fs,nb]=wavread(file1);
[r,c]=size(x);
fprintf('r = %d c = %d fs = %d nb = %d\n',r,c,fs,nb);
wavplay(x,fs); %To play audio file
wavwrite(x,fs,file2); %To write audio data in output file.