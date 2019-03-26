clc;
close all;
clear all;

file1=input('Enter the name of input file ','s');
file2=input('Enter the name of the out put file ','s');

fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
%fseek(fp1,0,-1);
cc=fread(fp1);
fwrite(fp2,cc);