import java.io.*;
import java.util.*;
class pattern_7
 {   
     public void generate()
     { for(int i=1;i<=5;i++)
         { for(int j=1;j<=i;j++)
             { System.out.print(j);
             }
             //System.out.println("");
          for(int b=i-1;b>=1;b--)
             { System.out.print(b);
             }
            System.out.println("");
        }
     }
     public static void main(int i)
     { pattern_7 n=new pattern_7();
       n.generate();
    }
}