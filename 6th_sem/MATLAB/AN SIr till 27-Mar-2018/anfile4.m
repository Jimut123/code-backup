%anfile4.m : Write a program to extract all words from any file
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter output word file name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
nw=0;
flag=1;
fseek(fp1,0,1);
n=ftell(fp1);
fprintf('n=%d\n',n);
fseek(fp1,0,-1);
for i=1:n
    ch=fread(fp1,1);
    ch1=int8(upper(ch));
    if  ch>='A'  && ch<='Z'
            if flag==1
            nw=nw+1;
            flag=0;
            end
    fwrite(fp2,ch);
    fprintf('%c',ch);
        elseif flag==0
        fprintf('\n');
        fprintf(fp2,'\n');
        flag=1;
    end
end
fclose('all');
fprintf('\nNumber of words=%d\n',nw);
%end of program
