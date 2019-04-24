%xximage15.m: Write a program to zoom an image along x-axis and y-axis
clc;
clear all;
close all;
file1=input('\nEnter the input file=','s');
file2=input('\nEnter the output file=','s');
m=('\nEnter  the  zoom factor along x-axis:(sx)');
n=('\Enter the zoom factor along y-axis:(sy)');
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1:d)=x(1:r,1:c,1:d);
%to convert  the color into B/W
for i=1:r
    for j=1:c
         if y(i,j,1)>=127
            y(i,j,1)=255;
        else
            y(i,j,1)=0;
        end
    end
end
%x=imread(file1);
%[r,c,d]=size(x);
y=x;%copying x-pixels to y
%To copy pixels along x-axis
j=c+1;
k=2*c;
for i=1:m-1
    y(1:r,j+5:k+5,1:d)=y(1:r,1:c,1:d);
    for i=0:4
    y(1:r,j+i,d)=255;
    end
    j=j+c;
    k=k+c;
end
%to copy along y-axis
j=r+1;
k1=2*r;
for i=1:n-1
    y(j:k1,1:(k-c),1:d)=y(1:r,1:(k-c),1:d);
    j=j+r;
    k1=k1+r;
end
imshow(y);
imwrite(y,file2);
%End of program