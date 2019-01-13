%anfile3.m : Write a program to split a file into two files.
clc;
close all;
clear all;
file1=input('\nEnter Inout file name=','s');
file2=input('Enter output file-1 name=','s');
file3=input('Enter output file-2 name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
fseek(fp1,0,1); % Moving file pointer to end of file
n=ftell(fp1); % To get position of last byte position
fseek(fp1,0,-1);% To move file pointer to beginning of file
n1=fix(n/2);
n2=n-n1;
for i=1:n
    ch=fread(fp1,1);
    if  i<=n1
        fwrite(fp2,ch);
    else
        fwrite(fp3,ch);
    end
end
fclose('all');

        
