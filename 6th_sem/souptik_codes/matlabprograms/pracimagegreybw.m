clc;
close all;
clear all;


img1=input('Enter Image ','s');
x=imread(img1);
[r,c,d]=size(x);

%greyscale

y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1140*x(1:r,1:c,3);

for i=1:r
    for j=1:c
        if y(i,j,1)>127
            y(i,j,1)=255;
        else
            y(i,j,1)=0;
        end
    end
end
imshow(y);