%q71as2.m : Write a program to copy content of one file to another file
clc;
close all;
clear all;
file1=input('\nEnter your Input File name=','s');
file2=input('Enter your Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
ch=fread(fp1); % Copying content of file1 in ch
fwrite(fp2,ch);
n=length(ch);
fprintf('\nNumber of Bytes copied=%d\n',n);
fclose('all');
%End of main program
