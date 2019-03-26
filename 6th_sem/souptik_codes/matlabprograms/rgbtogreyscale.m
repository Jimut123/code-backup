clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
file2=input('\n Enter output Image File Name','s');
x=imread(file1);
[r,c,d]=size(x);

y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1140*x(1:r,1:c,3);
imwrite(y,file2);
imshow(y);