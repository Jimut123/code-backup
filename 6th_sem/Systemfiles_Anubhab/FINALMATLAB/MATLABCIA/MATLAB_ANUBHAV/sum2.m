%function s=sum2(n) : Function to calculate s=1*1+2*2+....+n*n
function s=sum2(n)
s=0;
  for i=1:n
    s=s+i*i;
  end
end
