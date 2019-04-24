
%stego1.m : Write a program to embed the secret file inside an image file
clc;
close all;
clear all;
file1=input('\nEnter Input RGB image File name=','s');
file2=input('\nEnter Output image File name=','s');
file3=input('\nEnter secret file=','s');
x=imread(file1);
[r,c,d]=size(x);
fp1=fopen(file3,'r');
r1=1;
c1=1;
y=x;
fseek(fp1,0,1);
n=ftell(fp1);
for j=1:n
    fseek(fp1,j,-1);
       ch=fscanf(fp1,'%c',1);
       ch1=cast(ch,'uint8');%to convert character into integer
       %to convert number to bits
       for i=8:-1:1
           b=bitget(ch1,i);
           fprintf('\n%d',b);
           y(r1,c1,1)= b;
           fprintf('OK');
           ch=y(r1,c1,1);
           fprintf('%d',ch);
           c1=c1+1;
           if c1>c
               c1=1;
               r1=r1+1;
           end
       end
end
imwrite(y,file2);
imshow(y);
%End of program