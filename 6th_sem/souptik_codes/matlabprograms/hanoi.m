function [n]=hanoi(p1,p2,p3,nd)
    if(nd==1)
        fprintf('\n Move Disk 1 from %s to %s',p1,p3);
    else
    hanoi(p1,p3,p2,nd-1);
    fprintf('\n Move Disk %d from %s to %s',nd,p1,p2);
    hanoi(p2,p1,p3,nd-1);
    end
end