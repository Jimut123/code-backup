%q4as2.m : Write a program to split one image file to two files. Split the
%file along x-axis
clc;
close all;
clear all;
file1=input('\nEnter Input Image File  name=','s');
file2=input('Enter split file name-1=','s');
file3=input('Enter split file name-2=','s');
x=imread(file1);
[r,c,d]=size(x);
c1=fix(c/2);
y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d);
y2(1:r,1:(c-c1),1:d)=x(1:r,c1+1:c,1:d);
imwrite(y1,file2);
imwrite(y2,file3);
