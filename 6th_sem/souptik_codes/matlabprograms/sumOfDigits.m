function sum = sumOfDigits(n)
    sum=0;
    while n~=0
        sum=sum+mod(n,10);
        n=floor(n/10);
    end
end

