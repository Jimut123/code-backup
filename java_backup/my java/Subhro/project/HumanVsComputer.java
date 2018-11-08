package project;

import java.util.*;
class HumanVsComputer
    {
        String player1,player2; 
        //player1 denotes computer , player2 denotes user
        String p1symbol,p2symbol;
        //p1symbol is computer's symbol , p2symbol is user's symbol
        int mymoves[]=new int[9];
        int yourmoves[]=new int[9];
        int cell1,cell2;
        int status[][]=new int[3][3];
        int x;
        Scanner sc;
        String current;
        int moves; // denotes total number of moves played
        public HumanVsComputer()
        {
            sc=new Scanner(System.in);
            String s1,s2;
            // s1 denotes computer , s2 denotes player
            s1="Computer";
            System.out.print("\n\n\n Enter Name::");
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
            }// End of if
            else
            {
                p1symbol="0";
                p2symbol="X";
                current=player2;
            } // End of else
            cell1=0;
            cell2=0;
        }// End of Constructor
        public int checkGameEnd()
        {
            /*
             * return 0 denotes game not yet over
             * return 1 denotes victory for computer
             * return 2 denotes victory for user
             * return 3 denotes game drawn
             * */
             if(moves<5) // minimum 5 moves required for game to end
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
                     }// End of if
                     if(status[i][j]==2)
                     {
                         count2++;
                     }
                     // End of if
                 }// End of inner for 
                    if(count1==3)
                    {
                        return 1;
                    }// End of if
                    if(count2==3)
                    {
                        return 2;
                    }// End of if
                    count1=0;
                    count2=0;
                    for(j=0;j<3;j++)
                    {
                        if(status[j][i]==1)
                        {
                            count1++;
                        }// End of if
                        if(status[j][i]==2)
                        {
                            count2++;
                        }// End of if
                    }// End of inner for 
                    if(count1==3)
                    {
                        return 1;
                    }// End of if
                    if(count2==3)
                    {
                        return 2;
                    }// End of if
                } // End of outer for
                if(status[0][0]==1 && status[1][1]==1 && status[2][2]==1)
                {
                    return 1;
                }// End of if
                if(status[0][0]==2 && status[1][1]==2 && status[2][2]==2)
                {
                    return 2;
                }// End of if
                if(status[0][2]==1 && status[1][1]==1 && status[2][0]==1)
                {
                    return 1;
                }// End of if
                if(status[0][2]==2 && status[1][1]==2 && status[2][0]==2)
                {
                    return 2;
                } // End of if
                if(moves==9)
                {
                    return 3;
                } // End of if
                return 0;
            } // End of checkGameEnd()
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
                String str="Welcome "+player2;
                for(int i=0;i<str.length();i++)
                {
                    System.out.print(str.charAt(i));
                    try
                    {
                        Thread.sleep(100);
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
            }// End of openingScreen()
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
                        }//if ends
                    }// End of inner for
                    if(c==x)
                    {
                        break;
                    }// if ends  
                }// End of outer for  
                return i;
            }// End of getRow()
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
                        } // End of if
                    } // End of inner for
                    if(c==x)
                    {
                        break;
                    } // End of if
                }// End of outer for 
                return j;
            }  // End of getCol()
            public int whoStarts()
            {
                int num;
                //num=(int)(2*Math.random())+1;
                // Randomly generating integer between 1 - 2
                num=1;
                return num;
            }// End of whoStarts()
            public void erase()
            {
                int i,j;
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        status[i][j]=0;
                    } // End of inner for  
                }// End of outer for
            }// End of erase()
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
                        System.out.print("| ");
                        System.out.print(str);
                    }// End of inner for
                    System.out.print("|");
                    System.out.print("\n---+--+---\n");
                } // End of outer for
            } // End of drawBoard()
            public void finalresult(int b)
            {
                System.out.print("\n\n\n");
                String str;
                str=(b==3)?"Game Drawn ":(b==1)? player1+" wins ":player2+" wins ";
                str+="!";
                System.out.print(str);
                System.out.print("\n\n\nGame Over !");
            }// End of finalresult()
            public int strategicPlay()
            {
                System.out.print("\n\n\n.....Thinking.....");
                // time delay of two seconds
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {}
                if (moves==0)
                {
                    return 3; 
                } // if ends
                if(moves==2)
                {
                    return mySecondMove();
                }// if ends
                if(moves==4)
                {     
                    return myThirdMove();
                }// if ends
                if(moves==6)
                {
                    return myFourthMove();
                }// if ends
                return myFifthMove();
            }// End of strategicPlay()
            public int mySecondMove()
            {
                int t1,t2;
                t1=yourmoves[0];
                if(t1==5) // user's first move was centre square
                {   
                    t2=1;; // so select top left corner 
                }// End of if 
                else // user did not select centre           
                {
                    if(t1==1 || t1==2 || t1==4 || t1==7 || t1==8)
                    {
                        t2=9;
                    }// End of if
                    else
                    {
                        t2=1;
                    }// End of else   
                } 
                return t2; 
            }// end of mySecondMove()
            public int myThirdMove()
            { 
                int t1,t2;
                t1=yourmoves[0];
                if(t1==5)
                {
                    t2=(yourmoves[1]!=2)?2:8;
                }// End of if
                else
                {
                    if(t1==4)
                    {
                        t2=(yourmoves[1]!=6)?6:5;
                    }   // End of if 
                    else if(t1==1 || t1==2)
                    {
                        t2=(yourmoves[1]!=6)?6:7;
                    }// End of if else
                    else if(t1==7 || t1==8)
                    {
                        t2=(yourmoves[1]!=6)?6:1;        
                    }// End of if else
                    else
                     {
                        t2=(yourmoves[1]!=2)?2:7;
                    }// End of if else
                }// End of else
                return t2;
            }// end of myThirdMove()
            public int myFourthMove()
            {
                int t1,t2;
                t2=0;
                t1=yourmoves[0];
                if(t1==5)  
                {
                    t2=(yourmoves[2]==4 || yourmoves[2]==7)?6:4;   
                }// End of if
                else
                {
                    if(t1==1|| t1==2)
                    {
                        t2=(yourmoves[2]==5)?8:5;
                    }// End of if
                    else if(t1==4)
                    {
                        t2=(yourmoves[2]==1)?7:1;
                    }// End of else if
                    else if(t1==7||t1==8)
                    {
                        t2=(yourmoves[2]==2)?5:2;
                    }// End of else if
                    else if(t1==6||t1==9)
                    {
                        t2=(yourmoves[2]==4)?5:4;
                    }// End of else if
                }// End of else
                return t2;
            }// end of myFourthMove()
            public int myFifthMove()
            {
                int t1,t2;
                t1=mymoves[3];
                if(t1==6)
                {
                    if(yourmoves[3]!=9)
                    {
                        t2=9;
                    } // End of if
                    else if(yourmoves[2]==4)
                    {
                        t2=7;
                    }// End of else if
                    else
                    {
                        t2=4;
                    }// End of else
                }// End of if  
                else
                {
                    if(yourmoves[3]!=7)
                    {
                        t2=7;
                    } // End of else
                    else if(yourmoves[2]==6)
                    {
                        t2=9;
                    } // End of else
                    else
                    {
                        t2=6;
                    }// End of else
                } // End of else
                return t2; 
            }// end of myFifthMove()
            public void play()
            {
                sc=new Scanner(System.in);
                String ss1,str;
                int b,num,value,i,j,index;
                while(true)
                {
                    ss1=current;
                    drawBoard();
                    System.out.print("\n\n"+ss1+"'s turn::");
                    if(ss1.equals(player1)) // computer's turn
                    {
                        value=1;
                        str=p1symbol;
                        current=player2;
                        num=strategicPlay();
                        mymoves[cell1++]=num;
                    } // End of if
                    else // user's turn
                    {
                        value=2;
                        str=p2symbol;
                        current=player1;
                        num=sc.nextInt();
                        yourmoves[cell2++]=num; 
                    } // End of else
                    i=getRow(num);
                    j=getCol(num);
                    status[i][j]=value;
                    moves++;
                    b=checkGameEnd();
                    if(b>0)
                    {
                        drawBoard();
                        break;
                    } // End of if
                } // End of while
                finalresult(b);
            } // End of play()
            
        }// End of class