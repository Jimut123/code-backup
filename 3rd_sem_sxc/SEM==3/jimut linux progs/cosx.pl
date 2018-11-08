system("clear");
$count=0;
        for($i=0;$i<=360;$i=$i+5)
        {
        $y1=&cos($i);
        $count++;
        printf("cos(%5.1f)=%8.5f\n",$i,$y1);
        if($count%15==0)
        {
        printf("\n Press <Enter Key--->");
        $choice=<STDIN>;
        system("clear");
        }
        }
#end of program
sub cos{
local($x)=@_;
$xrad=$x*3.141593/180;
$ccos=1;
$pcos=0;
$eps=$ccos-$pcos;
        if($eps<0){
        $eps=-$eps;
        }
$sf=-1;
$n=2;
        while($eps > 1e-08){
        $pcos=$ccos;
        $fact=1;
        $px=1;
        for($j=1;$j<=$n;$j++)
        {
        $fact=$fact*$j;
        $px=$px*$xrad;
        }
        $ccos=$ccos+$sf*$px/$fact;
        $eps=$ccos-$pcos;
        if($eps<0){
        $eps=-$eps;
        }
        $sf=-$sf;
        $n=$n+2;
}
return $ccos;
}

