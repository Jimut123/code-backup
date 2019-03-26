clc;
clear all;
close all;

n=input('\nEnter number of employees');

for i=1:n
    code(i)=input('\nEnter Employee Code :');
    salary(i)=input('\n Enter Employee Salary:');
end
%code
%salary

for i=2:n
    t1=code(i)
    t=salary(i);
    j=i-1;
    while (j>=1 && salary(j)<t)
        code(j+1)=code(j);
        salary(j+1)=salary(j);
        j=j-1;
    end
    code(j+1)=t1;
    salary(j+1)=t;
end
fprintf('\nAfter Sorting Salaries :\n')
fprintf('\nHighest Salary is :Code is %d Salary is %d',code(1),salary(1));
fprintf('\n2nd Highest Salary is :Code is %d Salary is %d',code(2),salary(2));
fprintf('\nLowest Salary is : Code is %d Salary is %d',code(n),salary(n));
%code
%salary
fprintf('Code    Salary');
for i=1:n
    fprintf('\n %d    %d',code(i),salary(i));
end 