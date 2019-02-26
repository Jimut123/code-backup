%function [p]=product(n) : Function to calculate p=1*2*....*n using recursive
%call
function [p]=product(n)
    if n==1
        p=1;
    else
        p=n*product(n-1);
    end
end