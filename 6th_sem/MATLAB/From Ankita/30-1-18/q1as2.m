clc;
close all;
clear all;
n=input('\nEnter size of your matrix(1-10)=');
for i=1:n
    fprintf('a(%d)=',i);
    a(i)=input('');
    id(i)=i;
end

[a1,id1,n1]=bubble(a,id,n);
fprintf('\nUnsorted Array\nelement\tindex\n');
for i=1:n
   fprintf('\n%d\t %d',a(i),id(i));
end
fprintf('\nsorted Array\nelement\tindex\n');
for i=1:n
   fprintf('\n%d\t %d',a1(i),id1(i));
end