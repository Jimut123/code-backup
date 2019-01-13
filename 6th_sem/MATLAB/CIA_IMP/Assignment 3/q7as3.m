clc;
close all;
clear all;
format long;
n=input('\n Enter number of intervals\n');
a=input('\n Enter lower limit of integral\n');
b=input('\n Enter upper limit of integral\n');
it=sump1(a,b,n);
fprintf('\n The value of integral is: %13.1f\n',it);


    
        

