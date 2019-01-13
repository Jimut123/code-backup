%xximage3.m:wap to convert any rgb file to gray scale .Use formula:
%gs=.2989*r+.587*g+.114*b.Convert gray scale image to b/w image. Paste gray scale image and B/W image on rhs of rgb image
clc;
clear all;
close all;
file1=input('\nEnter your input file name=','s');
file2=input('\nEnter your output file name=','s');
x=imread(file1);
[r,c,d]=size(x);
% to convert rgb to gray scale
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
%paste gray scale image to rhs on rgb image
x(1:r,c+1:2*c,1)=y(1:r,1:c,1);
x(1:r,c+1:2*c,2)=y(1:r,1:c,1);
x(1:r,c+1:2*c,3)=y(1:r,1:c,1);
%to convert gray scale to B/W image.We change pixel value 0-126 to 0 and
%127-255 to 255
for i=1:r
    for j=1:c
        if y(i,j,1)>=127
            z(i,j,1)=255;
        else
            z(i,j,1)=0;
        end
    end
end
%to paste B/W image on RHS of gray scale image
x(1:r,2*c+1:3*c,1)=z(1:r,1:c,1);
x(1:r,2*c+1:3*c,2)=z(1:r,1:c,1);
x(1:r,2*c+1:3*c,3)=z(1:r,1:c,1);
imshow(x);
imwrite(x,file2);