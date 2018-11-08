#to display the number in the array and and its corresponding frequency
clear
echo -n "Enter the size of your list(1-20)="
read n
echo "Enter $n elements one by one----->"
i=1
	while [ $i -le $n ]
	do 
	echo -n "a[$i]="
	eval read a$i
	i=`expr $i + 1`
	done
#to calculate frequency of each element
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
			if [ $ai -eq $aj ]
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