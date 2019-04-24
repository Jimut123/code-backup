%function s=sum_recursive(n):Function to calculate sum of 'n' elements
%using recursive call
function s=sum_recursive(n)
if n==1
    s=1;
else
    s=n+sum_recursive(n-1);
end
end