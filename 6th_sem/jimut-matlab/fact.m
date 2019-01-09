%function f=fact(n): Function to calculate f=1*2*3*...*n
function f=fact(n)
  f=1;
  for i=1:n
    f=f*i;
  endfor
endfunction
