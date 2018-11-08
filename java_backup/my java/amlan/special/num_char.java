package special;


import java.io.*;
class num_char
{
 int n,r;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 char arr[][]=new char[7][4];
 public void accept()throws IOException
 {
     System.out.println("enter a no.");
      n=Integer.parseInt(br.readLine());
     int n1=n,ch,f,d,d1,d2;
     r=0;
     f=0;
     d1=0;
     while(n1%10==0)
     {
     d1++;
     n1=n1/10;
    }
     clear();
     while(n1>0)
     {
         d=n1%10;
         r=(r*10)+d;
         n1=n1/10;
        }
        
        
        System.out.println(r);
        while(r>0)
        {
            ch=r%10;
            //System.out.println(ch);
            switch(ch)
            {
                case 1:one();
                       clear();
                       break;
                case 2:two();
                       clear();
                        break;
                case 3:three();
                       clear();
                        break;
                case 4:four();
                       clear();
                        break;
                case 5:five();
                       clear();
                        break;
                case 6:six();
                       clear();
                        break;
                case 7:seven();
                       clear();
                        break;
                case 8:eight();
                       clear();
                        break;
                case 9:nine();
                       clear();
                        break;
                case 0:zero();
                       clear();
                       break;
                    }
                    r=r/10;
                }
               d2=1;
               while(d2<=d1)
               {
                zero();
                       clear();
                       d2++;
                    }
            }
            public void one()
            {
              
              int i;
              for(i=0;i<7;i++)
              {
                  arr[i][0]='*';
                }
                show(arr);
            }
            public void two()
            {
              //String arr[][]=new String[7][4];
              int i;
              for(i=0;i<4;i++)
               arr[0][i]='*';
              for(i=1;i<4;i++)
               arr[i][3]='*';
              for(i=0;i<3;i++)
               arr[3][i]='*';
              for(i=4;i<7;i++)
               arr[i][0]='*';
              for(i=1;i<4;i++)
               arr[6][i]='*';
              show(arr); 
            }
            public void three()
            {
              //String arr[][]=new String[7][4];
              int i;
              for(i=0;i<7;i++)
               arr[i][3]='*';
              for(i=0;i<3;i++)
              {
                  arr[0][i]='*';
                  arr[3][i]='*';
                  arr[6][i]='*';
                }
                show(arr);
            }
            public void four()
            {
              //String arr[][]=new String[7][4];
              int i;
              for(i=4;i<7;i++)
               arr[i][3]='*';
              for(i=0;i<4;i++)
               arr[i][0]='*';
              for(i=1;i<3;i++)
               arr[3][i]='*';
              show(arr);
            }
            public void five()
            {
              //String arr[][]=new String[7][4];
              int i;
              for(i=0;i<4;i++)
              {
                  arr[0][i]='*';
                  arr[3][i]='*';
                  arr[6][i]='*';
                }
                for(i=1;i<3;i++)
                 arr[i][0]='*';
                for(i=4;i<6;i++)
                 arr[i][3]='*';
                show(arr); 
                }
                public void six()
                {
                  //String arr[][]=new String[7][4];
                  int i;
                  for(i=0;i<7;i++)
                   arr[i][0]='*';
                  for(i=1;i<4;i++)
                  {
                      arr[0][i]='*';
                      arr[3][i]='*';
                      arr[6][i]='*';
                    }
                    for(i=4;i<6;i++)
                     arr[i][3]='*';
                    show(arr); 
                    }
                    public void seven()
                    {
                      //String arr[][]=new String[7][4];
                      int i;
                      for(i=0;i<7;i++)
                       arr[i][3]='*';
                      for(i=0;i<3;i++)
                       arr[0][i]='*';
                      show(arr); 
                    }
                    public void eight()
                    {
                      //String arr[][]=new String[7][4];
                      int i;
                      for(i=0;i<7;i++)
                      {
                          arr[i][0]='*';
                          arr[i][3]='*';
                        }
                        for(i=1;i<3;i++)
                        {
                            arr[0][i]='*';
                            arr[3][i]='*';
                            arr[6][i]='*';
                        }
                        show(arr);
                    }
                    public void nine()
                    {
                      //String arr[][]=new String[7][4];
                      int i;
                      for(i=0;i<7;i++)
                       arr[i][3]='*';
                      for(i=0;i<3;i++)
                      {
                          arr[0][i]='*';
                          arr[3][i]='*';
                          arr[6][i]='*';
                        }
                        for(i=1;i<3;i++)
                         arr[i][0]='*';
                        show(arr); 
                        }
                        public void zero()
                        {
                          //String arr[][]=new String[7][4];
                          int i;
                          for(i=0;i<7;i++)
                          {
                              arr[i][0]='*';
                              arr[i][3]='*';
                            }
                            for(i=1;i<3;i++)
                            {
                                arr[0][i]='*';
                                arr[6][i]='*';
                            }
                            show(arr);
                        }
                        public void clear()
                        {
                           int i,j;
                            for(i=0;i<7;i++)
      {
       for(j=0;j<4;j++)
             {   
                 arr[i][j]=' ';
                }
            }
                        }
                        public void show(char arr[][])
                        {
                            int i,j;
                            for(i=0;i<7;i++)
                            {
                                for(j=0;j<4;j++)
                                {
                                    //if (arr[i].equals("*")==true)
                                     System.out.print(arr[i][j]);
                                    //else
                                     //System.out.print(" ");
                                    }
                                    System.out.println("");
                                }
                            }
                        }
              