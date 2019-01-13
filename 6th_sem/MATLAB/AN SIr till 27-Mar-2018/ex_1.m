%ex_1.m: Write a program to input total(0-100).
%Calculate and print grade.
clc;
clear all;
close all;
total=input('\nEnter Total(0-100)=');
% To calculate grade
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
    disp(grade);
    
 %fprintf('Total=%d Grade=%c\n',total,grade);
 %End of program
 