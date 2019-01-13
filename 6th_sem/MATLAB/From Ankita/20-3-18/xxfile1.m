%xxfile1.m:Write a program any file to binary file
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('\nEnter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
while ~feof(fp1)
    ch=fscanf(fp1,'%c',1);
    ch1=cast(ch,'uint8');%to convert char to integer
    fprintf('\n%c:',ch);
    %To convert number to bits
    for i=8:-1:1
        b=bitget(ch1,i);
        fprintf('%d',b);
        fprintf(fp2,'%d',b);
    end
end
fclose('all');
%End of program