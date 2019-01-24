%Problem-1:xximage1.m : Write a program to convert any RGB image file to
%Gray scale. Use formula :  gs=.2989*r+.587*g+.114*b.
clc;
close all;
clear all;
file1=input('\nEnter your input Image File Name=','s');
file2=input('Enter your output image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
% To convert RGB to gray scale
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
imshow(y);
imwrite(y,file2);
%End of program