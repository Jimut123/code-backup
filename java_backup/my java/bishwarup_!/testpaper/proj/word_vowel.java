package testpaper.proj;

import java.io.*;
class word_vowel
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("vowel.txt")));
PrintWriter pw2=new PrintWriter(new BufferedWriter(new FileWriter("consonant.txt")));
System.out.println("how many word(s) do you want to give ?????");
int n=Integer.parseInt(br.readLine());
System.out.println("give the "+n+" word(s) :");
String w[]=new String [n];
int i,j,f=0;
for(i=0;i<n;i++)
w[i]=br.readLine();
for(i=0;i<n;i++)
{
f=0;
for(j=0;j<w[i].length();j++)
if(w[i].charAt(j)=='A' || w[i].charAt(j)=='E' || w[i].charAt(j)=='I' || w[i].charAt(j)=='O' || w[i].charAt(j)=='U' || w[i].charAt(j)=='a' || w[i].charAt(j)=='e' || w[i].charAt(j)=='i' || w[i].charAt(j)=='o' || w[i].charAt(j)=='u')
{
f=1;
break;
}
if(f==1)
pw1.println(w[i]);
else
pw2.println(w[i]);
}
pw1.close();
pw2.close();
BufferedReader ob1=new BufferedReader(new FileReader("vowel.txt"));
BufferedReader ob2=new BufferedReader(new FileReader("consonant.txt"));
String s1="",s2="";
System.out.println("list of words with vowels :");
while((s1=ob1.readLine())!=null)
System.out.println(s1);
ob1.close();
System.out.println("list of words without vowels :");
while((s2=ob2.readLine())!=null)
System.out.println(s2);
ob2.close();
}
}
