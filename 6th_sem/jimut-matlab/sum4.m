function s=sum4(n)
  s=0;
  for i=1:n
    if (oddoreven(i) == 1)    %odd
      s=s+i;
    else
      s=s-i;
    endif
  endfor
endfunction
