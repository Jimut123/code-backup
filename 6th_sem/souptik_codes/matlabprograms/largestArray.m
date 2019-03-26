function largestElem=largestArray(a,n)
    largestElem=a(1);
    for i=2:n
        if largestElem<a(i)
            largestElem=a(i);
        end
    end
end