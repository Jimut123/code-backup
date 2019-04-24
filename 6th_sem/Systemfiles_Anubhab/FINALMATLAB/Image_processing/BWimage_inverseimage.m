%xximage13.m: Write a program to convert B/W image to inverse image
clc;
close all;
clear all;
file1=input('\nEnter input B/W image file name=','s');
file2=input('Enter inverse color image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
for i=1:r
    for j=1:c
        if x(i,j,1)==255
            y(i,j,1)=0;
        else
            y(i,j,1)=255;
        end
    end
end
imwrite(y,file2);
imshow(y);
%End of program
