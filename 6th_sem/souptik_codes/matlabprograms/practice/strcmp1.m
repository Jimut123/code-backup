function s = strcmp1(a,b)
s=0;
for i=1:length(a)
  if a(i)~=b(i)
    if a(i)>b(i)
      s=1;
      break;
    else
      s=-1;
      break;
    end
  else
    continue;
  end
end
end