%function hanoi(nd,p1,p2,p3) : Function to implement towers of hanoi
%problem
function hanoi(nd,p1,p2,p3)
global n;
if nd==1
    n=n+1;
    fprintf('Move Disk-%d from Peg-%d to Peg-%d\n',nd,p1,p2);
    return;
end
hanoi(nd-1,p1,p3,p2);
n=n+1;
fprintf('Move Dik-%d from Peg-%d to Peg-%d\n',nd,p1,p2);
hanoi(nd-1,p3,p2,p1);
end
