%q72as2.m : Write a program to split content of one file to two ouput files
clc;
close all;
clear all;
file1=input('\nEnter your Input File name=','s');
file2=input('Enter your Output File-1 Name=','s');
file3=input('Enter your Output File-2 Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
ch=fread(fp1); % Copying content of file1 in ch
n=length(ch);
n1=fix(n/2);
fseek(fp1,0,-1); % Moving back to beginning of the file
    for i=1:n
        ch=fread(fp1,1);
        if i<=n1
            fwrite(fp2,ch);
        else
            fwrite(fp3,ch);
        end
    end
fprintf('\nNumber of Bytes copied=%d\n',n);
fclose('all');
%End of main program
