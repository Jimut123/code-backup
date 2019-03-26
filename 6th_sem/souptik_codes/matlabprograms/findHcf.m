function hcf = findHcf(n1,n2)
hcf=1;
while(n1~=n2)
    if n1>n2
        n1=n1-n2;
    else
        n2=n2-n1;
    end
    hcf=n1;
end

