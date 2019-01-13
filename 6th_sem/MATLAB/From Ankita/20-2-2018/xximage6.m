%xximage6.m:WAP to reflect an image along y-axis
clc;
close all;
clear all;
file1=input('\nEnter your input file name=','s');
file2=input('\nEnter your output file name=','s');
x=imread(file1);
[r,c,d]=size(x);

y=x;
y(1:r,c+1:2*c,1:d)=x(1:r,c:-1:1,1:d);
imshow(y);
imwrite(y,file2);