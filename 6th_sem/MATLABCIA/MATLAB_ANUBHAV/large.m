%function big=large(a,n):Function to calculate largest value
function big=large(a,n)
big=a(1);
for i=2:n
    if a(i)>big
        big=a(i);
    end
end
end