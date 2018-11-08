import java.io.*;
class analyse2
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int l,v,c,n,s,sp,cp,lw,pa,tv,tc,tn,ts,tsp,tcp,tlw,tpa,i,tl;
String s1,w;
char ch;
analyse2()throws IOException
{
System.out.println("Give a String:");
s1=br.readLine();
l=v=c=n=s=sp=cp=lw=pa=tv=tc=tn=ts=tsp=tcp=tlw=tpa=tl=0;
w="";
}
void check()
{
for(i=0;i<s1.length();i++)
{
if(s1.charAt(i)==' ')
{
sp++;
vowel(w);
conso(w);
numb(w);
length(w);
caps(w);
//space++;
lower(w);
palin(w);
w="";
tsp=tsp+sp;
}
else
w=w+s1.charAt(i);
}
vowel(w);
conso(w);
numb(w);
special(w);
length(w);
caps(w);
//space++;
lower(w);
palin(w);
w="";
System.out.println("Total No of Vowels:"+tv);
System.out.println("Total No of Consonents:"+tc);
System.out.println("Total No of Numbers:"+tn);
System.out.println("Total No of Special Char:"+ts);
System.out.println("Total No of Caps:"+tcp);
System.out.println("Total No of Lowers:"+tlw);
System.out.println("Total No of Palindroms:"+tpa);
System.out.println("Total No of Space:"+tsp);
}
void vowel(String w)
{
v=0;
for(int i=0;i<w.length();i++)
{
ch=w.charAt(i);
if((ch=='A')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o'))
{
v++;
}
}
System.out.println("Total Vowel in the Word"+ w+" "+"is"+v);
tv=tv+v;
}
void conso(String w)
{
c=0;
for(int i=0;i<w.length();i++)
{
ch=w.charAt(i);
if(((int)ch>=65 && (int)ch<=90) || ((int)ch>=97 && (int)ch<=122))
{
if((ch!='A')||(ch!='a')||(ch!='E')||(ch!='e')||(ch!='I')||(ch!='i')||(ch!='O')||(ch!='o')||(ch!='U')||(ch!='u'))
{
c++;
}
}
}
System.out.println("Total Consonent in the Word"+ w+" "+"is"+c);
tc=tc+c;
}
void numb(String w)
{
n=0;
for(int i=0;i<w.length();i++)
{
ch=w.charAt(i);
if((int)ch>=48 && (int)ch<=57)
{
n++;
}
}
System.out.println("Total Number in the Word"+ w+" "+"is"+n);
tn=tn+n;
}
void special(String w)
{
s=0;
for(int i=0;i<w.length();i++)
{
ch=w.charAt(i);
if(((int)ch>=0 && (int)ch<=31) || ( (int)ch>=33 && (int)ch<=47 )||( (int)ch>=58 && (int)ch<=64 )|| ( (int)ch>=91 && (int)ch<=96 )||( (int)ch>=123 && (int)ch<=255 ))
{
s++;
}
}
System.out.println("Total Special char in the Word"+ w+" "+"is"+s);
ts=ts+s;
}
void length(String w)
{
l=w.length();
System.out.println("Total length of char in the Word"+ w+" "+"is"+l);
tl=tl+l;
}
void caps(String w)
{
cp=0;
for(int i=0;i<w.length();i++)
{
ch=w.charAt(i);
if((int)ch>=65&&(int)ch<=90)
{
cp++;
}
}
System.out.println("Total Capital letters in the Word"+ w+" "+"is"+cp);
tcp=tcp+cp;
}
void lower(String w)
{
lw=0;
for(int i=0;i<w.length();i++)
{
ch=w.charAt(i);
if((int)ch>=97 && (int)ch<=122)
{
lw++;
}
}
System.out.println("Total Small letters in the Word"+ w+" "+"is"+lw);
tlw=tlw+lw;
}
void palin(String w)
{
pa=0;
int f=0;
for(int i=0,j=w.length()-1;i<w.length()/2;i++,j--)
{
if(w.charAt(i)!=w.charAt(j))
{
f=1;
break;
}
}
if(f==0)
{
System.out.println("The Word is Palindrom:"+ w);
pa++;
}
tpa=tpa+pa;
}

}