%embed the secret file inside an image file
clc;
close all;
clear all;
file1=input('\nEnter Input stego image File name=','s');
file2=input('\nEnter Output File name=','s');
x=imread(file1);
[r,c,d]=size(x);
fp1=fopen(file2,'w');
flag=1;
i=1;
while flag==1
    for j=1:c
            ch=x(i,j,1);
            if ch==0 ||ch==1
                flag=1;
                n=0;
                j=j-1;
                for k=7:-1:0
                   j=j+1;
                   ch=x(i,j,1);
                   n=n+ch*2^i;
                   fprintf(fp1,'%c',n);
                end
            else
                flag=0;
                break;
            end
    end
    i=i+1;
end
fclose('all');