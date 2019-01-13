%q72as2.m: Write a program to split one file 2 files
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File-1 Name=','s');
file3=input('Enter output file-2 name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
ch=fread(fp1);
l=length(ch);
n1=fix(l/2);
n=0;
fseek(fp1,0,-1);
    while ~feof(fp1)
    ch=fread(fp1,1);
    n=n+1;
    if n<=n1
        fwrite(fp2,ch);
        else
            fwrite(fp3,ch);
    end
    end
    fclose('all');
    %end of program


    
