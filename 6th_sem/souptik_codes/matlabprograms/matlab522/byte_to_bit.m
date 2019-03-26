function[b]=byte_to_bit(c)
n=uint8(c);%To convert character c to integer/ascii code
k=0;
for i=8:-1:1
    k=k+1;
    b(k)=bitget(n,i);
end

end

