%Program to convert small letters to capital letters
clc;
close all;
clear all;
file1=input('Enter input file name=','s');
fp1=fopen(file1,'r+');
n=0;%total no. of characters 
nc=0; %Total no. of characters modified to capital letter
while ~feof(fp1)
    ch=fread(fp1,1);
    n=n+1;
    if ch>='a' & ch<='z'
        ch1=upper(ch);
        fseek(fp1,-1,0);%to move file identifier by 1 byte on lhs
        fprintf(fp1,'%C',ch1);
        nc=nc+1;
    end
end
fprintf('\nSize of <%s>=%d\n',file1,n);
fprintf('\nNumber of bytes modified to capital letters=%d\n',nc);
fclose('all');