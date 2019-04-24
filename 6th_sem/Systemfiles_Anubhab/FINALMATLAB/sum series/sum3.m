%function s=sum3(n) : Function to calculate s=n+(n - 2)+...upto 1 or 2
%(depending on odd or even)

function s=sum3(n)
s=0;
  while n>=0
    s=s+n;
    n=n-2;
  end
end