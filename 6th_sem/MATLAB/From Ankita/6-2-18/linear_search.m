function linear_search(a,id,n,num)
count=0;
for i=1:n
    if num==a(i)
        fprintf('%d found at position=%d\n',a(i),id(i));
        count=count+1;
    end
end
if count~=0
    fprintf('\nNumber of times %d found in your list=%d\n',num,count);
else
    fprintf('\n%d not found in the list.',num);
end
end
