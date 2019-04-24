%pat_replace.m : Write a program to replace old pattern by new pattern
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
opat=input('Enter old pattern to be searched=','s');
npat=input('Enter new pattern to be searched=','s');
leno=length(opat); % leno=length of old pattern
lenn=length(npat); % lenn=length of new pattern
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
nc=0;
while ~feof(fp1);
    ch=fread(fp1,1,'uint8=>char');
    if upper(ch)==upper(opat(1))
        flag=1;
        for i=1:leno-1
            j=i+1;
            ch=fread(fp1,1,'uint8=>char');
            if upper(ch) ~= upper(opat(j))
                flag=0;
                break;
            end
        end
        if flag==1
            for i1=1:lenn
                fwrite(fp2,npat(i1));
            end
            nc=nc+1;
        else
        fseek(fp1,-j,0);
            for k=1:j
                ch=fread(fp1,1,'uint8=>char');
                fwrite(fp2,ch);
            end
        end
    else
        fwrite(fp2,ch);
    end
   end
    fprintf('\nNumber of times <%s> changed to <%s>=%d\n',opat,npat,nc);
    fclose('all');
    %End of  program
    


