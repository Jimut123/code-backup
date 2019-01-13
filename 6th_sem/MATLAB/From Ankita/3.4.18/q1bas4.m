%q1as4.m:Write a program to split a RGB image to 3 equal parts.Change the
%color of middle portion to gray scale and bottom portion to B/W. Club #
%portions  and then add black border
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('\nEnter output Image File name=','s');
x=imread(file1);
[r,c,d]=size(x);
c1=fix(c/3);
c2=c-2*c1;
y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d);%1st 1/3 rd of image
y2(1:r,1:c1,1:d)=x(1:r,c1+1:2*c1,1:d);%2nd 1/3rd of image
y3(1:r,1:c2,1:d)=x(1:r,2*c1+1:c,1:d);%last 1/3rd part of image

%To convert 2nd and 3rd image to gray
y2g(1:r,1:c1,1)=.2987*y2(1:r,1:c1,1)+.587*y2(1:r,1:c1,2)+.114*y2(1:r,1:c1,3);
y3g(1:r,1:c2,1)=.2987*y3(1:r,1:c2,1)+.587*y3(1:r,1:c2,2)+.114*y3(1:r,1:c2,3);
%to convert 3rd image to b/w
for i=1:r
    for j=1:c2
        if y3g(i,j,1)>=127
            y3b(i,j,1)=255;
        else
            y3b(i,j,1)=0;
        end
    end
end
%to club 3 image
yfinal=y1;
%To copy y2g to yfinal
yfinal(1:r,c1+1:2*c1,1)=y2g(1:r,1:c1,1); 
yfinal(1:r,c1+1:2*c1,2)=y2g(1:r,1:c1,1); 
yfinal(1:r,c1+1:2*c1,3)=y2g(1:r,1:c1,1); 
%To copy y3b to yfinal
yfinal(1:r,2*c1+1:c,1)=y3b(1:r,1:c2,1); 
yfinal(1:r,2*c1+1:c,2)=y3b(1:r,1:c2,1); 
yfinal(1:r,2*c1+1:c,3)=y3b(1:r,1:c2,1); 
%imshow(yfinal);

%copy modified image to yf without border
yf(11:r+10,11:c+10,1:d)=yfinal(1:r,1:c,1:d);

%to add border on top position
for i=1:3
    yf(1:10,1:c+20,i)=0;
end
%to add border on bottom position
for i=1:3
    yf(r+11:r+20,1:c+20,i)=0;
end
%to add border on left position
for i=1:3
    yf(11:r+10,1:10,i)=0;
end
%to add border on top position
for i=1:3
    yf(11:r+10,c+11:c+20,i)=0;
end
imshow(yf);
imwrite(yf,file2);