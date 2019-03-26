clc;
close all;
clear all;
x=imread('Desert.jpg');
imshow(x);
dummy=input('press any value to continue');
[r,c,d]=size(x);

fp1=fopen('convertToBits.m','r');
fseek(fp1, 0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
pos=1;
for i=1:n
    ch=fread(fp1,1,'uint8');
    b=byte_to_bit(ch);
    for j=1:8
        secret(pos)=b(j);
    end
    pos=pos+1;
end
fprintf('Secret is %d', secret);
pos=1;
flag=1;
for i=50:r
    for j=50:c
        fprintf('\nValue read: %d',x(i,j,1));
        b=byte_to_bit(x(i,j,1));
        fprintf('\nTo bits\n');
        for ii=1:8
            fprintf('%d',b(ii));
        end
        fprintf('\nAfter change\n');
        
        b(8)=secret(pos);
        pos=pos+1;
        if(pos==length(secret))
            flag=0;
            break;
        end
        
        
        for ii=1:8
            fprintf('%d',b(ii));
        end
        
        
        %Convert back to bits
        k=0; s=0;
        for jj=8:-1:1
            s=s+b(jj)*2^k;
            k=k+1;
        end
        x(i,j,1)=s;
    end
    if(flag==0) break;
    end
end
imshow(x);