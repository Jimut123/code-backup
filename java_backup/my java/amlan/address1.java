
import java.text.*;
import java.io.*;
import java.lang.String;
public class address1
{
private String[] street;
private String city;
private String state;
private String state_full;
private String zip;
private String country;
public address1(String[] street1,String city, String state, String zip, String country)
{
int i;
 street=new String[street1.length];
//System.out.println(street1.length);
for(i=0;i<street1.length;i++)
{
//System.out.println(street1[i]);
//this.street[i]=street[i].trim();
this.street[i]=new String(street1[i].trim());
//System.out.println(street[i]);
}
this.city=new String(city.trim());
this.state=new String(state.trim());
this.zip=new String(zip.trim());
this.country=new String(country.trim());
}
public void appendToStreet(String str)
{
int i;
if(street.length>0)
{

for(i=0;i<street.length;i++);
street[i-1]=street[i-1]+str;
//street[i]=str;
}
else
{
street[0]=str;
}
}
//this.street=new String(this.street+((this.street.length()>0 && str.length()>0)?" ":"")+str);

public String[] street()
{
int i;
//System.out.println(street.length);
for(i=0;i<street.length;i++)
{
//System.out.println(street1[i]);
//this.street[i]=street[i].trim();
//this.street[i]=new String(street1[i].trim());
System.out.println(street[i]);
}
return this.street;
}
public void setStreet(String[] s)
{
int i;
street=s;
//for(i=0;i<s.length;i++)
//{
//this.street[i]=new String(s[i]);
//}
//this.street[i-1]=street[i-1]+" "+s[i];
}
public String city()
{
return this.city;
}
public void setCity(String s)
{
this.city=new String(s);
}
public String state()
{
return this.state;
}
public void setState(String s)
{
this.state=new String(s);
}
public String zip()
{
return this.zip;
}
public void setZip(String s)
{
this.zip=new String(s);
}
public String country()
{
return this.country;
}
public void setCountry(String s)
{
this.country=new String(s);
}
public String[] get2AddrLines(int maxLength)
{
String[] addr=new String[2];
int i,c,j;
c=0;
for(i=0;i<street.length;i++)
{

if(street[i].length()<=maxLength)
{
addr[c]=new String(this.street[i]);
addr[c+1]=new String(""); 
break;
}
else
{
int k=street[i].lastIndexOf(' ',maxLength);
if(street[i].length()-k-1<=maxLength)
{
addr[c]=new String(street[i].substring(0,i));
addr[c+1]=new String(street[i].substring(i+1));
break;
}
else
{
addr[c]=new String(street[i].substring(0,maxLength));
addr[c+1]=new String(street[i].substring(maxLength,maxLength*2));
break;
}
}
}

return addr;
}
}