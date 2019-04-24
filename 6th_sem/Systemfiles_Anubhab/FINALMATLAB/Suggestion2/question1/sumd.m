function s = sumd(n)
    s=0;
    while n~=0
        d = mod(n,10);
        s=s+d;
        n=fix(n/10);
    end
    
end