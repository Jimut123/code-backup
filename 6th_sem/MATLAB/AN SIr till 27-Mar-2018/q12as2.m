%q12as2.m : Write a program to convert the color of an image to blue
clc;
close all;
clear all;
file1=input('\nEnter your Input File Name=','s');
file2=input('Enter your Output File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
x(1:r,1:c,1)=0;
x(1:r,1:c,2)=0;
imshow(x);
imwrite(x,file2);
%End of Program