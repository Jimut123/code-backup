%q10bas2.m : Write a program to extract all words from any text file
clc;
close all;
clear all;
file1=input('\nEnter Input File name=','s');
file2=input('Enter Output Word File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fseek(fp1,0,1); % To move file pointer to the end of a file
n=ftell(fp1); % To get number of Bytes in file1
fseek(fp1,0,-1); % To move file pointer to the beginning of a file
flag=1;
nw=0; % nw=number of words
for i=1:n
    ch=fscanf(fp1,'%c',1);
    ch1=upper(ch);
    if ch1>='A' & ch1<='Z'
        if flag==1
            flag=0;
            nw=nw+1;
        end
        fprintf('%c',ch);
        fwrite(fp2,ch);
    elseif flag==0
        flag=1;
        fprintf('\n');
        fprintf(fp2,'\n');
    end
end
fprintf('\nNumber of words extracted=%d\n',nw);
%End of program
