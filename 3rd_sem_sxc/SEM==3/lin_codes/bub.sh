#Input numbers from the user into the array.
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

echo "The entered array is--->"
echo "Number  Index"
i=1
while [ $i -le $n ]
do
	eval echo -n "\$a$i"
	echo -n "         "
	eval echo "\$id$i"
	i=`expr $i + 1`
done

#BUBBLE SORT ALGORITHM (ascending order)

i=1
flag=1
while [ $i -lt $n ] && [ $flag -eq 1 ] 
do
	flag=0
	pass=0
	j=1
	n1=`expr $n - $i`
	while [ $j -le $n1 ]
	do
		j1=`expr $j + 1`
		eval aj1=\$a$j1
		eval aj=\$a$j
		if [ $aj -gt $aj1 ]
			then
			eval a$j1=$aj
			eval a$j=$aj1
			flag=1
		fi
		j=`expr $j + 1`
	done
	i=`expr $i + 1`
done

echo "The sorted array is--->"
echo "Number  Index"
i=1
while [ $i -le $n ]
do
	eval echo -n "\$a$i"
	echo -n "         "
	eval echo "\$id$i"
	i=`expr $i + 1`
done