package examprac;

import java.io.*;
class overload
{

String S;
int i,v;
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

void str(String s)
{
    S=s;
    v=0;
    for(i=0;i<S.length();i++)
     if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
        v++;
        System.out.println(v);
    }
void str(String s,char c)
{
    S=s;
    v=0;
    for(i=0;i<S.length();i++)
     if(S.charAt(i)==c)
        v++;
        System.out.println(v);
    }   
}
 