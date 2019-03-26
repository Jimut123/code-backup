function flag=strcmpp1(a,b)
flag=0;
if length(a)>length(b)
   l=length(a);
else
   l=length(b);
end
index=find(a(1,1:length(a))~=b(1,1:length(b)),1);

if isempty(index)
    if length(a)==length(b)
        flag=0;
    elseif length(a)>length(b)
        flag=1;
    else
        flag=-1;
    end
else
    if a(index)>b(index)
        flag=1;
    elseif a(index)<b(index)
        flag=-1;
    else
        flag=0;
    end
end
end

        