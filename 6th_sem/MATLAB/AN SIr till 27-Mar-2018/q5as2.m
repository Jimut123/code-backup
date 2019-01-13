%q5as2.m : Write a program to input any image file and split the image into
%2 image files along y-axis.
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output split File-1 Name=','s');
file3=input('Enter Output split File-2 Name=','s');
x=imread(file1);
[r,c,d]=size(x);
r1=fix(r/2);
y1(1:r1,1:c,1:d)=x(1:r1,1:c,1:d);  % upper half of the image copied
y2(1:r-r1,1:c,1:d)=x(r1+1:r,1:c,1:d); % lower half of the image copied
imshow(y1);
imwrite(y1,file2);
imwrite(y2,file3);
%End of program



