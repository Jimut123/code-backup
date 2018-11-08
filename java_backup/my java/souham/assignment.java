import java.io.*;
class assignment
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,clas,n,ch;
String sec;
int m[]=new int[100];
void main()throws IOException
{


System.out.println("enter your choice");
System.out.println("enter 1 for class V and VI");
System.out.println("enter 1 for class VII and VIII");
System.out.println("enter 1 for class IX and X");
ch=Integer.parseInt(br.readLine());
int m[]= new int[100];
       
 switch (ch)
{
    case 1:
    {
        assignment a=new assignment();
        a.fivesix();
        break;
        
    }
    case 2:
    {
        assignment a=new assignment();
        a.seveneight();
        break;
     
    }
    case 3:
    {
        assignment a=new assignment();
        a.nineten();
        break;
        
}
}
}
void fivesix()throws IOException
{
System.out.println("enter class");
clas=Integer.parseInt(br.readLine());
System.out.println("enter section");
sec=br.readLine();
System.out.println("enter no. of students");
n=Integer.parseInt(br.readLine());
 for(i=0;i<n;i++)
        {
            System.out.println("enter marks");
            m[i]=Integer.parseInt(br.readLine());
        }
for(i=0;i<n;i++)
        {
            if(m[i]>=80)
            System.out.println("grade A+");
            else if(m[i]>=70 && m[i]<80)
            System.out.println("grade A");
            else if(m[i]>=60 && m[i]<70)
            System.out.println("grade B+");
            else if(m[i]>=50 && m[i]<60)
            System.out.println("grade B");
            else if(m[i]>=40 && m[i]<50)
            System.out.println("grade C");
            else
            System.out.println("fail");
        }
}
void seveneight()throws IOException
{
System.out.println("enter class");
clas=Integer.parseInt(br.readLine());
System.out.println("enter section");
sec=br.readLine();
System.out.println("enter no. of students");
n=Integer.parseInt(br.readLine());
 for(i=0;i<n;i++)
        {
            System.out.println("enter marks");
            m[i]=Integer.parseInt(br.readLine());
        }
for(i=0;i<n;i++)
        {
            if(m[i]>=90)
            System.out.println("grade A++");
            else if(m[i]>=80 && m[i]<90)
            System.out.println("grade A+");
            else if(m[i]>=70 && m[i]<80)
            System.out.println("grade A");
            else if(m[i]>=60 && m[i]<70)
            System.out.println("grade B+");
            else if(m[i]>=50 && m[i]<60)
            System.out.println("grade B");
            else if(m[i]>=40 && m[i]<50)
            System.out.println("grade C");
            else
            System.out.println("fail");
        }   
}
void nineten()throws IOException
{
System.out.println("enter class");
clas=Integer.parseInt(br.readLine());
System.out.println("enter section");
sec=br.readLine();
System.out.println("enter no. of students");
n=Integer.parseInt(br.readLine());
 for(i=0;i<n;i++)
        {
            System.out.println("enter marks");
            m[i]=Integer.parseInt(br.readLine());
        }
for(i=0;i<n;i++)
        {
            if(m[i]>=90)
            System.out.println("Point I");
            else if(m[i]>=80 && m[i]<90)
            System.out.println("Point II");
            else if(m[i]>=70 && m[i]<80)
            System.out.println("Point III");
            else if(m[i]>=60 && m[i]<70)
            System.out.println("Point IV");
            else if(m[i]>=50 && m[i]<60)
            System.out.println("Point V");
            else if(m[i]>=40 && m[i]<50)
            System.out.println("Point VI");
            else if(m[i]>=35 && m[i]<40)
            System.out.println("Point VII");
            else
            System.out.println("PCNA");
    }
}
}