function y=prod1_rec(n)
    if n==1
        y=1;
        return;
    else
        y=n*prod1_rec(n-1);
    end
end