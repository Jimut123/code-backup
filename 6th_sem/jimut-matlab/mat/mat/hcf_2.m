function h = hcf_2(a,b)
    if(a>b)
        max=a;
        min=b;
    else
        max=b;
        min=a;
    end
    %fprintf("max = "+max+" min = "+min);
    rem=mod(max,min);
    if rem==0
        h=min;
        return;
    end
    while(rem~=0)
        rem=mod(max,min);
        max=min;
        min=rem;
    end
    %fprintf("HCF = "+max);
    h=max;
end