function chp = checkPrime(i)
    chp=1;
    for j=2:i/2
        if mod(i,j)==0
            chp=0;
            break;
        end
    end
end

