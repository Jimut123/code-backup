
#To calculate the frequency of each integer in a array---->
clear
echo -n "Enter the value of n--->"
read n

echo "Enter the values into the array"
i=1
while [ $i -le $n ]
do
	eval echo -n "a[$i]="
	eval read a$i
	eval id$i=$i
	i=`expr $i + 1`
	echo 
done
i=1
while [ $i -le $n ]
do
	s=0
	j=1
	eval ai=\$a$i
	while [ $j -le $n ]
	do
		eval aj=\$a$j
		if [ $ai -eq $aj ]
			then
			s=`expr $s + 1`
		fi
		j=`expr $j + 1`
	done
	eval f$i=$s
	i=`expr $i + 1`
done
clear
echo "Number Frequency"
i=1
eval echo -n "\$a$i"
echo -n "       "
eval echo "\$f$i"
i=2
while [ $i -le $n ]
do
	i1=`expr $i - 1`
	j=1
	flag=1
	eval ai=\$a$i
	while [ $j -lt $i1 ]
	do
		eval aj=\$a$j
		if [ $aj -eq $ai ]
		then
		flag=0
		break
		fi
		j=`expr $j + 1`
	done
	if [ $flag -eq 1 ]
		then
		eval echo -n "\$a$i"
		echo -n "       "
		eval echo "\$f$i"
	fi
	i=`expr $i + 1`
done

