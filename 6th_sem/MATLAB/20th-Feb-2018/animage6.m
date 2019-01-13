%animage6.m : Write a program to take reflection of an image along y-axis
%wise
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
y=x; % To copy input image pixel into y
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d);
imshow(y);
imwrite(y,file2);
%End of program