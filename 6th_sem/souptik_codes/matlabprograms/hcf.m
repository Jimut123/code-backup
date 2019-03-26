clc;
close all;
clear all;
n1=input('Enter 1st num: ');
n2=input('Enter 2nd num: ');
hcf1=findHcf(n1,n2);
fprintf('\n HCF of first 2 numbers : %d',hcf1)

while(1)
    num=input('\n Enter -1 for end or other number for hcf: ');
    if num == -1
        break;
    else
        hcf1=findHcf(hcf1,num);
    end
end

fprintf('Final HCF = %d',hcf1);
