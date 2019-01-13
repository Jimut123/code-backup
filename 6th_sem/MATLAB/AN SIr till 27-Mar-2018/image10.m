%image10.m : Write a program to input any RGB image and perform the
%following changes : (i) convert it into Gray scale, (ii)Convert Gray scale
%to B/W, (iii) Convert B/W to inverse image.  Save and display modified
%image.
clc;
close all;
clear all;
file1=input('\nEnter your Input image file name=','s');
file2=input('Enter your Gray scale image file name=','s');
file3=input('Enter your B/W image file name=','s');
file4=input('Enter your inverse image file name=','s');
file5=input('Enter your Target image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
g(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);%converting to Gray scale
% To convert gray scale to b/w
for i=1:r
    for j=1:c
        if g(i,j,1)>=127
            b(i,j,1)=255;
        else
            b(i,j,1)=0;
        end
    end
end
% To get inverse image
for i=1:r
    for j=1:c
        if b(i,j,1)==255
            inverse(i,j,1)=0;
        else
            inverse(i,j,1)=255;
        end
    end
end
imwrite(g,file2);
imwrite(b,file3);
imwrite(inverse,file4);
y=x; % copying original file
y(1:r,c+1:2*c,1)=g(1:r,1:c,1); % copying gray scale image
y(1:r,c+1:2*c,2)=g(1:r,1:c,1);
y(1:r,c+1:2*c,3)=g(1:r,1:c,1);

y(1:r,2*c+1:3*c,1)=b(1:r,1:c,1); % Copying b/w image
y(1:r,2*c+1:3*c,2)=b(1:r,1:c,1);
y(1:r,2*c+1:3*c,3)=b(1:r,1:c,1);

y(1:r,3*c+1:4*c,1)=inverse(1:r,1:c,1); % copying inverse image
y(1:r,3*c+1:4*c,2)=inverse(1:r,1:c,1);
y(1:r,3*c+1:4*c,3)=inverse(1:r,1:c,1);

imshow(y);
imwrite(y,file5);








