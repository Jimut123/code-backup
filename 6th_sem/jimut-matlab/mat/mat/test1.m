
n=521;
answer=0;
while(n>0)
    k=mod(n,10);
    answer=answer+k;
    n=floor(k);
end
disp(answer);
