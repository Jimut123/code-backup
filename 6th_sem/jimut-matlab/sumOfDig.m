function sum=sumOfDig(n)
  sum=0;
  while n>0
    d=mod(n,10)
    sum=sum+d
    n=n/10
  endwhile
endfunction
