%function s=sum2(n): Function to calculate s=(1^2)+(2^2)+...+(n^2)
function s=sum2(n)
    s=0;
    %s1=0;
    for i=1:n
        s1=i*i;
        s=s+s1;
    end
end
