# q4 : calculate exp(x)  using taylor series use subroutine expx(x) 

	system("clear");

		for($i=.1;$i<=1.0;$i=$i+.1)
		{
			$y=&expx($i);
			printf("exp(%5.1f)=%8.5f\n",$i,$y);
		}
	#end of program

	sub expx{
	local($x)=@_;
	$ce=1;
	$pe=0;
	$eps=$ce-$pe;
	$fact=1;
	$px=1;
	$n=1;
		while($eps > 1e-8)
		{
			$pe=$ce;
			$fact=$fact*$n;
			$px=$px*$x;
			$ce=$ce+$px/$fact;
			$eps=$ce-$pe;
			$n=$n+1;
		}
	return $ce;
	}

