%imageproc10.m: Write a program to take reflection of an image along y-axis
%wise  and then along x-axis wise
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
y=x; % Taking copy of  all pixels of image to y
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d); %Taking reflection along y-axis
y(1:2*r,c+1:2*c,1:d)=y(1:2*r,c:-1:1,1:d); % Taking reflection alon x-axis
imshow(y);
imwrite(y,file2);
%End of program
