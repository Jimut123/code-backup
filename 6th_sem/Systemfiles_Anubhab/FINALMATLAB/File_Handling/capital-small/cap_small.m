%q92as2.m : Write a program to convert all capital letters to small letters
%in any file

clc;
close all;
clear all;
file1=input('\nEnter File Name = ','s');
fp1=fopen(file1,'r+');
fseek(fp1,0,1); %Moving file pointer to end of file
n=ftell(fp1); %n=size of input file
fseek(fp1,0,-1); %Moving file pointer to beginning of file
nc=0; %nc=number of bytes modified
for i=1:n
    ch=fread(fp1,1);
    if ch>=65 && ch<=97
        nc=nc+1;
        fseek(fp1,-1,0); %Move position indicator offset bytes toward the beginning of the file.
        ch=ch+32;
        fwrite(fp1,ch);
    end
end
fclose('all');
fprintf('\nSize of <%s> = %d Bytes and number of Bytes modified = %d Bytes\n',file1,n,nc);
%End of program