%q91nas2.m: write a program to convert all small letters to capital letters
%in any text/matlab file
clc;
close all;
clear all;
file1=input('\nenter your file name=','s');
fp1=fopen(file1,'r+');
fseek(fp1,0,1); % moving file identifier to last byte
n=ftell(fp1); % toget number of bytes in input file
fseek(fp1,0,-1);% moving file identifier to beginning of file
nc=0; % nc=number of bytes modified
for i=1:n
    ch=fscanf(fp1,'%d');
    if ch>=97 && ch<=122
        ch=ch-32;
        fseek(fp1,-1,0);%moving file identifier by 1 byte on lhs
        fprintf(fp1,'%c',char(ch));
        nc=nc+1;
    end
end
fclose(fp1);
fprintf('\nnumber of bytes modied=%d\n',nc);
%end of program
