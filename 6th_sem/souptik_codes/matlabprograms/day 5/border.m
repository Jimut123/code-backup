%write a program to copy an image n-times along x-axis and y axis and add
%border
clc;
clear all;
close all;
file1=input('\n enter input image file name','s');
x=imread(file1);
[r,c,d]=size(x);
x(:,c-10:c,:)=0;
x(:,1:10,:)=0;
x(1:10,:,:)=0;
x(r-10:r,:,:)=0;
imshow(x);