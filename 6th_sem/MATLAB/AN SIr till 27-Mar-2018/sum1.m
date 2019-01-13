%function s=sum1(n) : Function to calculate sum of n-numbers
function s=sum1(n) 
    if n==1
        s=1;
        return;
    else
        s=n+sum1(n-1);
    end
end
