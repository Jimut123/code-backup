package project;

import java.io.*;
class tax
{    public  void main1()throws IOException
    {
        
    int t,Income;
    //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Income=Integer.parseInt(br.readLine());
        System.out.println("Income:");
        t=0;
        if(Income<=100000)
        t=0;
        else
        if(Income<=250000)
        t=(Income-100000)*10/100;
        else
        if(Income<=500000)
        t=(10000+(Income-250000))*15/100;
        else
        if(Income<=1000000)
        t=(15000+(Income-500000))*20/100;
        else
        if(Income>1000000)
        t=(25000+(Income-1000000))*25/100;
        System.out.println("tax"+t);
    }
        }
