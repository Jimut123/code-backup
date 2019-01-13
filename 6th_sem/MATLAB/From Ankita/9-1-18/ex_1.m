%ex_1.m":write a program to uinput total(0-100)
%Calculate and print grade
clc;
clear all;
close all;
total=input('\nEnter total(0-100)=');
%to calculate grade
    if total>=70
        grade='A';
    elseif total>=60
        grade='B';
    elseif total>=50
        grade='C';
    elseif total>=40
        grade='D';
    else
        grade='F';
    end
fprintf('Total=%d Grade=%c\n',total,grade);
%End of program