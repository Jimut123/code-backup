%function display_output(a,id,n):Function to display output
function display_output(a,id,n)
fprintf('\nNumber\tIndex\n');
for i=1:n
    fprintf('%d\t\t%d\n',a(i),id(i));
end
ch=input('\nPress Enter key to continue--->','s');

clc;
end