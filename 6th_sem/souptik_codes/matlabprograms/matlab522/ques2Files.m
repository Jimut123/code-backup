clc;
close all;
clear all;
file1=input('enter name of source file: ','s');
fp1=fopen(file1, 'r');
fp2=fopen('destFile.txt', 'w');
wordCount=0;
vowels=0;
cons=0;
c=0;
while(~feof(fp1))
    ch=fread(fp1,1,'uint8=>char');
    if((ch>=65 & ch<= 90) | (ch>=97 & ch<= 122))
        c=1;
        fwrite(fp2, ch);
        if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u'|ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U')
            vowels=vowels+1;
        else
            cons=cons+1;
        end
        
            
    elseif(c==1 & ch=='-')
        ch=fread(fp1,1,'uint8=>char');
        if((ch>=65 & ch<= 90) | (ch>=97 & ch<= 122))
            fwrite(fp2, '-');
            fwrite(fp2, ch);
        end
    elseif(c==1)
        c=0;
        fwrite(fp2, 13);
        fwrite(fp2, 10);
        wordCount=wordCount+1;
    end
end
fclose('all');
fprintf('%d words are present\n%d vowels are present\n%d consonants are present\n', wordCount, vowels, cons);
fp1=fopen(file1, 'r');
alpha=0;
for i=65:90
    fseek(fp1,0,-1);
    alpha=0;
    print=0;
    while(~feof(fp1))
       ch=fread(fp1,1,'uint8=>char');
       if(upper(ch)==i)
           alpha=alpha+1;
           print=ch;
       end
    end
    if(alpha>0)
        fprintf('%c occurs %d times\n', print, alpha);
    end
end

    

            