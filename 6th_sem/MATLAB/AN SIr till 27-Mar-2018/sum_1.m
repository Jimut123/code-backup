%function s=sum_1(n) : Function to calculate s=(1)+(1+2)+....(1+2+...+n)
function s=sum_1(n)
s1=0;
s2=0;
    for i=1:n
        s1=s1+i;
        s2=s2+s1;
    end
 s=s2;
end
