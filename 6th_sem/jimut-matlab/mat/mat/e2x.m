function [ex]=e2x(x,n)
    ex=0;
    for i=0:n
        ex=ex+(x^i)/factorial(i);
    end
end