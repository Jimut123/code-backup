%audio4.m: Write a program to input two audio files. Mix those files
%and create a new output file. Play and save mofied file.
clc;
close all
clear all;
file1=input('\nEnter input audio file-1 name=','s');
file2=input('Enter input  audio file-2  name=','s');
file3=input('Enter Output audio file name=','s');
[x1,fs1,nb1]=wavread(file1);
[x2,fs2,nb2]=wavread(file2);
[nx1,d1]=size(x1);
[nx2,d2]=size(x2);
if fs1<fs2
    fs=fs2;
else
    fs=fs1;
end
if nx1<nx2
    nx=nx1;
else 
    nx=nx2;
end
% audio files copied to output file
y(1:2:2*nx)=1.5*x1(1:nx);
y(2:2:2*nx)=x2(1:nx);

plot(y);
sound(y,fs);
wavwrite(y,fs,file3);

%end of file


