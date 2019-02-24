% xximage5.m : Write a program to convert any RGB inmage to (i) Gray Scale
% and (ii) B/W image file

clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Gray Scale image File Name=','s');
file3=input('Enter B/W Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);

%to convert RGB to grayscale
g(1:r, 1:c, 1)=0.2989*x(1:r, 1:c, 1)+0.587*x(1:r, 1:c, 2)+0.114*x(1:r, 1:c, 3);
imwrite(g, file2); % Saving gray scale image in file2

%to convert Gray Scale image to B/W Image
for i=1:r
    for j=1:c
        if g(i,j,1)>=127
            b(i,j,1)=255;
        else
            b(i,j,1)=0;
        end
    end
end

imwrite(b,file3); %Saving Binary Imagefile in file3
imshow(b);

            
            
            