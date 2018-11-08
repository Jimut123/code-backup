package Apc;
import java.io.*;
class Print
{
    public static void main(String args[])
    {
       System.out.println(Math.abs(-25.82));
       System.out.println(Math.ceil(Math.sqrt(30)));
       int vl=900,res,n=100;
       res=n-vl>0?501:105;
       System.out.println(res);
       long s = 444444444;
       float d = s+ 777777777;
       System.out.println(d);
       int a=-5,b=8;
       
       System.out.println("a++ = "+(a+++b));
       System.out.println("a>b="+(a>b));
       System.out.println("++a="+ ++a);
       System.out.println("--a="+--a);
       System.out.println("a!=(a+b) = "+(a!=(a+b)));
  
       String n45="Computer Knowledge",m="Computer Applications";
       System.out.println(n45.substring(0,8).concat(m.substring(9)));
    }
}