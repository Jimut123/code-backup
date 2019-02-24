% Read the contents of a file.
% Replace some pattern by some new pattern

clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file2=input('\nEnter Output File Name=','s');
opat=input('Enter old pattern to be searched=','s');
npat=input('Enter new pattenr to be searched=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
leno=length(opat);
lenn=length(npat);
nc=0; % nc=number of times pattern replaced
while ~feof(fp1)
    ch=fread(fp1,1,'unit8=>char');
    ch1=upper(ch);
    if ch1==upper(opat(1))
        flag=1;
        for i=1:leno-1
            j=i+1;
            ch=fread(fp1,1,'unit=>char');
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
            for i1=1:j
                ch=fread(fp1,1,'unit8=>char');
                fwrite(fp2,ch);
            end
        end
    else
        fwrite(fp2,ch);
    end
end
fclose('all');    
fprint('\nNumber of times <%s> replaced by <%s> = %d\n', opat, npat, nc);
    %end of program
            


