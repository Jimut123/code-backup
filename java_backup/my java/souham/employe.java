import java.io.*;
class employe
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String g,nam;
System.out.println("give name and string");
g=br.readLine();
nam=br.readLine();
int i,n,bp,ma,ts,ha,it;
bp=Integer.parseInt(br.readLine());
ha=it=ts=ma=bp;
if(g.compareTo("A")==0)
{
ha=(30*bp/100)+ha;
ma=(20*bp/100)+ma;
it=(25*bp/100)+it;
}
else if(g.compareTo("A")==0)
{
ha=(25*bp/100)+ha;
ma=(15*bp/100)+ma;
it=(20*bp/100)+it;
}
else if(g.compareTo("A")==0)
{
ha=(20*bp/100)+ha;
ma=(10*bp/100)+ma;
it=(15*bp/100)+it;
}
ts=(bp+ha+ma)-it;
System.out.println(nam);
System.out.println(bp);
System.out.println(ha+'\t'+ma+'\t'+it);
}
}