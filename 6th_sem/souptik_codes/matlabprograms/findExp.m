function ex = findExp(x)
ex=0;
term=1;
c=1;
while(term>1e-10)
    term=1;
    for i=1:c
        term=term*x;
    end
    fact=1;
    for i=1:c
        fact=fact*i;
    end
    term=term/fact;
    ex=ex+term;
    c=c+1;
end
ex=1+ex;
end

