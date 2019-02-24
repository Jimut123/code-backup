function [largest]=largestValueArray(a,n)

largest=a(1);
for i=1:n
    if(largest<a(i))
        largest=a(i);
    end
end
