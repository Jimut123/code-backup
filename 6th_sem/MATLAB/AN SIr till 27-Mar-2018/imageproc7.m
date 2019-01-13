%imageproc7.m : Write a program to split an image along y-axis wise
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter  split file-1 name=','s');
file3=input('Enter split file-2 name=','s');
x=imread(file1);
[r,c,d]=size(x);
r1=fix(r/2);
y1(1:r1,1:c,1:d)=x(1:r1,1:c,1:d);
y2(1:r-r1,1:c,1:d)=x(r1+1:r,1:c,1:d);
imwrite(y1,file2);
imwrite(y2,file3);
%End of program