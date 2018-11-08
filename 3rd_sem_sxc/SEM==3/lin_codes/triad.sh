#This program will print all the three digit triads
clear
ii=123
while [ $ii -le 329 ]
do
	t1=$ii
	t2=`expr $t1 \* 2`
	t3=`expr $t1 \* 3`
	#now that we have got t1 t2 t3 we need to extract their digits to check their uniqness
	i=1
	while [ $t1 -ne 0 ]
	do
		eval a$i=`expr $t1 % 10`
		t1=`expr $t1 / 10`
		i=`expr $i + 1`
	done
	while  [ $t2 -ne 0 ]
	do
		eval a$i=`expr $t2 % 10`
		t2=`expr $t2 / 10`
		i=`expr $i + 1`
	done
	while [ $t3 -ne 0 ]
	do
		eval a$i=`expr $t3 % 10`
		t3=`expr $t3 / 10`
		i=`expr $i + 1`
	done
	flag=1
	#1 means the triad is found
	#now we need to check the uniquness
	i=1
	while [ $i -le 9 ]
	do
		eval ai=\$a$i
		if [ $ai -eq 0 ]
			then
			flag=0
			break
		fi
		j=1
		while [ $j -le 9 ]
		do
			eval aj=\$a$j
			if [ $i -ne $j ]
				then
				if [ $aj -eq $ai ]
					then
					flag=0
					break
				fi
			fi
			j=`expr $j + 1`
		done
		if [ $flag -eq 0 ]
			then 
			break
		fi
		i=`expr $i + 1`
	done
	if [ $flag -eq 1 ]
		then
		n1=$ii
		n2=`expr $n1 \* 2`
		n3=`expr $n1 \* 3`
		echo "Triad :($n1,$n2,$n3)"
	fi
	ii=`expr $ii + 1`
done
#Finally the program ends for God's sakes T_T




