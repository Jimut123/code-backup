# Write a program to compute sin(x), cos(x) and tan(x)

system("clear");
	for($i=0;$i<360;$i+=5)
	{
		$y1=&sine($i);
		printf("sin(%5.1f)=%8.5f\n",$i,$y1);
		if(($i+1)%15==0)
		{
			printf("\n Press <Enter key> -->");
			$choice=<STDIN>;
			system("clear");
		}
	}
#End of main program

	sub sine
	{
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
				for($j=1;$j<=$n;$j++)
				{
					$fact=$fact*$j;
					$px=$px*$xrad;
				}
			$csin=$csin+$sf*$px/$fact;
			$eps=$csin-$psin;
				if($eps<0)
				{
					$eps=-$eps;
				}
			$sf=-$sf;
			$n=$n+2;
	}			
return $csin;
}		

		
