function avgElem=avgArray(a,n)
    avgElem=0;
    for i=1:n
        avgElem=avgElem+a(i);
    end
    avgElem=avgElem/n;
end
