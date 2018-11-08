import java.io.*;
class primefile
{void main()throws IOException
{String fprime="prime.txt";
FileWriter ob1=new FileWriter(fprime);
BufferedWriter ob2=new BufferedWriter(ob1);
PrintWriter ob3=new PrintWriter(ob2);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,f;
for(i=1;i<100;i++)
{f=0;
for(j=2;j<i;j++)
{if(i%j==0)
f=1;break;
}

if(f==0)
ob3.println(i);
}

ob3.close();
}
}