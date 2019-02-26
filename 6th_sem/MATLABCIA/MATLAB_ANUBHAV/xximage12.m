%xximage12.m : Write a program to input an image file name.
%Try to give border of the image. Display the final image
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r+10,1:c+20,1:d)=255;
y(11:21,1:10:1:d)=255;
y(r+10:r+20,1:10,1:d)=255;
imshow(y);