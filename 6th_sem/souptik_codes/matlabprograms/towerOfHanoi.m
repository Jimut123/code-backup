function []=towerOfHanoi(n,from_rod,to_rod,aux_rod)
    if (n == 1) 
           fprintf('Move disk 1 from rod %c to rod %c \n',from_rod,to_rod); 
            return;
    end
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        fprintf('Move disk %d from rod %c to rod %c \n',n,from_rod,to_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
end
  