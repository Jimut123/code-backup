%to cut a certain portion of audio from audio file
clc;
clear all;
close all;

file1=input('\n Enter input audio file name=','s');
file2=input('\n Enter 2nd output audio file name=','s');

[x,xfs,xnbits]=wavread(file1);
[xr,xc]=size(x);

start=input('Enter the position from where you want to cut the bits');
endd=input('Enter position from where you want to end cutting the bits');

cutaudio1(1:endd-start+1)=x(start:endd);
wavplay(cutaudio1,xfs);
wavwrite(cutaudio1,xfs,file2);