function stdElem=stdArray(a,n)
    avgElem=avgArray(a,n);
    stdElem=0;
    for i=1:n
        stdElem=stdElem+((a(i)-avgElem)*(a(i)-avgElem));
    end
    stdElem=sqrt(stdElem/n);
end
