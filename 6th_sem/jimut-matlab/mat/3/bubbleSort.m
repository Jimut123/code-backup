function[]=bubbleSort(a,id,n)
i=1;
j=1;
t=0;
%for i=1:n
 %   a(i)=input('Enter the words: ', 's');
%end
for i=1:n
    for j=i+1:n
        if a(i,:)>a(j,:)
            temp=a(i,:);
            a(i,:)=a(j,:);
            a(j,:)=temp;
        end
    end
end
for i=1:n
    x(i)=a(i);
    xid(i)=id(i);
end
xn=n;
for i=1:n
    fprintf('\nSorted value is: %s',a(i,:));
end
end
