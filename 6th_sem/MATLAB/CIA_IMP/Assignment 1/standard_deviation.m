%function y=standard_deviation(a,n) : Function to calculate standard
%deviation
function y=standard_deviation(a,n)
s=0;
avg=average_array(a,n);
for i=1:n
    s=s+(a(i)-avg)^2;
end
sd=sqrt(s/n);
y=sd;
end