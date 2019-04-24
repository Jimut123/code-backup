%function s=sum4(n) : Function to calculate s=1*2*3*4*...*n
function s=sum4(n)
s=1;
  for i=1:n
    s=s*i;
  end
end