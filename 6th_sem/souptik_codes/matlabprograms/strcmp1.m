function s = strcmp1(a,b)
flag=0;
for i=1:length(a)
  if a(i)~=b(i)
    if a(i)>b(i)
      flag=1;
      break;
    else
      flag=-1;
      break;
    endif
  else
    continue;
  endif
end
s=flag;
end