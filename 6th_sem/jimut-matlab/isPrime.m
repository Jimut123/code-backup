% function isPrime(n) : checks if a number is prime or not, if true then return 1, else return 0
function ret=isPrime(n)
  dummy=0;
  for i=2:n-1
    if mod(n,i) == 0
      dummy=1;
    endif
  endfor
  if dummy == 0
    ret=1;       % True, 1, for being prime
  else
    ret=0;       % False, 0, for being not prime
  endif
endfunction
