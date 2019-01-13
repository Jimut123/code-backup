%antest1.m : Write a program to calculate s=(1)=(1+2)+....+(1+2+3+....+n)
clc;
close all;
clear all;
n=input('\nEnter n(1-10)=');
s1=0;
s2=0;
    for i=1:n
        s1=s1+i;
        s2=s2+s1;
    end
    fprintf('Sum of %d numbers=%d\n',n,s2);
    %end of program
    