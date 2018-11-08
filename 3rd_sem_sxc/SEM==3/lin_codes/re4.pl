#write a program to calculate and print (i)number of vowels,(ii)Number of consonants(iii)Number of sentences
system("clear");
printf("Enter the Sentence : ");
chop($sen=<STDIN>);
$l=length($sen);
$v=0;
$noa=0;
for($i=0;$i<$l;$i++)
{
$ch=uc(substr($sen,$i,1));
if($ch eq "A" || $ch eq "E" || $ch eq "I" || $ch eq "O" || $ch eq "U")
{
$v=$v+1;
}
}
for($i=0;$i<$l;$i++)
{
$ch=uc(substr($sen,$i,1));
if($ch ge "A" && $ch le "Z")
{
$noa=$noa+1;
}
}
printf("\nConsonants-->%d",$noa-$v);
printf("\nVowels-->%d",$v);
printf("\nSpaces-->%d\n",$l-$noa);
#end
#Extend it for a file-------
