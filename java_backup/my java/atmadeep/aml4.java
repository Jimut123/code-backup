import java.io.*;
class aml4
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n,i,ch,d3;
	double d,d1,d2;
	String s,w;
	void input()throws IOException
	{
	System.out.println("Give No Decemal :");
	d=Double.parseDouble(br.readLine());
	s=w="";
	System.out.println("Press 1 for Bianry:");
	System.out.println("Press 2 for Octal:");
	System.out.println("Press 3 for Hexadecimal:");
	System.out.println("Enter Your Choice:");
	ch=Integer.parseInt(br.readLine());
	switch(ch)
	{
	case 1: bin();
	        break;
	case 2: oct();
	        break;
	case 3: hexa();
	        break;    
	default:System.out.println("Wrong entry....");
	}
	}
	void bin()
	{
	n=(int)d;
	d1=d-(double)n;
	i=1;
	//System.out.println(n);
	while(n>0)
	{
	int k=n%2;
	if(k==1)
	 s=s+'1';
	else
	 if(k==0)
	  s=s+'0';
	n=n/2;
	}
	
	if(d1>0)
	{
	 while(d1>0 && i<=3)
	 {
	 d2=d1*2;
	 if(d2>=1)
	 {
	  w=w+'1';
	  d1=d2-1;
	 } 
	 else
	  if(d2<1)
	  {
	    w=w+'0';
	    d1=d2;
	  }
	  //System.out.println(d1);
	  i++;
	  }
	  for(i=s.length()-1;i>=0;i--)
	   System.out.print(s.charAt(i));
	  System.out.print(".");
	  for(i=0;i<w.length();i++)
	   System.out.print(w.charAt(i));
	
	  }
	else
	 {
	 for(i=s.length()-1;i>=0;i--)
	   System.out.print(s.charAt(i));
	  System.out.print(".");
	  System.out.print("00");
	 }       
	
}
void oct()
	{
	n=(int)d;
	d1=d-(double)n;
	i=1;
	while(n>0)
	{
	int k=n%8;
	if(k==1)
	 s=s+'1';
	else if(k==0)
	  s=s+'0';
	else if(k==2)
	  s=s+'2';
	else if(k==3)
	  s=s+'3';
	else if(k==4)
	  s=s+'4';
	else if(k==5)
	  s=s+'5';
	else if(k==6)
	  s=s+'6';
	else if(k==7)
	  s=s+'7';
	n=n/8;
	}
	d3=0;
	if(d1>0)
	{
	 while(d1>0 && i<=3)
	 {
	 d2=d1*8;
	 if(d2>=1)
	 {
	 d3=(int)d2;
	 if(d3==1)
	  w=w+'1';
	 else
	  if(d3==2)
	  w=w+'2';
	 else
	 if(d3==3)
	  w=w+'3';
	 else
	 if(d3==4)
	  w=w+'4';
	 else
	 if(d3==5)
	  w=w+'5';
	 else
	 if(d3==6)
	  w=w+'6';
	 else
	 if(d3==7)
	  w=w+'7';
   d1=d2-d3;
	 } 
	 else
	  if(d2<1)
	  {
	    w=w+'0';
	    d1=d2;
	  }
	  i++;
	  }
	  for(i=s.length()-1;i>=0;i--)
	   System.out.print(s.charAt(i));
	  System.out.print(".");
	  for(i=0;i<w.length();i++)
	   System.out.print(w.charAt(i));
	
	  }
	else
	 {
	 for(i=s.length()-1;i>=0;i--)
	   System.out.print(s.charAt(i));
	  System.out.print(".");
	  System.out.print("00");
	 }       
	
}
void hexa()
	{
	n=(int)d;
	d1=d-(double)n;
	i=1;
	while(n>0)
	{
	int k=n%16;
	if(k==1)
	 s=s+'1';
	else if(k==0)
	  s=s+'0';
	else if(k==2)
	  s=s+'2';
	else if(k==3)
	  s=s+'3';
	else if(k==4)
	  s=s+'4';
	else if(k==5)
	  s=s+'5';
	else if(k==6)
	  s=s+'6';
	else if(k==7)
	  s=s+'7';
	else if(k==8)
	  s=s+'8';
	else if(k==9)
	  s=s+'9';
	else if(k==10)
	  s=s+'A';
	  else if(k==11)
	  s=s+'B';
	  else if(k==12)
	  s=s+'C';
	  else if(k==13)
	  s=s+'D';
	  else if(k==14)
	  s=s+'E';
	  else if(k==15)
	  s=s+'F';
	n=n/16;
	}
	
	if(d1>0)
	{
	 while(d1>0 && i<=3)
	 {
	 d2=d1*16;
	 if(d2>=1)
	 {
	  d3=(int)d2;
	 if(d3==1)
	  w=w+'1';
	 else
	  if(d3==2)
	  w=w+'2';
	 else
	 if(d3==3)
	  w=w+'3';
	 else
	 if(d3==4)
	  w=w+'4';
	 else
	 if(d3==5)
	  w=w+'5';
	 else
	 if(d3==6)
	  w=w+'6';
	 else
	 if(d3==7)
	  w=w+'7';
	 else
	   if(d3==8)
	  w=w+'8';
	  else
	  if(d3==9)
	  w=w+'9';
	  else
	  if(d3==10)
	  w=w+'A';
	  else
	  if(d3==11)
	  w=w+'B';
	  else
	  if(d3==12)
	  w=w+'C';
	  else
	  if(d3==13)
	  w=w+'D';
	  else
	  if(d3==14)
	  w=w+'E';
	  else
	  if(d3==15)
	  w=w+'F';
   d1=d2-d3;
	 } 
	 else
	  if(d2<1)
	  {
	    w=w+'0';
	    d1=d2;
	  }
	  i++;
	  }
	  for(i=s.length()-1;i>=0;i--)
	   System.out.print(s.charAt(i));
	  System.out.print(".");
	  for(i=0;i<w.length();i++)
	   System.out.print(w.charAt(i));
	
	  }
	else
	 {
	 for(i=s.length()-1;i>=0;i--)
	   System.out.print(s.charAt(i));
	  System.out.print(".");
	  System.out.print("00");
	 }       
	
}
}


