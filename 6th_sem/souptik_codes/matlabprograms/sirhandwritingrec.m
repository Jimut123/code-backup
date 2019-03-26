clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
f1={'1.jpg','2','3','4','5','6','7','8'};
x=imread(file1);
[r,c,d]=size(x);

y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1140*x(1:r,1:c,3);
for i=1:r
    for j=1:c
        if y(i,j,1)>=127
            y(i,j,1)=255;
        else
            y(i,j,1)=0;
        end
    end
end
%imshow(y);
stc=0;
stc1=0;
flag=0;
check=0;
qq=1;
t=1;