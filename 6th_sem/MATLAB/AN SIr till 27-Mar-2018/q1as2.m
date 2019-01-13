%q1as2.m : Write a program to input some image file. Extract all pixels.
%Show image on screen. Save image in another file.
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image file name=','s');
x=imread(file1); % Extracting all pixels in x
[r,c,d]=size(x); % r=number of rows, c=number of columns, d=depth
fprintf('r=%d c=%d d=%d\n',r,c,d);
imshow(x); % showing image on screen
imwrite(x,file2); % writing pixels in file2
%End of program
