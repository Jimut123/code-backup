%function [f]=fib(n):Function to calculate n-th member of a fibonacci
%series. Use recursive call
function [f]=fib(n)
if n<=2
    f=1;
    return;
else
    f=fib(n-1)+fib(n-2);
end
end