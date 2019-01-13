%q91nas2.m: Write a program to convert all small letters to capital letters
%in any text/matlab file
clc;
close all;
clear all;
file1=input('\nEnter Your File name=','s');
fp1=fopen(file1,'r+');
fseek(fp1,0,1); % Moving File identifier to last byte
n=ftell(fp1); % Toget number of bytes in input file
fseek(fp1,0,-1);% Moving file identifier to beginning of file
nc=0; % nc=number of bytes modified
for i=1:n
    ch=fread(fp1,1);
    if ch>=97 && ch<=122
        ch=ch-32;
        fseek(fp1,-1,0);%moving file identifier by 1 byte on LHS
        fwrite(fp1,ch);
        nc=nc+1;
    end
end
fclose(fp1);
fprintf('\nNumber of Bytes modied=%d\n',nc);
%End of program
