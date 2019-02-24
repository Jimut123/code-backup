%function s=sum3(n) : Function to calculate s=(1)+(1+2)+...+(1+2+...+n)
function s=sum3(n)
s=0;
  while n>=0
    s=s+n;
    n=n-2;
  end
end
