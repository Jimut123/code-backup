import java.io.*;
class numder
{
      public static void main(String arg[])throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int n;
          System.out.println("Enter a number not more than 8 digits");
          n=Integer.parseInt(br.readLine());
          //double dup=n;
          int i=0,c=0,j=0,r,dup=n;
          String a[]=new String[10];
          String b[]=new String[10];
          String t="";
          do
          {
              r=dup%10;
              c++;
              if(r==1)
              {
                  a[i]="one";
              }
              if(r==2)
              {
                  a[i]="two";
              }
              if(r==3)
              {
                  a[i]="three";
              }
              if(r==4)
              {
                  a[i]="four";
              }
              if(r==5)
              {
                  a[i]="five";
              }
              if(r==6)
              {
                  a[i]="six";
              }
              if(r==7)
              {
                  a[i]="seven";
              }
              if(r==8)
              {
                  a[i]="eight";
              }
              if(r==9)
              {
                  a[i]="nine";
              }
              if(r==0)
              {
                  a[i]="zero";
              }
              i=i+1;
              dup=dup/10;
            }while(dup!=0);
            
            for(i=0;i<c;i++)
            {
              b[i]=a[c-i-1];
            }
            System.out.println(+c);
            if(c==8)
            {
                System.out.print(b[j]+" crore"+" ");
                j++;c--;
            }
            if(c==7)
            {
                if(b[j].equalsIgnoreCase("one"))
                {
                System.out.print(b[j+1]+"teen lakhs");
                j=j+2;c=c-2;
                }
                       if(b[j].equalsIgnoreCase("two"))
                {
                System.out.print("twenty"+b[j+1]+" lakhs");
                j=j++;c=c-2;
                
                }
                
                if(b[j].equalsIgnoreCase("three"))
                {
                System.out.print("thirtylakhs");
                j=j++;c=c-2;
                }
                else
                {
                System.out.print(b[j]+"ty "+b[j+1]+" lakhs"+" ");
                j=j+2;c=c-2;
                }
            }    
            if(c==6)
            {
                System.out.print(b[j]+" lakhs"+" ");
                j++;c--;
            }
           
            if(c==5)
            {
                if(b[j].equalsIgnoreCase("one"))
                {
                System.out.print(b[j+1]+"teen thousand");
                j=j+2;c=c-2;
                }
                      if(b[j].equalsIgnoreCase("two"))
                {
                System.out.print("twenty"+b[j+1]+"thousand");
                j=j++;c=c-2;
                
                }
                
                if(b[j].equalsIgnoreCase("three"))
                {
                System.out.print("thirty"+b[j+1]+"thousand");
                j=j++;c=c-2;
                }
               if(b[j].equalsIgnoreCase("four")||b[j].equalsIgnoreCase("five")||b[j].equalsIgnoreCase("six")||b[j].equalsIgnoreCase("seven")||b[j].equalsIgnoreCase("eight")||b[j].equalsIgnoreCase("nine"))
                {
                System.out.print(b[j]+"ty "+b[j+1]+" thousand"+" ");
                j=j+2;c=c-2;
                }
            }     
            
            
            if(c==4)
            {
                System.out.print(b[j]+" thousand"+" ");
                j++;c--;
            }  
            
           
            if(c==3)
            {
                System.out.print(b[j]+" hundred"+" ");
                j++;c--;
            }   
            
            
            if(c==2)
            {
                if(b[j].equalsIgnoreCase("one"))
                {
                System.out.print(b[j+1]+"teen");
                j=j+2;c=c-2;
                }
                
                if(b[j].equalsIgnoreCase("two"))
                {
                System.out.print("twenty");
                j=j++;c--;
                
                }
                
                if(b[j].equalsIgnoreCase("three"))
                {
                System.out.print("thirty");
                j=j++;c--;
                }
                if(b[j].equalsIgnoreCase("four")||b[j].equalsIgnoreCase("five")||b[j].equalsIgnoreCase("six")||b[j].equalsIgnoreCase("seven")||b[j].equalsIgnoreCase("eight")||b[j].equalsIgnoreCase("nine"))
                {
                System.out.print(b[j]+"ty"+" ");
                c--;
               } j++;
            
        }
            
            
            if(c==1)
            {
                System.out.print(b[j]+" ");
                j++;c--;
            }
            
            
        }
    }