function [t]=checkPerfect(n)
    s=0;
    for i=1:(n-1)
        if(mod(n,i)==0)
            s=s+i;
        end
    end
    if n==s
        t=1;
    else
        t=0;
    end
end