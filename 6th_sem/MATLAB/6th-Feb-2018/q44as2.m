%q44as2.m : Write main program to implement towers of hanoi problem
clc;
close all;
clear all;
p1=1;
p2=2;
p3=3;
global n;
ch='y';
while ch=='y' | ch=='Y'
nd=input('\nEnter number of disks(1-10)=');
n=0;
hanoi(p1,p2,p3,nd);
fprintf('\nTotal number of movements done to transfer %d disks=%d\n',nd,n);
ch=input('\nDo you wantto continue(Y/N?) :','s');
end
%End of main program
