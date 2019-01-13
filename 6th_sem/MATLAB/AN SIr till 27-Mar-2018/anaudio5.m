%anaudio5.m: Write a program to mix one speech and one music
clc;
close all;
clear all;
file1=input('\nEnter input speech file name=','s');
file2=input('Enter music file name=','s');
file3=input('Enter output file name=','s');
[x,fs1,nbits1]=wavread(file1);
[y,fs2,nbits2]=wavread(file2);
[nx1,d1]=size(x);
[ny1,d2]=size(y);
if nx1< ny1
    n1=nx1;
else
    n1=ny1;
end
if fs1<fs2
    fs=fs1;
else
    fs=fs2;
end
% mixing of sound starts
z(1:2:n1)=x(1:2:n1);
z(2:2:n1)=.8*y(2:2:n1);
sound(z,fs);
%wavwrite(z,fs,nbits1);

