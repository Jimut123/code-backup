%Problem-3:xximage3.m : Write a program to convert any RGB image file to
%Gray scale. Use formula :  gs=.2989*r+.587*g+.114*b. Convert Gray scale 
% image to B/W image. Paste Gray scale image and B/W image on RHS of 
%RGB image
clc;
close all;
clear all;
file1=input('\nEnter your input Image File Name=','s');
file2=input('Enter your output image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
% To convert RGB to gray scale
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
x(1:r,c+1:2*c,1)=y(1:r,1:c,1);
x(1:r,c+1:2*c,2)=y(1:r,1:c,1);
x(1:r,c+1:2*c,3)=y(1:r,1:c,1);
% To convert gray scale image to B/W image. We change pixel value 0-126 to
% 0 and 127-255 to 255.
    for i=1:r
        for j=1:c
            if y(i,j,1)>=127
                z(i,j,1)=255;
            else
                z(i,j,1)=0;
            end
        end
    end
% To paste B/W image on RHS of gray scale image
x(1:r,2*c+1:3*c,1)=z(1:r,1:c,1);
x(1:r,2*c+1:3*c,2)=z(1:r,1:c,1);
x(1:r,2*c+1:3*c,3)=z(1:r,1:c,1);
imshow(x);
imwrite(x,file2);
%End of program
