%anaudio1.m: Write a program to play an audio file
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name=','s');
file2=input('Enter Output Audio File name=','s');
[x,fs,nbits]=wavread(file1);
[y,n]=size(x);
fprintf('y=%d n=%d fs=%d nbits=%d\n',y,n,fs,nbits);
sound(x,fs);
wavwrite(x,fs,file2);
