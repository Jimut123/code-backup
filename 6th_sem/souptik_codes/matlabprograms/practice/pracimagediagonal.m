clc;
close all;
clear all;


img1=input('Enter Image ','s');
x=imread(img1);
[r,c,d]=size(x);
step=1;
if r>c
    step=c/r;
else
    step=r/c;
end
i=1;
j=1;
y=x;
c=1
for i=1:step:r
    k=floor(i);
     y(k:r,c,1)=.2989*x(k:r,c,1)+.587*x(k:r,c,2)+.1140*x(k:r,c,3);
     y(k:r,c,2)=.2989*x(k:r,c,1)+.587*x(k:r,c,2)+.1140*x(k:r,c,3);
     y(k:r,c,3)=.2989*x(k:r,c,1)+.587*x(k:r,c,2)+.1140*x(k:r,c,3);
     c=c+1;
end
imshow(y);