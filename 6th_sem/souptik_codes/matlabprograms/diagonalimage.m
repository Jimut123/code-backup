clc;
close all;
clear all;

img1=input('Enter image file','s');
x=imread(img1);
[r,c,d]=size(x);
y=x;

step=r/c;
i=1;
j=1;
count=0;
while i<=r
    count=count+1;
    while j<=c
        y(i:r,j,1)=.2989*x(i:r,j,1)+.587*x(i:r,j,2)+.1140*x(i:r,j,3);
        y(i:r,j,2)=.2989*x(i:r,j,1)+.587*x(i:r,j,2)+.1140*x(i:r,j,3);
        y(i:r,j,3)=.2989*x(i:r,j,1)+.587*x(i:r,j,2)+.1140*x(i:r,j,3);
        j=j+1;
    end
    if count==4
        count=0;
        continue;
    end
    i=i+1;
    j=1;
end


imshow(y);