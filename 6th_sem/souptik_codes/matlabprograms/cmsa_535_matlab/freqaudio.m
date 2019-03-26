%wap to increase the frequency of a wav file
clc;
clear all;
close all;

file1=input('\n Enter input audio file name=','s');
file2=input('\n Enter output audio file name=','s');
[x,fs,nbits]=wavread(file1);
[r,c]=size(x);
n=input('Enter the number of times the frequency to be multiplied');
fprintf('r=%d c=%d fs=%d nb=%d',r,c,fs,nbits);
fs=n*fs;
wavplay(x,fs);
wavwrite(x,fs,file2)