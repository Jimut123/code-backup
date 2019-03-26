clc;
clear all;
close all;

file1=input('Enter input file name','s');
file2=input('Enter output file name','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'wt');
fseek(fp1,0,+1);
n=ftell(fp1);
for i=1:n
    fseek(fp1,-i,1);
    ch=fread(fp1,1);
    fprintf('%c',ch);
    fwrite(fp2,ch);
end
fclose('all');
