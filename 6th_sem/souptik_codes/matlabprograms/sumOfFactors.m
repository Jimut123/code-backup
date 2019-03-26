function sum = sumOfFactors(i)
    sum=0;
    for j=1:floor(i/2)
        if mod(i,j)==0
            sum=sum+j;
        end
    end
end

