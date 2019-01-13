%q3as2.m: Write a program to input any RGB image file. Convert the image to
%gray scale image using a formula gray_scale=.2989*R+.587*G+.114*B.
% Again convert gray scale to B/W. Club RGB,gray scale,b/w in one 
% output file.
clc;
close all;
clear all;
file1=input('\nEnter your RGB image file name=','s');
file2=input('Enter output image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3); % to convert to Gray scale
%To convert gray scale to B/W
    for i=1:r
        for j=1:c
            if y(i,j,1)>=127
                y1(i,j,1)=255;
            else
                y1(i,j,1)=0;
            end
        end
    end
y2=x; % copying RGB image pixels to y2
%To copy Gray scale image 
y2(1:r,c+1:2*c,1)=y(1:r,1:c,1);
y2(1:r,c+1:2*c,2)=y(1:r,1:c,1);
y2(1:r,c+1:2*c,3)=y(1:r,1:c,1);
%To copy B/W image
y2(1:r,2*c+1:3*c,1)=y1(1:r,1:c,1);
y2(1:r,2*c+1:3*c,2)=y1(1:r,1:c,1);
y2(1:r,2*c+1:3*c,3)=y1(1:r,1:c,1);
imshow(y2);
imwrite(y2,file2);

