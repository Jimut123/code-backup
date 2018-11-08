package assignment;

import java.io.*;
class word_freq
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s;
    int ch,w,w1,i,j;
    void input()throws IOException
    {
        System.out.println("enter the string");
        s=br.readLine();
    }
   