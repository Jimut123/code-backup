%function [s] = sum1(n): Function to calculate s = 1 + (1+2) +
%(1+2+3)+...+(1+2+...+n)

function s = sum1(n)
s1 = 0;
s = 0;
    for i = 1 : n
        s1=s1+i;
        s=s+s1;
    end
end
