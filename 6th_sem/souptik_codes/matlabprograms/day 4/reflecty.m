clc;
clear all;
close all;
file1=input('\n enter input image file name','s');
file2=input('\n enter output image file name','s');

x=imread(file1);
[r,c,d]=size(x);
y=x;
y(1:r,c+1:2*c,1:d)=x(1:r,c:-1:1,1:d);
imwrite(y,file2);
imshow(y);