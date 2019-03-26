%to convert audio files to sound data/bits.


clc;
clear all;
close all;

file1=input('\n Enter input audio file name=','s');
file2=input('\n Enter output audio file name=','s');
[x,fs,nbits]=wavread(file1);
[r,c]=size(x);
fprintf('r=%d c=%d fs=%d nb=%d',r,c,fs,nbits);
wavplay(x,fs);
wavwrite(x,fs,file2);
