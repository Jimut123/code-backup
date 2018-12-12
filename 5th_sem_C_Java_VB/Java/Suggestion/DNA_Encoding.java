/*Subscribe to PewDiePie help defeat T-Series : https://www.youtube.com/channel/UC-lHJZR3Gqxm24_Vd_AJ5Yw */

import java.io.*;
import java.util.*;

public class DNA_Encoding{
    int a =0;
    public DNA_Encoding(){

        a=5;
    }

    public static void main(String args[]) throws IOException{
        DNA_Encoding obj = new DNA_Encoding();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name of input file : ");
        StringBuffer sb = new StringBuffer("");
        int ch=0;
        RandomAccessFile fp1 = new RandomAccessFile(br.readLine(),"r");
        
        while((ch=fp1.read())!=-1){
            sb.append((char)ch);

        }
        System.out.println(sb.toString());

        byte bytes[] = sb.toString().getBytes();

        StringBuilder binary = new StringBuilder();
        StringBuilder binary2 = new StringBuilder();

        for(byte b : bytes){

            System.out.println(b);
        }

        for(byte b : bytes){

            int val = b;
            for(int i=0;i<8;i++){

                binary.append((val & 128) == 0 ? 0 : 1);
                binary2.append((val & 128) == 0 ? 0 : 1);
                
                val<<=1;
                
            }
            binary.append(' ');
            
        }
        System.out.println("original binary : "+binary);
        System.out.println("binary without spacing : "+binary2);

        StringBuilder comp1 = new StringBuilder();
        String b = binary2.toString();
        comp1 = obj.bitComp(b);
        
        String cs = comp1.toString();
        //String cr = comp1.reverse().toString();
        System.out.println("Prime complemented : "+cs);
        //System.out.println("Reverse: "+cr);


        StringBuilder cc = new StringBuilder();
        cc = comp1;
        for(int i =0;i<cs.length();i+=2){
            char c = '\u0000';
            c = (char)((int)cs.charAt(i) ^ (int)cs.charAt(i+1));
            cc.setCharAt(i+1, (char)(c+48));

        }

        System.out.println("Bit wise XOR : "+cc.toString());

		String rev = cc.reverse().toString();
        
        System.out.println("Reverse: "+rev);

        StringBuilder comp2 = new StringBuilder();
        comp2 = obj.bitComp(rev);

        System.out.println("Prime complemented again : "+comp2.toString());
        String fnl = comp2.toString();

        StringBuilder b3 = new StringBuilder();
        for(int i =0;i<fnl.length()-1;i+=2){
            if(fnl.charAt(i)=='0' && fnl.charAt(i+1)=='0')
                b3.append('A');
            if(fnl.charAt(i)=='0' && fnl.charAt(i+1)=='1')
                b3.append('T');
            if(fnl.charAt(i)=='1' && fnl.charAt(i+1)=='0')
                b3.append('C');
            if(fnl.charAt(i)=='1' && fnl.charAt(i+1)=='1')
                b3.append('G');
        }


        System.out.println(b3.toString());

        try(PrintWriter pw = new PrintWriter("binary.txt")){
            pw.println(b3.toString());
        }

    }

    private boolean isPrime(int num){
        boolean flag = true;
        if(num == 0 || num == 1)
            flag=false;
        for(int i = 2; i <= num/2; i++){
            
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private StringBuilder bitComp( String s ) {
        StringBuilder x = new StringBuilder();
        for(int i =0;i<s.length();i++){

            if(isPrime(i)==true){

                if(s.charAt(i)=='1')
                    x.append('0');
                if(s.charAt(i)=='0')
                    x.append('1');

            }else{
                x.append(s.charAt(i));
            }
        }
        return x;

    }
}