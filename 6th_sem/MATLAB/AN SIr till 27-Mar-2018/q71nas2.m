%q71nas2.m: Write a program to convert all small letters to capital letters
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r+');
fp2=fopen(file2,'w');
n1=0;
n2=0;
    while ~feof(fp1)
        ch=fread(fp1,1);
        n1=n1+1;
            if ch>='a' & ch<='z'
                ch=ch-32;
                fseek(fp1,-1,0);
                fwrite(fp1,ch);
                n2=n2+1;
            else
            end
     end
fprintf('\nNumber of Bytes modified=%d\n',n2);
fprintf('Number of Bytes read=%d\n',n1);
fclose('all');
%end of program


    
