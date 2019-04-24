%q93as2.m : Write a program to remove all comment lines from any MATLAB
%program file

clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
nc=0;
fseek(fp1,0,1); % To go to end of file
n=ftell(fp1);
fprintf('\nn=%d\n',n);
fseek(fp1,0,-1); % To go to beginning of the file
for i=1:n
    ch=fread(fp1,1);
    fprintf('%c',char(ch));
    if  ch==39
        while 1==1
            fprintf(fp2,'%c',char(ch));
            ch=fscanf(fp1,'%d');
            if ch==39
                fprintf(fp2,'%c',char(ch));
                break;
            end
        end
    elseif char(ch)=='%'
        nc=nc+1;
        while 1==1
            ch=fscanf(fp1,'%d');
            if ch==10
                break;
            end
        end
    else
        fprintf(fp2,'%c',char(ch));
    end
end
fclose('all');
fprintf('\nNumber of comment lines removed=%d\n',nc);
%end of program