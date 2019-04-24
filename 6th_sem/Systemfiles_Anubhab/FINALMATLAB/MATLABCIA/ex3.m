%Problem-3:xxximage3.m : Write a program to convert any RGB image file to
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
r1=fix(r/2);
c1=fix(c/2);
y(1:r1,1:c1,1:d)=x(1:r1,1:c1,1:d);
% To convert RGB to gray scale
y(1:r1,1:c1,1)=.2989*x(1:r1,1:c1,1)+.587*x(1:r1,1:c1,2)+.114*x(1:r1,1:c1,3);
y(1:r1,1:c1,1)=y(1:r1,1:c1,1);
y(1:r1,1:c1,2)=y(1:r1,1:c1,1);
y(1:r1,1:c1,3)=y(1:r1,1:c1,1);
for i=1:r1
    for j=1:c1
        if y(i,j,1)>=127
            b(i,j,1)=255;
        else
            b(i,j,1)=0;
        end
    end
end
x(1:r1,1:c1,1)=b(1:r1,1:c1,1);
x(1:r1,1:c1,2)=b(1:r1,1:c1,1);
x(1:r1,1:c1,3)=b(1:r1,1:c1,1);
x(1:r1,c1+1:c,2)=0;
x(1:r1,c1+1:c,3)=0;
x(r1+1:r,1:c1,1)=0;
x(r1+1:r,1:c1,2)=0;
x(r1+1:r,c1+1:c,1)=0;
x(r1+1:r,c1+1:c,3)=0;
% To copy modified image to yf without border
    yf(11:r+10,11:c+10,1:d)=x(1:r,1:c,1:d);
    
    % To add border on top position
    for i=1:3
    yf(1:10,1:c+20,1:i)=0;
    end
    % To add boder on bottom position
    for i=1:3
        yf(r+11:r+20,1:c+20,i)=0;
    end
    %To add border on LHS
    for i=1:3
        yf(11:r+10,1:10,i)=0;
    end
    %To add border on RHS
    for i=1:3
        yf(11:r+10,c+11:c+20,i)=0;
    end
imshow(yf);
imwrite(yf,file2);