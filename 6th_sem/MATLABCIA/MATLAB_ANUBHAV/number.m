clc;
clear;
element = zeros (1,50);
ctr=1;
i=1;
y=1;
freq=1;
    num = input('Please state how many numbers you want to input: ');
    while (ctr <= num) %input number in array
     element (ctr) = input( 'Enter number: ');
     ctr = ctr+1;
    end
    for ctr=1:1:num  %to arrange number in descending
     for  i=1:1:num
            if element (i) < element (i+1) 
                     temp = element(i);
                     element (i) = element (i+1);
                     element (i+1) = temp; 
             end
     end
    end
disp('N Count');
while (y<=num) %counting frequency of number
k = element(y);
freq=1;
    if k == element (y+1) 
             for x = y:num
                    if k == element (x+1) 
                     freq = freq+1;
                    end
             end
             fprintf('%d\t%d\n',k, freq);
    else
        fprintf('%d\t%d\n',k, freq);
    end
    y=y+freq;
end