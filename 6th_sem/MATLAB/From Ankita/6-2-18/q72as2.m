%copy content of one file to 2 output files
clc;
close all;
clear all;
file1=input('Enter input file name=','s');
file2=input('Enter output file-1 name=','s');
file3=input('Enter output file-2 name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
ch=fread(fp1);%coping content of file1 in ch
n=length(ch);
n1=fix(n/2);
fseek(fp1,0,-1);%Moving back to beginning of file
for i=1:n
    ch=fread(fp1,1);
    if i<=n1
        fwrite(fp2,ch);
    else
        fwrite(fp3,ch);
    end
end
fprintf('\nNumber of bytes copied=%d\n',n);
fclose('all');