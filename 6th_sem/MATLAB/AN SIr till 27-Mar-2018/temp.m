%function binary_search(a,id,n,num) : Function to search a number
%using binary search method
function binary_search(a,id,n,num)
count=0;
[a,id,n]=bubble(a,id,n);
fprintf('Number\tIndex\n');
for i=1:n
    fprintf('%d\t\t%d\n',a(i),id(i));
end
low=1;
high=n;
count=0;
while low<=high
    mid=fix((low+high)/2);
    if num<a(mid)
        high=mid-1;
    elseif num>a(mid)
        low=mid+1;
    else
        fprintf('%d found at position=%d\n',num,id(mid));
        count=1;
        break;
    end
end

if count ==0
 fprintf('%d not found in your list\n',num);
end
end
