%xxaudio6.m : Write a program in MATLAB to cut a portion of audio
%file. Play cut portion and save it in some output file.
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name = ','s');
file2=input('\nEnter Output Audio File Name = ','s');
[x,fs,nb]=wavread(file1);
[r,c]=size(x);
fprintf('r = %d c = %d fs = %d nb = %d\n',r,c,fs,nb);
choice=input('\nPress Enter Key--->','s');
n1=input('Enter data position from where you want to cut your data bits = ');
n2=input('Enter data position from where you want to cut your data bits = ');
y(1:(n2-n1+1))=x(n1:n2);
wavplay(y,fs); %To play reverse audio file
wavwrite(y,fs,file2); %To write reverse audio data in output file.