%image_proc_1.m : Write a program to display an image on screen

clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
fprintf('r=%d c=%d d=%d\n',r,c,d)
imshow(x); % To display image on screen
imwrite(x,file2); % writing pixels in some output image file
