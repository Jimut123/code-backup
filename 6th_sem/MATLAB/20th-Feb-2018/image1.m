% image1.m: To display an image
clc;
close all;
clear all;
file1=input('\nEnter your image file name=','s');
file2=input('Enter output image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
fprintf('r=%d c=%d d=%d\n',r,c,d);
imshow(x);
imwrite(x,file2);


