clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
file2=input('\n Enter output Image File Name','s');
file3=input('\n Enter output Image File Name','s');
x=imread(file1);
[r,c,d]=size(x);
fprintf('r=%d c=%d d=%d \n',r,c,d);
imshow(x);
imwrite(x,file2); % writing pixels ins some output image file

c1=fix(c/2);
y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d);
y2(1:r,1:c-c1,1:d)=x(1:r,c1+1:c,1:d);
imwrite(y1,file2);
imwrite(y2,file3);
imshow(y1);

