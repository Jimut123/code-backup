%image_proc_4.m : Write a program to take reflection of an image along
%x-axis

clc;
clear all;
close all;
file1=input('\nEnter Input Image File Name = ','s');
file2=input('Enter Output Image File Name = ','s');
x=imread(file1);
[r,c,d]=size(x);
y=x;
y(1:r,c+1:2*c,1:d)=x(1:r,c:-1:1,1:d); %x-axis
imwrite(y,file2);
imshow(y);
%end