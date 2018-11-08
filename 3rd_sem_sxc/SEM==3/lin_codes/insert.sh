#Implementation of Insertion sort algorithm
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

#Insertion sort (ascending) algoritkm starts--->

i=2
while [ $i -le $n ]
do
	
	eval t=\$a$i 
	j=`expr $i - 1`
	eval aj=\$a$j
	
	while [ $j -ge 1 ] && [ $t -lt $aj ]
	do
		j1=`expr $j + 1`
		eval a$j1=$aj
		j=`expr $j - 1`
		eval aj=\$a$j
		
	done
	j1=`expr $j + 1`
	eval a$j1=$t
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
