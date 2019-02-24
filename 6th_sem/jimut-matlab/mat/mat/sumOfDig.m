function [sum]=sumOfDig(n)
    sum=0;
    while(n>0)
        k=mod(n,10);
        sum=sum+k;
        n=round(n/10);
    end
end