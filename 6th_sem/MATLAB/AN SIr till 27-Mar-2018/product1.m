%function p=product1(n) : Function to calculate p=1*2*3*....*n using recursive
%call
function p=product1(n)
if n==1
    p=1;
    return;
else
    p=n*product1(n-1);
end
end
