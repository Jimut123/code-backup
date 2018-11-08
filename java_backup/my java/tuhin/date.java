import java.io.*;
public class date
{
 public static void main(String [] args)throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter year ");
        int yy=Integer.parseInt(br.readLine());
        int arrd[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if((yy%4)==0 && (yy%100)!=0 ||(yy%400)==0)
         arrd[1]=arrd[1]+1;
