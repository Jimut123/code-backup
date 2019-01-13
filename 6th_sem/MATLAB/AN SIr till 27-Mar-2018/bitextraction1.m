%bitextraction1.m : Write a program to convert any file to bits
clc;
close all;
clear all;
file1=input('\nEnter Input file name=','s');
file2=input('Enter output file name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
for i=1:n
    ch=fread(fp1,1);
    fprintf('%c :',ch);
    for j=8:-1:1
        b=bitget(ch,j);
        fprintf('%d',b);
    end
    fprintf('\n');
end
fclose('all');
