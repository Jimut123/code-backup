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
p=1;
for i=1:r
    for j=p:c
        y(i,j,1)=.2989*x(i,j,1)+.587*x(i,j,2)+.114*x(i,j,3);
    end
    p=p+1;
    if p>c
        break;
    end
end
y(1:r,1:c,1)=y(1:r,1:c,1);
y(1:r,1:c,2)=y(1:r,1:c,1);
y(1:r,1:c,3)=y(1:r,1:c,1);
for i=1:r
    for j=1:c
        if y(i,j,1)>=127
            b(i,j,1)=255;
        else
            b(i,j,1)=0;
        end
    end
end
y(1:r,1:c,1)=b(1:r,1:c,1);
y(1:r,1:c,2)=b(1:r,1:c,1);
y(1:r,1:c,3)=b(1:r,1:c,1);
p=1;
for i=1:r
    for j=p:c
        x(i,j,1:d)=y(i,j,1:d);
    end
    p=p+1;
    if p>c
        break;
    end
end
imshow(x);
imwrite(x,file2);