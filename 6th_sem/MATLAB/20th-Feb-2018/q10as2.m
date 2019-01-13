%q10as2.m : Write a program to extract all words from any file
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter output word file name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
nw=0;
flag=1;
while ~feof(fp1)
   ch= fscanf(fp1,'%c',1);
    ch1=upper(ch);
    if ch1>='A' & ch1<='Z'
        if  flag==1
            nw=nw+1;
            flag=0;
        end
        fprintf('%c',ch);
        fwrite(fp2,ch);
    elseif flag==0
        fprintf('\n');
        fprintf(fp2,'\n');
        flag=1;
    end
end
fprintf('\nTotal number of words extracted=%d\n',nw);
fclose('all');
%End of program
