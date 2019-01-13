%bit_conversion.m : Write a program to convert a file to bits
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fseek(fp1,0,1);
n=ftell(fp1);
for i=1:n
    ch=fread(fp1,1);
    fprintf('%c=:',ch);
    for j=8:-1:1
        b=bitget(ch,j);
        fprintf('%d',b);
        fprintf(fp2,'%d',b);
    end
    fprintf('\n');
end
fclose('all');
