class sales
{
public static void main(int d)
 {
     int sales,com;
     sales=d;
     com=0;
     if(sales<10000)
     com=(d*10)/100;
     else
     if(sales<30000)
     com=(d*15)/100;
     else
     if(sales<50000)
     com=(d*25)/100;
     else
     if(sales<75000)
     com=(d*35)/100;
     else
     if(sales<50000)
     com=(d*50)/100;
     
     System.out.println(com);
    }
}
