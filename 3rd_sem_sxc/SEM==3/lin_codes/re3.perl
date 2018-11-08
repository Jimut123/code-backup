#Write a program in perl to input any any sentence or word and display a message "Palindrome" or not palindrome.
system("clear");
printf("Enter the sentence/word : ");
chop($sen=<STDIN>);
$n=length($sen);
$m=$n-1;
$c=1;
for($i=0;$i<$n;$i++){
$ch=uc(substr($sen,$i,1));
$ch1=uc(substr($sen,$m,1));
if($ch eq $ch1){
$c=1;
}
else{
printf("Not palindrome\n");
$c=0;
last if($c==0);
}
$m=$m-1;
}
if($c eq 1){
printf("Palindrome\n");
}
#end
