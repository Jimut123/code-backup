clc;
close all;
clear all;


img1=input('Enter Image ','s');
x=imread(img1);
[r,c,d]=size(x);

y=x;

y(1:r,c+1:2*c,:)=x(1:r,c:-1:1,:);
[r,c,d]=size(y);
y1=y;
y1(r+1:2*r,1:c,:)=y(r:-1:1,1:c,:);
imshow(y1);