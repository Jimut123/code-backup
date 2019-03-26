clc;
close all;
clear all;


img1=input('Enter Image ','s');
x=imread(img1);
[r,c,d]=size(x);


y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1140*x(1:r,1:c,3);
y(1:r,1:c,2)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1140*x(1:r,1:c,3);
y(1:r,1:c,3)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1140*x(1:r,1:c,3);

x(1:r,c+1:2*c,:)=y(1:r,1:c,:)
imshow(x);