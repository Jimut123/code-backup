%xximage10.m : Write a program to change color of image to Gray scale.
%Again try to reconstruct your image from gray scale.
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1147*x(1:r,1:c,3);
z(1:r,1:c,1)=fix(100/29*y(1:r,1:c,1));
z(1:r,1:c,2)=fix(100/58*y(1:r,1:c,1));
z(1:r,1:c,3)=fix(100/11*y(1:r,1:c,1));
imshow(z);
