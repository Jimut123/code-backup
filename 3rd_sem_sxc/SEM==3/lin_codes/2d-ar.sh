clear
echo -n "Enter the value of n(1-10) size of matrix"
read n
echo "enter elements of first matrix"
i=1
while [ $i -le $n ]
do 
j=1
while [ $j -le $n ]
do
echo -n "a[$i][$j]="
eval read a$i$j
j=`expr $j + 1`
done
i=`expr $i + 1`
done
echo "enter elements of second matrix"
i=1
while [ $i -le $n ]
do 
j=1
while [ $j -le $n ]
do
echo -n "b[$i][$j]="
eval read b$i$j
j=`expr $j + 1`
done
i=`expr $i + 1`
done
#To calculate product of 2 matrices
i=1
while [ $i -le $n ]
do 
j=1
while [ $j -le $n ]
do
s=0
k=1
while [ $k -le $n ]
do 
eval aik=\$a$i$k
eval bkj=\$b$i$j
s=`expr $s + $aik \* $bkj`
k=`expr $k + 1`
done
eval c$i$j=$s
j=`expr $j + 1`
done
i=`expr $i + 1`
done
#to display the product matrix
i=1
while [ $i -le $n ]
do 
j=1
while [ $j -le $n ]
do
eval echo -n "\$c$i$j"
echo -n " "
j=`expr $j + 1`
done
echo 
i=`expr $i + 1`
done
#end of program
