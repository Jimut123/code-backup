function s = fact(n)
    s=1;
    while n~=0
        d = mod(n,10);
        s=s*d;
        n=fix(n/10);
    end
end
