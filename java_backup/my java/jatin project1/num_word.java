 
import java.io.*;
class num_word
{
    String s,s4,s5;
    String s1[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    String s2[]={"TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTTY","NINETY"};
    String s3[]={"ONE HUNDRED","TWO HUNDRED","THREE HUNDRED","FOUR HUNDRED","FIVE HUNDRED","SIX HUNDRED","SEVEN HUNDRED","EIGHT HUNDRED","NINE HUNDRED"};
    int i;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    void input()throws IOException
    {
        System.out.println("Enter number:");
        s=br.readLine();
        s4=s5="";
        if( s.length()==1)
             {
               unit(s);
            }
            else
            if( s.length()==2)
             {
               tens(s);
            }
            else
            if( s.length()==3)
             {
               hundreds(s);
            }
      System.out.println(s4);  
    }
        void unit(String k)
{
int i;
i=0;
//System.out.println(k);
if(k.charAt(i)=='0')
 s4=s1[0]+" "+s4;
else
 if(k.charAt(i)=='1')
 s4=s1[1]+" "+s4;
 else
 if(k.charAt(i)=='2')
 s4=s1[2]+" "+s4;
 else
 if(k.charAt(i)=='3')
 s4=s1[3]+" "+s4;
 else
 if(k.charAt(i)=='4')
 s4=s1[4]+" "+s4;
 else
 if(k.charAt(i)=='5')
 s4=s1[5]+" "+s4;
 else
 if(k.charAt(i)=='6')
 s4=s1[6]+" "+s4;
  else
 if(k.charAt(i)=='7')
 s4=s1[7]+" "+s4;
  else
 if(k.charAt(i)=='8')
 s4=s1[8]+" "+s4;
  else
 if(k.charAt(i)=='9')
 s4=s1[9]+" "+s4;
}

void tens(String k)
{
int i;
s5="";
//System.out.println(k);
if(k.charAt(0)=='0'&& k.charAt(1)=='0')
 s4=s1[0]+" "+s4;
else
 if(k.charAt(0)=='0'&&k.charAt(1)=='1')
 s4=s1[1]+" "+s4;
 else
 if(k.charAt(0)=='0'&&k.charAt(1)=='2')
 s4=s1[2]+" "+s4;
 else
 if(k.charAt(0)=='0'&&k.charAt(1)=='3')
 s4=s1[3]+" "+s4;
 else
 if(k.charAt(0)=='0'&&k.charAt(1)=='4')
 s4=s1[4]+" "+s4;
 else
 if(k.charAt(0)=='0'&&k.charAt(1)=='5')
 s4=s1[5]+" "+s4;
 else
 if(k.charAt(0)=='0'&&k.charAt(1)=='6')
 s4=s1[6]+" "+s4;
  else
 if(k.charAt(0)=='0'&&k.charAt(1)=='7')
 s4=s1[7]+" "+s4;
  else
 if(k.charAt(0)=='0'&&k.charAt(1)=='8')
 s4=s1[8]+" "+s4;
  else
 if(k.charAt(0)=='0'&&k.charAt(1)=='9')
 s4=s1[9]+" "+s4;
 else
 if(k.charAt(0)=='1'&& k.charAt(1)=='0')
 s4=s2[0]+" "+s4;
else
 if(k.charAt(0)=='2'&&k.charAt(1)=='0')
 s4=s2[1]+" "+s4;
 else
 if(k.charAt(0)=='3'&&k.charAt(1)=='0')
 s4=s2[2]+" "+s4;
 else
 if(k.charAt(0)=='4'&&k.charAt(1)=='0')
 s4=s2[3]+" "+s4;
 else
 if(k.charAt(0)=='5'&&k.charAt(1)=='0')
 s4=s2[4]+" "+s4;
 else
 if(k.charAt(0)=='6'&&k.charAt(1)=='0')
 s4=s2[5]+" "+s4;
 else
 if(k.charAt(0)=='7'&&k.charAt(1)=='0')
 s4=s2[6]+" "+s4;
  else
 if(k.charAt(0)=='8'&&k.charAt(1)=='0')
 s4=s2[7]+" "+s4;
  else
 if(k.charAt(0)=='9'&&k.charAt(1)=='0')
 s4=s2[8]+" "+s4;
 else
  if(k.charAt(0)=='1'&&k.charAt(1)=='1')
 s4="ELEVEN"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='2')
 s4="TWELVE"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='3')
 s4="THIRTEEN"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='4')
 s4="FOURTEEN"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='5')
 s4="FIFTEEN"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='6')
 s4="SIXTEEN"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='7')
 s4="SEVENTEEN"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='8')
 s4="EIGHTEEN"+" "+s4;
 else
 if(k.charAt(0)=='1'&&k.charAt(1)=='9')
 s4="NINETEEN"+" "+s4;
 else
 if(k.charAt(0)=='2'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[1]+" "+s4;
}
else
if(k.charAt(0)=='3'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[2]+" "+s4;
}
else
if(k.charAt(0)=='4'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[3]+" "+s4;
}
else
if(k.charAt(0)=='5'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[4]+" "+s4;
}
else
if(k.charAt(0)=='6'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[5]+" "+s4;
}
else
if(k.charAt(0)=='7'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[6]+" "+s4;
}
else
if(k.charAt(0)=='8'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[7]+" "+s4;
}
else
if(k.charAt(0)=='9'&&k.charAt(1)!='0')
 {
 s5=s5+k.charAt(1);
 unit(s5);
 s4=s2[8]+" "+s4;
}
} 
void hundreds(String k)
{
s5="";
if(k.charAt(0)=='1')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[0]+" "+s4;
}
else
if(k.charAt(0)=='2')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[1]+" "+s4;
 
}
else
if(k.charAt(0)=='3')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[2]+" "+s4;
}
else
if(k.charAt(0)=='4')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[3]+" "+s4;
}
else
if(k.charAt(0)=='5')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[4]+" "+s4;
}
else
if(k.charAt(0)=='6')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[5]+" "+s4;
}
else
if(k.charAt(0)=='7')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[6]+" "+s4;
}
else
if(k.charAt(0)=='8')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[6]+" "+s4;
}
else
if(k.charAt(0)=='9')
{
s5=s5+k.charAt(1)+k.charAt(2);
tens(s5);
 s4=s3[8]+" "+s4;
}
} 
}

