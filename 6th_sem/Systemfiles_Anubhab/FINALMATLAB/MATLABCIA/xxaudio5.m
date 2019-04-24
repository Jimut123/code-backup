%xxaudio5.m : Write a program in MATLAB to changte intensity of audio
%file. Play modified audio file and save it in some output file.
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name = ','s');
file2=input('\nEnter Output Audio File Name = ','s');
n=input('Enter intensity factor = ');
[x,fs,nb]=wavread(file1);
[r,c]=size(x);
fprintf('r = %d c = %d fs = %d nb = %d\n',r,c,fs,nb);
y=n*x; %Changing intensity of audio file
wavplay(y,fs); %To play reverse audio file
wavwrite(y,fs,file2); %To write reverse audio data in output file.