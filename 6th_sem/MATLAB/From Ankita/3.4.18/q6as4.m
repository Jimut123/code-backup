%q6as4.m:Extract all characters from image file and store in differnt
%output files
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file4=['a1.jpg';'a2.jpg';'a3.jpg';'a4.jpg';'a5.jpg';'a6.jpg';'a7.jpg';'a8.jpg';'a9.jpg';'b1.jpg';'b2.jpg';'b3.jpg';'b4.jpg';'b5.jpg';'b6.jpg';'b7.jpg';'b8.jpg';'b9.jpg'];
y=imread(file1);
[r,c,d]=size(y);
yg(1:r,1:c,1)=.2989*y(1:r,1:c,1)+.587*y(1:r,1:c,2)+.114*y(1:r,1:c,3);
for i=1:r
    for j=1:c
        if yg(i,j,1)>=127
            b(i,j,1)=255;
        else
            b(i,j,1)=0;
        end
    end
end
cs1=1;
cs2=0;
n1=0;
while 1==1
    for j=cs1:c
        flag=1;
        for i=1:r
            if b(i,j,1)==0
                cs1=j;
                flag=0;
                break;
            end
        end
        if flag==0
            break;
        end
    end
    if flag==1
        break;
    end
    if flag==0
        for j=cs1+1:c
            flag=1;
            for i=1:r
                if b(i,j,1)==0
                    cs2=j;
                    flag=0;
                end
            end
            if flag==1
                break;
            end
        end
    n1=n1+1;
    z1(1:r,1:cs2-cs1+1,1)=b(1:r,cs1:cs2,1);
    imwrite(z1,file4(n1,:));
    z1(1:r,1:cs2-cs1+1,1)=255;
    fprintf('cs1=%d cs=%d n1=%d r=%d c=%d d=%d\n',cs1,cs2,n1,r,c,d);
    cs1=cs2+1;
    end
end