%xximage10.m : Write a program to flip an image along x-axis
clc;
close all;
clear all;
file1=input('\nEnter any Input Image File Neme=','s');
file2=input('Enter output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1:d)=x(1:r,c:-1:1,1:d);
imshow(y);
imwrite(y,file2);
%End of program
