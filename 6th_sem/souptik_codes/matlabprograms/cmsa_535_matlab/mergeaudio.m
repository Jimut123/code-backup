% to merge two audio files
clc;
clear all;
close all;

file1=input('\n Enter input audio file name=','s');
file2=input('\n Enter 2nd input audio file name=','s');
file3=input('\n Enter output file name=','s');

[x,xfs,xnbits]=wavread(file1);
[xr,xc]=size(x);

[y,yfs,ynbits]=wavread(file2);
[yr,yc]=size(y);

z(1:xr)=x(1:xr);
z(xr+1:xr+yr)=y(1:yr);

wavplay(z,xfs);
wavwrite(z,xfs,file3);