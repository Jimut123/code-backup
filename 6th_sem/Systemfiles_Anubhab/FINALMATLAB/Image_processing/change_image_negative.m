
%animage13.m: Write a program to change the image to negative image
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1)=.2987*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
for i=1:r
    for j=1:c
        if y(i,j,1) >=127
            z(i,j,1)=0;
        else
            z(i,j,1)=255;
        end
    end
end
imshow(z);
imwrite(z,file2);
%End of program