import java.util.*;
import java.util.regex.*;
import java.io.*;
public class StringMatch{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int c=0;
        System.out.print("Enter a pattern : ");
        String pat = sc.nextLine();
        Pattern p = Pattern.compile(pat,Pattern.CASE_INSENSITIVE);
        System.out.print("Enter a file name : ");
        String in = sc.nextLine();

        int ch=0;
        StringBuilder sb = new StringBuilder();
        RandomAccessFile fp1 = new RandomAccessFile(in,"r");
        while((ch=fp1.read())!=-1){
            sb.append((char)ch);
        }
        String sm = sb.toString();

        Matcher m = p.matcher(sm);
        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end()-1));
            c++;
        }

        System.out.println("Total number of times found : "+c);
        String st = new String("");
        System.out.print("Enter new pattern : ");
        String x = sc.nextLine();
        st = sm.replaceAll(pat, x);
        try(PrintWriter pw = new PrintWriter("change.txt")){
            pw.println(st);
        }
    }
    

}