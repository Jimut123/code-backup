%xxaudio4.m : Write a program in MATLAB to change the frequency of audio
%file. Play modified audio file and save it in some output file.
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name = ','s');
file2=input('\nEnter Output Audio File Name = ','s');
n=input('Enter multiplication factor = ');
[x,fs,nb]=wavread(file1);
[r,c]=size(x);
fprintf('r = %d c = %d fs = %d nb = %d\n',r,c,fs,nb);
fs1=n*fs;
wavplay(x,fs1); %To play reverse audio file
wavwrite(x,fs1,file2); %To write reverse audio data in output file.