import java.io.*;
class date
{
  public static void main(String args[]) throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Project Allotment Date");
      System.out.println("Enter The Date in dd/mm/yyyy format");
      int dd=Integer.parseInt(br.readLine());
      int mm=Integer.parseInt(br.readLine());
      int yyyy=Integer.parseInt(br.readLine());
      System.out.println(" Enter The Number Of Days");
      int n=Integer.parseInt(br.readLine());
      int m[]={ 31,28,31,30,31,30,31,31,30,31,30,31};
      int k,i,z,d;
      if(yyyy%4==0 || yyyy%400==0)
      m[1]=29;
      k=m[mm-1] - dd;
      k=k+1;
      d=0;
      z=0;
      for(i=mm+1;i<=12;i++)
      {
          if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
          {
           k=k+31;
           z=31;
          }
          else
           if(i==2)
           {
              if(yyyy%4==0 || yyyy%400==0)
              {
              k=k+28;
              z=28;
            }
              else
              {
              k=k+29;
              z=29;
          }
        }
        else  
          k=k+30;
          if(k>n)
          {
              k=k-z;
              
              break;
          }
        }
        if(i>12)
        {
            i=i-12;
            yyyy++;
        }
         n=n-k;
          System.out.println(+n+"/"+i+"/"+yyyy);
        
    }}
