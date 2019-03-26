%to remove comments from a matlab file
clc;
close all;
clear all;
file1=input('Enter the i/p file name:','s');
file2=input('Enter the o/p file name:','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
n=ftell(fp1);
fseek(fp1,0,-1);
while~feof(fp1)
   ch=fread(fp1,1,'uint8=>char');
   if ch==''''
        while(1)
            fwrite(fp2,ch);
            ch=fread(fp1,1,'uint8=>char');
            if ch==''''
                break;
            end
        end
        fwrite(fp2,ch);
   elseif ch=='%'
        while(1)
            ch=fread(fp1,1);
            if ch==13
                break;
            end
        end
        fwrite(fp2,13);
        fwrite(fp2,10);
   else 
        fwrite(fp2,ch);
    end %reeeeeemmmmmcommmmm
end