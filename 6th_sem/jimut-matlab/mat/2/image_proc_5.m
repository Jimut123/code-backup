%image_proc_5.m : Write a program to take reflection of an imaghe along
%x-axis

clc;
clear all;
close all;
file1=input('\nEnter Input Image file name=','s');
file2=input('Enter Output Image name=','s');
y=imread(file1);
[r,c,d]=size(y);
x=y; %copying input image to output image
x(r+1:2*r, 1:c, 1:d)=y(r:-1:1, 1:c, 1:d); %taking reflection along x-axis
imwrite(x,file2);
imshow(x);