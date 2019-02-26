%function frequency_of_number(a,n) : Function to calculate frequency of 'n'
%numbers in 1-dimensional array.
function frequency_of_number(a,n)
% To calculate frequency of each element
    for i=1:n
        f(i)=0;
        for j=1:n
            if a(i)==a(j)
                f(i)=f(i)+1;
            end
        end
    end
    % To dispplay frequency of disnctict numbers
    fprintf('Number\tFrequency\n');
    fprintf('%d\t\t%d\n',a(1),f(1));
        for i=2:n
            flag=1;
            for j=1:i-1
                if a(i)==a(j)
                    flag=0;
                    break;
                end
            end
            if flag==1
                fprintf('%d\t\t%d\n',a(i),f(i));
            end
        end
end