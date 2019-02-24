function[sd]=standardDev(a,n)
sd=0;
avg=0;
num=0;
sum=0;
for i=1:n
    sum=sum+a(i);
end
avg=avg/n;
for i=1:n
    num=(a(i)-avg)*(a(i)-avg);
end
sd=sqrt(num/n);
