
import java.text.*;
import java.io.*;
import java.lang.String;
public class address
{
private String street;
private String city;
private String state;
private String state_full;
private String zip;
private String country;
public address(String street,String city, String state, String zip, String country)
{
this.street=new String(street.trim());
this.city=new String(city.trim());
this.state=new String(street.trim());
this.zip=new String(street.trim());
this.country=new String(street.trim());
}
public void appendToStreet(String str)
{
this.street=new String(this.street+((this.street.length()>0 && str.length()>0)?" ":"")+str);
}
public String street()
{
return this.street;
}
public void setStreet(String s)
{
this.street=new String(s);
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
if(this.street.length()<=maxLength)
{
addr[0]=new String(this.street);
addr[1]=new String(""); 
}
else
{
int i=street.lastIndexOf(' ',maxLength);
if(street.length()-i-1<=maxLength)
{
addr[0]=new String(street.substring(0,i));
addr[1]=new String(street.substring(i+1));
}
else
{
addr[0]=new String(street.substring(0,maxLength));
addr[1]=new String(street.substring(maxLength,maxLength*2));
}
}
return addr;
}
}