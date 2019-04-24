%function [x,ix,n]=function bubble_sort(a,id,n):Function to sort data using
%bubble sort method
function [x,ix,n]=bubble_sort(a,id,n)
for i=1:n
    x(i)=a(i);
    ix(i)=id(i);
end
flag=0;
pass=0;
m=n;
while flag==0
    flag=1;
    pass=pass+1;
    m=m-1;
    for i=1:m
        if a(i)>a(i+1)
            t=a(i);
            a(i)=a(i+1);
            a(i+1)=t;
            t=id(i);
            id(i)=id(i+1);
            id(i+1)=t;
            flag=0;
        end
        fprintf('\nPass=%d step=%d flag=%d\n',pass,i,flag);
        display_output(a,id,n);
    end
end
for i=1:n
    x(i)=a(i);
    ix(i)=id(i);
end
end