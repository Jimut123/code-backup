%function y=large(a,n) : Function to get largest value in 1-dim array a()
function y=large(a,n)
big=a(1);
for i=2:n
    if a(i)>big
        big=a(i);
    end
end
y=big;
end
