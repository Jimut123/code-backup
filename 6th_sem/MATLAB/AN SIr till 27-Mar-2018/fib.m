%function [f]=fib(n) : Function to generate n-th member of a fibonnaci
%series
function [f]=fib(n)
    if n<=2
        f=1;
    else
        f=fib(n-1)+fib(n-2);
    end
end
