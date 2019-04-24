clc;
clear all;
close all;
x=imread('img.jpg');
[r,c,d]=size(x);

for i=1:r
    for j=1:c
    if x(i,j,3)>x(i,j,1) && x(i,j,3)>x(i,j,2)
        y(i,j,1)=0.2989*x(i,j,1)+0.587*x(i,j,2)+0.114*x(i,j,3);
        y(i,j,2)=0;
        y(i,j,3)=0;
    elseif  x(i,j,1)>x(i,j,2) && x(i,j,1)>x(i,j,3)
        y(i,j,1)=0;%x(i,j,1);
        y(i,j,2)=0;%x(i,j,2);
        y(i,j,3)=0.2989*x(i,j,1)+0.587*x(i,j,2)+0.114*x(i,j,3);%x(i,j,3);
    else
        y(i,j,1)=x(i,j,1);
        y(i,j,2)=x(i,j,2);
        y(i,j,3)=x(i,j,3);    
    end
    end
end
%imshow(y);
imwrite(y,'imgout.jpg','jpg');