clc;
close all;
clear all;
n=input('\nEnter size of your list(1-20) = ');
fprintf('\nEnter %d elements one by one--->\n',n);
for i=1:n
    fprintf('a(%d) = ',i);
    a(i)=input('');
    id(i)=i;
end
fprintf('\nUnsorted List\n');
display_output(a,id,n);
[a,id,n]=bubble_sort(a,id,n);
fprintf('\nSorted List\n');
display_output(a,id,n);
%end of main program