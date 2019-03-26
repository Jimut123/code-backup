clc;
close all;
clear all;
n=input('enter the value of n: ');
for i=1:n
    roll(i)=input('enter roll number: ');
    marks(i)=input('enter marks: ');
end
fprintf('\nINPUT\n');
for i=1:n
    fprintf('%d\t%d\n', roll(i), marks(i));
end
%Sorting
for i=1:n
    for j=1:n-i
        if(marks(j)<marks(j+1))
            t=marks(j);
            marks(j)=marks(j+1);
            marks(j+1)=t;
            t=roll(j);
            roll(j)=roll(j+1);
            roll(j+1)=t;
        end
    end
end
%Output
fprintf('\nSORTED OUTPUT\n');
for i=1:n
    fprintf('%d\t%d\n', roll(i), marks(i));
end
c1=0;
c2=0;
c3=0;
c4=0;
c5=0;
for i=1:n
    if(marks(i)>=70)
        c1=c1+1;
    elseif(marks(i)>=60)
        c2=c2+1;
    elseif(marks(i)>=50)
        c3=c3+1;
    elseif(marks(i)>=40)
        c4=c4+1;
    else
        c5=c5+1;
    end
end
fprintf('%d students got marks >=70\n',c1);
fprintf('%d students got marks >=60 < 70\n',c2);
fprintf('%d students got marks >=50 < 60\n',c3);
fprintf('%d students got marks >=40 < 50\n',c4);
fprintf('%d students got marks < 40\n',c5);

