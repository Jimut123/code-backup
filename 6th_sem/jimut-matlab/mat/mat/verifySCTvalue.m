%to verify all the values of sine cos tan in interval of 5
val = 0;

for i=1:72
    format short e;
    %fprintf("%d,%d,* %d,%d,%d,* %d,%d,%d,* %d \n",sin(val),sinex(val),(sin(val)-sinex(val)),cos(val),cosx(val),(cos(val)-cosx(val)),tan(val),tanx(val),(tan(val)-tanx(val)));
    fprintf('%d, %d, %d \n',sinex(val),cosx(val),tanx(val))
    val = val+5;
end