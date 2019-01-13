%function sd=stndard_deviation(a,n) : Function to calculate standarad
%deviation
function sd=standard_deviation(a,n)

avg=average(a,n);
sd=0;
    for i=1:n
        sd=sd+(avg-a(i))^2;
    end
    sd=sqrt(sd/n);
end
