%xximage2.m:wap to convert any rgb file to gray scale .Use formula:
%gs=.2989*r+.587*g+.114*b  Paste gray scale image on rhs of rgb image
clc;
clear all;
close all;
file1=input('\nEnter your input file name=','s');
file2=input('\nEnter your output file name=','s');
x=imread(file1);
[r,c,d]=size(x);
% to convert rgb to gray scale
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
x(1:r,c+1:2*c,1)=y(1:r,1:c,1);
x(1:r,c+1:2*c,2)=y(1:r,1:c,1);
x(1:r,c+1:2*c,3)=y(1:r,1:c,1);
imshow(x);
imwrite(x,file2);