import java.io.*;
class abc2
{public static void main(String args[])throws IOException
  {int i,n,j;
      DataInputStream in=new DataInputStream(System.in);
      System.out.println("enter no of students:");
      n=Integer.parseInt(in.readLine());
      objarray ob[]=new objarray[n];
      objarray temp=new objarray();
      for(i=0;i<n;i++)
      {ob[i]=new objarray();
          ob[i].input();
          ob[i].disp();
        }
        for(i=0;i<n-1;i++)
         {for(j=i+1;j<n;j++)
             {if(ob[i].marks>ob[j].marks)
                 {temp=ob[i];
                     ob[i]=ob[j];
                     ob[j]=temp;
                    }
                }
            }
           for(i=0;i<n;i++)
           {ob[i].disp();
            }
        }
    }
    