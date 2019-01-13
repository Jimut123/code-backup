%q91as2.m:Write a program to all small letters to capital letters
clc;
close all;
clear all;
file1=input('\nEnter Your File name=','s');
fp1=fopen(file1,'r+');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);%moving file identifier to beginning of file
nc=0;%nc=number of bytes modified
for i=1:n
    ch=fread(fp1,1);
    if ch>=97 && ch<=122
        ch=ch-32;
        fseek(fp1,-1,0);
        fwrite(fp1,ch);
        nc=nc+1;
    end
end
fclose(fp1);fprintf('\nNumber of bytes modified=%d\n',nc);