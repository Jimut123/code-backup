clc;
clear all;
close all;

file1=input('Enter input file name','s');
file2=input('Enter output file name','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
new=0;
for i=1:n
    ch=fread(fp1,1);
    if (ch>=97 & ch<=122) | (ch>=65 & ch<=90)
        fwrite(fp2,ch);
        c=1;
    else
        if c==1
            fwrite(fp2,13);
            fwrite(fp2,10);
        end
        c=0;
    end
end
fclose('all');
        

