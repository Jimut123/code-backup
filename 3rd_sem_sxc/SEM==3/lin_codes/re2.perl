#write a program to input any name as follws:"FELIX RAMOND ANTHONY DESOUZA".print the modified name as follows:"DESOUZA, FELIX RAYMOND ANTHONY".
system("clear");
printf("\n ENTER THE NAME:");
chop($nam=<STDIN>);
$n=length($nam);
#To calculate position of last blank in $nam
	for($i=0;$i<$n;$i++){
	$ch=substr($nam,$i,1);
		if($ch eq " "){
		$blank=$i;
		}		
	}
$f_name=substr($nam,0,$blank);
$l_name=substr($nam,$blank,$n-$blank);
printf("MODIFIED NAME = %s, %s\n",$l_name,$f_name);
#end of program
