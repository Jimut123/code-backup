import java.util.*;
class HumanVsHuman
    {
        String player1,player2;
        String p1symbol,p2symbol;
        String board[][]=new String[3][3];
        int status[][]=new int[3][3];
        int x;
        Scanner sc;
        String current;
        int moves;
        public HumanVsHuman()
        {
            sc=new Scanner(System.in);
            String s1,s2;
            System.out.print("First Player Enter Name::");
            s1=sc.nextLine();
            System.out.print("\n\n\nSecond Player Enter Name::");
            s2=sc.nextLine();
            player1=s1;
            player2=s2;
            moves=0;
            x=whoStarts();
            if(x==1)
            {
                p1symbol="X";
                p2symbol="0";
                current=player1;
            }// if ends
            else
            {
                p1symbol="0";
                p2symbol="X";
                current=player2;
            }// else part ends
        }// constructor ends
        public int checkGameEnd()
        {
           /*
             * return 0 denotes game not yet over
             * return 1 denotes victory for computer
             * return 2 denotes victory for user
             * return 3 denotes game drawn
             * */
            if(moves<5)
            return 0;
            int i,j,count1,count2;
            for(i=0;i<3;i++)
            {
                count1=0;
                count2=0;
                for(j=0;j<3;j++)
                {
                    if(status[i][j]==1)
                    {
                        count1++;
                    }
                    if(status[i][j]==2)
                    {
                        count2++;
                    }// if ends
                }// for ends
                if(count1==3)
                {
                    return 1;
                }// if ends
                if(count2==3)
                {
                    return 2;
                }// if ends
                count1=0;
                count2=0;
                for(j=0;j<3;j++)
                {
                    if(status[j][j]==1)
                    {
                        count1++;
                    }// if ends
                    if(status[j][i]==2)
                    {
                        count2++;
                    }// if ends
                }// inner for ends
                if(count1==3)
                {
                    return 1;
                }// if ends
                if(count2==3)
                {
                    return 2;
                }// if ends
            }// outer for ends   
            if(status[0][0]==1 && status[1][1]==1 && status[2][2]==1)
            {
                return 1;
            }// if ends
            if(status[0][0]==2 && status[1][1]==2 && status[2][2]==2)
            {
                return 2;
            }// if ends
            if(status[0][2]==1 && status[1][1]==1 && status[2][0]==1)
            {
                return 1;
            }// if ends
            if(status[0][2]==2 && status[1][1]==2 && status[2][0]==2)
            {
                return 2;
            }// if ends 
            if(moves==9)
            {
                return 3;
            }// if ends
            return 0;
        }// checkGameEnd() ends
        public void openingScreen()
        {
            System.out.print("\f");

            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=30;j++)
                {
                    System.out.print("*");
                    try
                    {
                        Thread.sleep(10);
                    }// try block ends
                    catch(Exception e)
                    {}// catch block ends
                }// inner for ends
                System.out.print("\n");
            }// outer for ends
            String str="Welcome "+player1+" and "+player2;
            for(int i=0;i<str.length();i++)
            {
                System.out.print(str.charAt(i));
                try
                {
                    Thread.sleep(200);
                }// try block ends
                catch(Exception e)
                {}// catch block ends
            }// for ends
            System.out.print("\n\n");
            str ="Randomly picking the player to start......Please wait..";
            for(int i=0;i<str.length();i++) 
            {
                System.out.print(str.charAt(i));
                try
                {
                    Thread.sleep(200);
                }// try block ends
                catch(Exception e)
                {}// catch block ends
            }// for ends
            System.out.print("\n\n");
            try
            {
                Thread.sleep(3000);
            }// try block ends
            catch(Exception e)
            {}// catch block ends
            str =current+" will start";
            for(int i=0;i<str.length();i++)
            {
                System.out.print(str.charAt(i));
                try
                {
                    Thread.sleep(200);
                }// try block ends
                catch(Exception e)
                {}// catch block ends
            }// for ends
            System.out.print("\n\nPress <Enter> to start game");
            sc=new Scanner(System.in);
            sc.nextLine();
        }// openingScreen() ends

        public int getRow(int x)    
        {
            int i,j,c;
            c=0;
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    c++;
                    if(c==x)
                    {
                        break;
                    }// if ends
                }// inner for ends
                if(c==x)
                {
                    break;
                }// if ends
            }// outer for ends 
            return i;
        }// getRow() ends

        public int getCol(int x)
        {
            int i,j,c;
            c=0;j=0;
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    c++;
                    if(c==x)
                    {
                        break;
                    }// if ends
                }// outer for ends
                if(c==x)
                {
                    break;
                }// if ends
            }// outer for ends 
            return j;
        } // getCol() ends   




        public int whoStarts()
        {
            int num=(int)(2*Math.random())+1;
            return num;
        } // whoStarts() ends
        
        public void erase()
        {
            int i,j;
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    status[i][j]=0;
                }// inner for ends
            } // // outer for ends
        }// erase() ends
        public void drawBoard()     
        {
            System.out.print("\f");
            int i,j;
            int x=0;
            int num;
            String str;
            for(i=0;i<3;i++)
            {   
                for(j=0;j<3;j++)
                {
                    x++;
                    num=status[i][j];
                    str=(num==0)?""+x:(num==1)?p1symbol:p2symbol;
                    System.out.print("|");
                    System.out.print(str);
                }// inner for ends
                System.out.print("|");
                System.out.print("\n-------\n");
            } // outer for ends
        }// drawBoard() ends
        
        public void finalresult(int b)
        {
            System.out.print("\n\n\n");
            String str;
            str=(b==3)?"Game Drawn ":(b==1)? player1+" wins ":player2+" wins ";
            str+="!";
            System.out.print(str);
            System.out.print("\n\n\nGame Over !");
        } // finalresult() ends
        public void play()
        {
            sc=new Scanner(System.in);
            String ss1,str;
            int b,num,value,i,j;
            while(true)
            {
                ss1=current;
                drawBoard();
                System.out.print("\n\n"+ss1+"'s turn::");
                num=sc.nextInt();
                i=getRow(num);
                j=getCol(num);
                if(ss1.equals(player1))
                {
                    value=1;
                    str=p1symbol;
                    current=player2;
                }// if ends
                else
                {
                    value=2;
                    str=p2symbol;
                    current=player1;
                } // else part ends
                status[i][j]=value;
                moves++;
                b=checkGameEnd();
                if(b>0)
                {
                    drawBoard();
                    break;
                } // if ends
            } // while ends
            finalresult(b);
        }// play() ends
        
    } // Class ends
