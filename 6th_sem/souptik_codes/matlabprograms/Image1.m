clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
file2=input('\n Enter output Image File Name','s');
x=imread(file1);
[r,c,d]=size(x);
fprintf('r=%d c=%d d=%d \n',r,c,d);
imshow(x);
imwrite(x,file2); % writing pixels ins some output image file
%end of program