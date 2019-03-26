clc;
close all;
clear all;
n=input('\n Enter n: ');
ch=input('Enter 1:For Prime 2:Non Prime');

switch ch
    case 1
        for i=2:n
            chp=checkPrime(i);
            if chp==1
                fprintf(' %d\n',i);
            end
        end
    case 2
        for i=1:n
            chp=checkPrime(i);
            if chp==0
                fprintf('%d\n',i);
            end
        end
end
