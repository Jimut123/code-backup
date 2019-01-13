function flag=is_prime(n)
n1=fix(n/2);
flag=1;
    for i=2:n1
        r=mod(n,i);
        if r==0
            flag=0;
            break;
        end
    end
end