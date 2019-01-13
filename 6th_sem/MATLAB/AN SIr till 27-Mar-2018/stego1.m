%stego1.m : Write a program to extract bits from any given file
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output bit File name=','s');
file3=input('Enter Output stego File Name=','s');
str=input('\nEnter any secret message=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
while ~feof(fp1)
    ch=fscanf(fp1,'%c',1);
    ch1=cast(ch,'uint8');
    fprintf('\n%c :',ch);
    for i=8:-1:1
        b=bitget(ch1,i);
        fprintf('%d',b);
        fprintf(fp2,'%d',b);
    end
end
    % To convert String to bits
    m=length(str);
    j=0;
    fprintf('\nSecret Message--->\n')
    for i=1:m
        ch=str(i);
        ch1=cast(ch,'uint8');
        fprintf('\n%c :',ch);
        for k=8:-1:1
        j=j+1;
        b(j)=bitget(ch1,k);
        fprintf('%d',b(j));
        end
    end
    fclose(fp1);
    fclose(fp2);
    
    

    