%anfile1.m : Write a program to copy content of one file to another file.
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
ch=fread(fp1);
n=size(ch);
fwrite(fp2,ch);
fprintf('\nSize of input file=%d Bytes\n',file1,n);
fclose(fp1);
fclose(fp2);
% End of program

