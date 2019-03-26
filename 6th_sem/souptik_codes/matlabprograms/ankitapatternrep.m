clc;
close all;
clear all;

file1=input('Enter the name of input file: ','s');
file2=input('Enter the name of output file: ','s');
target=input('Pattern to be searched :','s');
replace=input('Pattern to be replaced :','s');

fp1=fopen(file1,'r');
fp2=fopen(file2,'w');

fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);

tl=length(target);
%rl=length(replace);

while ~feof(fp1)

if (n-tl)>=0

    ch=fread(fp1,tl);
    if strcmp(ch,target)==1
        fwrite(fp2,replace);
        n=n-tl;
    else 
        fseek(fp1,-tl,0);
        ch=fread(fp1,1);
        fwrite(fp2,ch);
        n=n-1;
    end

end

end