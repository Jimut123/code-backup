%q71as2.m: write a program to copy content of 1 file to anothr file
clc;
close all;
clear all;
file1=input('\nenter input file name=','s');
file2=input('enter output file name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
ch=fread(fp1);
l=length(ch);
fwrite(fp2,ch);
fprintf('\nnumber of bytes copied=%d\n',l);
%end of program


    
