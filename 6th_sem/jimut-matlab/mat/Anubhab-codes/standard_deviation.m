%function sd=standard_deviation(a,n):Function to calculate standard
%deviation of 'n' elements in array a()
function sd=standard_deviation(a,n)
sd=0;
avg=average(a,n);
for i=1:n
    sd=sd+(a(i)-avg)^2;
end
sd=sqrt(sd/n);
end