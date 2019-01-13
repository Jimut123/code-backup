%Problem-7:xximage7.m : Write a program to reflect an image along x-axis.
clc;
close all;
clear all;
file1=input('\nEnter your input image file name=','s');
file2=input('Enter output image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
% To take refecltion along y-axis
y=x; % copying x pixels to y
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d);
imshow(y);
imwrite(y,file2);
%End of program
