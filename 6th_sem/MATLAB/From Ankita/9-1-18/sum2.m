%function[s]=sum1(n); function to calculate s=1^2+2^2+3^2+......+n^2
function s=sum2(n)
s=0;
    for i=1:n
        s=s+i^2;
    end
end