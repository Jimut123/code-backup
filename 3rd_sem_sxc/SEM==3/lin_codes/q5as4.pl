#calculate sin(x),cos(x),tan(x) using taylor's expansion----->
system("clear");
$count=0;
	for($i=0;$i<=360;$i=$i+5){
	$y1=&sine($i);
	$y2=&cosine($i);
	$y3=$y1/$y2;
	$y4=$y2/$y1;
	$count++;
	printf("sin(%5.1f)=%8.5f cos(%5.1f)=%8.5f tan(%5.1f)=%8.5f cot(%5.1f)=%8.5f\n",$i,$y1,$i,$y2,$i,$y3,$i,$y4);
		if($count%15==0){
		printf("\nPress <Enter key>--->");
		$choice=<STDIN>;
		system("clear");
		}
	}
#end of main program

sub sine{
local($x)=@_;
$xrad=$x*3.141593/180;
$csin=$xrad;
$psin=1;
$eps=$csin-$psin;
	if($eps<0){
	$eps=-$eps;
	}
$sf=-1;
$n=3;
	while($eps>1e-08){
	$psin=$csin;
	$fact=1;
	$px=1;
		for($j=1;$j<=$n;$j++){
		$fact=$fact*$j;
		$px=$px*$xrad;
		}
	$csin=$csin+$sf*$px/$fact;
	$eps=$csin-$psin;
		if($eps<0){
		$eps=-$eps;
		}
	$sf=-$sf;
	$n=$n+2;
	}
return $csin;
}

sub cosine{
local($x)=@_;
$xrad=$x*3.141593/180;
$csin=1;
$psin=0;
$eps=$csin-$psin;
	if($eps<0){
	$eps=-$eps;
	}
$sf=-1;
$n=2;
	while($eps>1e-08){
	$psin=$csin;
	$fact=1;
	$px=1;
		for($j=1;$j<=$n;$j++){
		$fact=$fact*$j;
		$px=$px*$xrad;
		}
	$csin=$csin+$sf*$px/$fact;
	$eps=$csin-$psin;
		if($eps<0){
		$eps=-$eps;
		}
	$sf=-$sf;
	$n=$n+2;
	}
return $csin;
}

#End of program
		




