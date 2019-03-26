%to reverse a audio file
clc;
clear all;
close all;

file1=input('\n Enter input audio file name=','s');
file2=input('\n Enter output audio file name=','s');
[x,fs,nbits]=wavread(file1);
[r,c]=size(x);
fprintf('r=%d c=%d fs=%d nb=%d',r,c,fs,nbits);
y(1:r)=x(r:-1:1);
wavplay(y,fs);
wavwrite(y,fs,file2);
plot(x,y);