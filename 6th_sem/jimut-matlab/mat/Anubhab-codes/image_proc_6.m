%image_proc_6.m : Write a program to take reflection of an image along
%x-axis and then along y-axis
clc;
clear all;
close all;
file1=input('\nEnter Input Image File Name = ','s');
file2=input('Enter Output Image File Name = ','s');
x=imread(file1);
[r,c,d]=size(x);
y=x;
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d); %x-axis
y(1:2*r,c+1:2*c,1:d)=y(2*r:-1:1,1:c,1:d);  %y-axis
imwrite(y,file2);
imshow(y);
%end