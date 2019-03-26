clc;
close all; 
clear all;
file1=input('enter the source filename: ','s');
fp1=fopen(file1, 'r');
file2=input('enter dest filename: ','s');
fp2=fopen(file2, 'w');

fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);

for i=1:n
    ch=fread(fp1,1);
    b=byte_to_bit(ch);
    for i=1:8
        fprintf('%d', b(i));
        fprintf(fp2,'%d', b(i));
    end
    fprintf('\n');
end
fclose('all');
fp1=fopen(file2, 'r+');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);

b(1)=0;
b(2)=1;
for i=1:n
    ch1=fread(fp1,1);
    ch2=fread(fp1,1);
    fseek(fp1,-1,0);
    if ch1==ch2
        fprintf(fp1, '%d', b(1));
    else
        fprintf(fp1, '%d', b(2));
    end
end

fp2=fopen('finalDest.txt','w');
for i=1:n
    fseek(fp1,-i,1);
    ch=fread(fp1,1, 'uint8');
    fprintf(fp2, '%c', ch);
end
fclose('all');
fp2=fopen('finalDest.txt','r');
fseek(fp2,0,1);
n=ftell(fp2);
fseek(fp2, 0,-1);
for i=1:n-1
    ch1=fread(fp1,1,'uint8');
    ch2=fread(fp2,1,'uint8');
    if(ch1=='0'&ch2=='0')
        fprintf('%c','A');
    elseif(ch1=='0'&ch2=='1')
        fprintf('%c','T');
    elseif(ch1=='1'&ch2=='0')
        fprintf('%c','C');
    elseif(ch1=='1'&ch2=='1')
        fprintf('%c','G');
    end
end
fclose('all');

        
    
