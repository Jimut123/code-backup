%q91as2.m : Write a program in MATLAB to convert all small letters to
%capital letters in any file

clc;
close all;
clear all;
file1=input('\nEnter File Name=','s');
fp1=fopen(file1,'r+');
fseek(fp1,0,1); % moving File pointer to end of file
n=ftell(fp1); % n=size of of input file
fseek(fp1,0,-1); % Moving file pointer to beginning of file
nc=0; % nc=number of bytes modified
for i=1:n
    ch=fread(fp1,1);
    if ch>=97 && ch<=122
       nc=nc+1;
       fseek(fp1,-1,0);
       ch=ch-32;
       fwrite(fp1,ch);
    end
end
fclose('all');
fprintf('\nSize of <%s>=%d Bytes and number of Bytes modified=%d Bytes\n',file1,n,nc);
%end of program