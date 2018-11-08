import java.io.*;
class combination
{public static void main(String[] args)throws IOException
{String s;
int i,j,k,l;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a three letter word");
s=br.readLine();
l=s.length();
System.out.println("The required combinations are:");
for(i=0;i<l;i++)
{for(j=0;j<l;j++)
{for(k=0;k<l;k++)
{if(i!=j&&j!=k&&k!=i)
System.out.println(s.charAt(i)+""+s.charAt(j)+""+s.charAt(k));
System.out.println("");
}
}
}
}
}
