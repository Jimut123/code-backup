%q91as2.m : Write a program to convert all small letters to capital letters
clc;
close all;
clear all;
file1=input('\nEnter your source File Name=','s');
fp1=fopen(file1,'r+');
fseek(fp1,0,1); % To go to end of file
n=ftell(fp1);
fseek(fp1,0,-1); % To go to beginning of the file
nc=0;
for i=1:n
    ch=fread(fp1,1);
    if ch>=97 && ch<=122
    ch=ch-32;
    fseek(fp1,-1,0); % To move file pointer 1 byte on LHS
    fwrite(fp1,ch);
    nc=nc+1;
    end
end
fclose(fp1);
fprintf('\nTotal number of smal letters  modified to capital letters=%d\n',nc);
%End of program