%xximage6.m : Write a program to extract all characters from any hand
%written text
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name = ','s');
out_file=['aa.jpg';'ab.jpg';'ac.jpg';'ad.jpg';'ae.jpg';'af.jpg';'ag.jpg';'ah.jpg';
    'ai.jpg';'aj.jpg';'ak.jpg';'al.jpg';'am.jpg';'an.jpg';'ao.jpg';'ap.jpg';
    'aq.jpg';'ar.jpg';'as.jpg';'at.jpg';'au.jpg';'av.jpg';'aw.jpg';'ax.jpg';
    'ay.jpg';'az.jpg'];
x=imread(file1);
[r,c,d]=size(x);
%To convert RGB to Gray scale
g(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
%To convert Gray Scale to binary image
for i=1:r
    for j=1:c
        if g(i,j,1)>=127
            b(i,j,1)=255;
        else
            b(i,j,1)=0;
        end
    end
end
fprintf('\nr=%d c=%d d=%d\n',r,c,d);
imshow(b);
%To extract characters from input text file
n=0; % n=counter for each character
c1=1;
for cloop=1:c
    %To find left edge of any character
    for i=c1:c
        flag1=0; %flag1=0 means we have obtained a white pixel
        for j=1:r
            if b(i,j,1)==0
                c1=i;
                flag1=1;
                break;
            end
        end
        if flag1==1
            break;
        end
    end
    %To get right edge of a character
    c2=c1+1;
    for i=c2:c
        flag2=1;
        for i=1:r
            if b(i,j,1)==0
                flag2=0;
                break;
            end
        end
        if flag2==1
            c2=i-1;
            break;
        end
    end
    %To extract a character from i=c1 to i=c2
    if flag1==1 && flag2==1
        y1(1:r,1:c2-c1+1,1)=255;
        y1(1:r,1:c2-c1+1,1)=b(1:r,c1:c2,1);
        n=n+1;
        imwrite(y1,out_file(n,:));
        cloop=cloop+c2-c1+1;
        c1=c2+1;
    end
end