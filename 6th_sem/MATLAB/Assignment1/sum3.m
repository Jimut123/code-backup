%function [s] = sum2(n): Function to calculate 
% s = n + (n - 2) + ... upto 1 or 2 (denpending on odd or even)
function s = sum3(n)
s = 0;
    for i = n : -2 : 1
            s=s+i;
    end
end
