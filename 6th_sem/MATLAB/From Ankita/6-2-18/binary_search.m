function binary_search(a,id,n,num)
count=0;
hi=n;
low=1;
mid=fix((hi+low)/2);
    while(hi>low && count==0)
       if num<a(mid) 
           hi=mid-1;
       else
           if num>a(mid)
               low=mid+1;
           else
               fprintf('\n%d found at position %d',num,id(mid));
               count=count+1;
               i=mid-1;
               while(i>=1)
                   if a(i)==num
                       fprintf('\n%d found at position %d',num,id(i));
                       count=count+1;
                       i=i-1;
                       if i==0
                           break
                       end
                   else
                       break
                   end
               end
               i=mid+1;
               while(i<=n)
                   if a(i)==num
                       fprintf('\n%d found at position %d',num,id(i));
                       count=count+1;
                       i=i+1;
                       if i==n
                           break
                       end
                   else
                       break
                   end
               end
           end
       end
    end
    if count~=0
        fprintf('\nNumber of times %d found in your list=%d\n',num,count);
    else
        fprintf('\n%d not found in the list.',num);
    end
end
