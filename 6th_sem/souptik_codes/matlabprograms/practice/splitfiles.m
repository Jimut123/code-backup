clc;
clear all;
close all;

file1=input('Enter input file name','s');
file2=input('Enter output file name','s');
file3=input('Enter output file name 2','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
for i=1:n
    ch=fread(fp1,1);
    if i<n/2
        fwrite(fp2,ch);
    else
        fwrite(fp3,ch);
    end
end
fclose('all');
