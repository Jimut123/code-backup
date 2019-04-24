%q72as2.m : Write a program to split 1 file to 2 output files.

clc;
close all;
clear all;
file1=input('\nEnter Input File name=','s');
file2=input('Enter Output  File-1 name=','s');
file3=input('Enter Output  File-2 name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
fseek(fp1,0,1); % Moving file pointer to end of file
n=ftell(fp1); % n= number of bytes in input file
n1=fix(n/2);
fseek(fp1,0,-1); % moving file pointer to beginning of input file
% To split input file into 2 output files
for i=1:n
    ch=fread(fp1,1);
    if i<=n1
        fwrite(fp2,ch);
    else
        fwrite(fp3,ch);
    end
end
fclose('all');
fprintf('\nFile Split is over\n');
fprintf('\nSize of <%s>=%d Bytes\n',file2,n1);
fprintf('Size of <%s>=%d Bytes\n',file3,(n-n1));
fprintf('Size of <%s>=%d Bytes\n',file1,n);
%End of program