clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
ch=fread(fp1);% Reading entire file in matrix ch
fwrite(fp2,ch); % Writing entire file in output file
[r,c]=size(ch); % n= size of input matrix
fprintf('\nSize of input file=%d\n',r);
%End of program