%q1nas4.m: Write a program to split an image to 3 images and then hange the
%color of 2nd image to gray scale color and the 3r image to B/W/ Club all 3
%images. Give a border on all 4 ends of the image. Display the image on
%screen. save the image in some output file.
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File name=','s');
x=imread(file1);
[r,c,d]=size(x);
r1=fix(r/3);
r2=r-2*r1;
%To split image into 3 images along y-axis
y1(1:r1,1:c,1:d)=x(1:r1,1:c,1:d);
y2(1:r1,1:c,1:d)=x(r1+1:2*r1,1:c,1:d);
y3(1:r2,1:c,1:d)=x(2*r1+1:r,1:c,1:d);
imshow(y3);
%To change color of 2nd and 3rd portion of original image to Gray scale
y2c(1:r1,1:c,1)=.2987*y2(1:r1,1:c,1)+.587*y2(1:r1,1:c,2)+.114*y2(1:r1,1:c,3);
y3c(1:r2,1:c,1)=.2987*y3(1:r2,1:c,1)+.587*y3(1:r2,1:c,2)+.114*y3(1:r2,1:c,3);

% To change color of 3rd portion of the image to B/W
    for i=1:r2
        for j=1:c
            if y3c(i,j,1)>=127
            y3d(i,j,1)=255;
            else
            y3d(i,j,1)=0;
            end
        end
    end
% To club all 3 images to get one image
y1new(1:r1,1:c,1:d)=y1(1:r1,1:c,1:d);
y1new(r1+1:2*r1,1:c,1)=y2(1:r1,1:c,1);
y1new(r1+1:2*r1,1:c,2)=y2(1:r1,1:c,1);
y1new(r1+1:2*r1,1:c,3)=y2(1:r1,1:c,1);

y1new(2*r1+1:r,1:c,1)=y3d(1:r2,1:c,1);
y1new(2*r1+1:r,1:c,2)=y3d(1:r2,1:c,1);
y1new(2*r1+1:r,1:c,3)=y3d(1:r2,1:c,1);


% To insert the clubbed image inside the borders
    y1final(11:r+10,11:c+10,1:d)=y1new(1:r,1:c,1:d);
    
% To insert border in clubbed image
%To draw border on top of the image
    for i=1:3
    y1final(1:10,1:c+20,i)=255;
    end
%To draw border on bottom of the image
    for i=1:3
        y1final(r+11:r+20,1:c+20,i)=255;
    end
%To draw border on LHS of the image
    for i=1:3
        y1final(11:r+20,1:10,i)=255;
    end
%To draw border on RHS of the image
    for i=1:3
        y1final(11:r+20,c+11:c+20,i)=255;
    end

    
imshow(y1final);
