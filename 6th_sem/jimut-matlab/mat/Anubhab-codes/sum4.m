%function s=sum4(n) : Function to calculate s=(1)+(1+2)+...+(1+2+...+n)
function s=sum4(n)
s=1;
  for i=1:n
    s=s*i;
  end
end
