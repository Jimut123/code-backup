%q91as2.m : Write a program to convert all small leters to capital letters 
clc;
close all;
clear all;
file1=input('\nEnter your File Name=','s');
fp1=fopen(file1,'r+');
n=0;  % n=Total number of characters in input file
nc=0; % nc=number of characters modified to capital letters
while ~feof(fp1)
    ch=fread(fp1,1);
fprintf('ch=%c\n',ch);
    n=n+1;
    if ch>='a' & ch<='z'
        ch1=upper(ch);
        fseek(fp1,-1,0); % to move file identifier by 1 byte on LHS
        fprintf(fp1,'%c',ch1);
        nc=nc+1;
    end
end
fclose('all');
fprintf('Size of <%s>=%d Bytes\n',file1,n);
fprintf('Number of Bytes modified to capital letters=%d\n',nc);
%End of program

