%to sort words
clc;
close all;
clear all;
n=input('Enter no of words:');
for i=1:n
  wd(i,:)=input('Enter strings one by one:','s');
endfor
wd
for i=1:n-1
  for j=1:n-i
    if strcmp1(wd(j,:),wd(j+1,:))==1
      tmp=wd(j,:);
      wd(j,:)=wd(j+1,:);
      wd(j+1,:)=tmp;
    endif    
  endfor
endfor
fprintf('\nAfter Sort:\n');
wd
