clc;
clear all;
close all;
%this is comment 1 
file1=input('Enter file name','s');
file2=input('Enter output file name','s');
fp1=fopen(file1,'r+');
fp2=fopen(file2,'w+');
nc=0;
while ~feof(fp1)
    ch=fread(fp1,1,'uint8=>char');
    if ch==''''
        while (1)
            fwrite(fp2,ch);
            ch=fread(fp1,1);
            if ch==''''
                break;%this is comment 2
            end
        end
        fwrite(fp2,ch);
    elseif ch=='%'
        ch=fread(fp1,1);
        while ch~=10
            ch=fread(fp1,1);
        end
        fwrite(fp2,13);
        fwrite(fp2,10);
        nc=nc+1;
    else
        fwrite(fp2,ch);
    end
end%this is comment 3
fclose('all');
fprintf('No. of comments is : %d',nc);