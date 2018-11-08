import java.io.*;
public class spacetri{
    
    public static void main(String args[])throws Exception{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter the string");
        String str=br.readLine();
        int i,j,k;
        int sp=25;
        int sp1=2;
        
        for(i=0;i<str.length();i++){
             for(j=1;j<=sp;j++){
                System.out.print(" ");
            }
           
                if(i==0){
                    System.out.print(str.charAt(i));
                }
                else{
                    System.out.print(str.charAt(i)+" "+" ");
                    for(k=1;k<=sp1;k++){
                        System.out.print(" ");
                    }
                        System.out.print(str.charAt(i)+" "+" ");
                        sp1=sp1+4;
                    
                    
                }
                System.out.println("");
                    sp=sp-2;
            
        }
    }
}
