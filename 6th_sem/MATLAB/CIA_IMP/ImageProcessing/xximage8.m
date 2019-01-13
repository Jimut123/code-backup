%Problem-8:xximage8.m : Write a program to reflect an image along x-axis
%and tthen along y-axis
clc;
close all;
clear all;
file1=input('\nEnter your input image file name=','s');
file2=input('Enter output image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y=x; % copying x pixels to y
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d);  % Taking reflection along x-axis
y(1:2*r,c+1:2*c,1:d)=y(1:2*r,c:-1:1,1:d); % Taking reflection along y-axis
imshow(y);
imwrite(y,file2);
%End of program
