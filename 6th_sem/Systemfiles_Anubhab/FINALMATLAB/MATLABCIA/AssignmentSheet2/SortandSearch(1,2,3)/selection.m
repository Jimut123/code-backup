clc %clear command window
clear; %clear all variables in workspace
A = input('Enter numbers between [ ] separated by comma, i.e. [1,2,3,4]: ');
n = length(A);
for i=1:n-1
[x index] = min(A(i:n)); 
minIndex = index + i-1; 
temp = A(i);
A(i) = A(minIndex);
A(minIndex) = temp;
end;
disp(A);