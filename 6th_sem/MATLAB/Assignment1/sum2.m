%function [s] = sum2(n): Function to calculate s = 1^2 + (1^2+2^2) +
%(1^2+2^2+3^2)+...+(1^2+2^2+...+n^2)

function s = sum2(n)
s2 = 0;
s = 0;
    for i = 1 : n
        s2=s2+i^2;
        s=s+s2;
    end
end
