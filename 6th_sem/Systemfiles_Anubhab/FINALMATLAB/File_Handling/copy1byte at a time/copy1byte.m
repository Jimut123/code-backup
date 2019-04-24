%q71aas2.m : Write a program in Matlab to copy content of 1 file to another
%file. Copy 1 byte at a time

clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fseek(fp1,0,1); % Moving file identifier to the last byte
n=ftell(fp1); % n=size of input file
fseek(fp1,0,-1); % moving file identifier to beginning of file
while ~feof(fp1)
    ch=fread(fp1,1);
    fwrite(fp2,ch);
end
fprintf('\nFile Copy is over\n');
fprintf('\nSize of input file=%d Bytes\n',n);
fclose('all'); % closing all files
%End of program