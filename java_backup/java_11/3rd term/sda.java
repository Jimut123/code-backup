import java.io.*;
class sda
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
int size,i = 0,j = 0,t,k,mid;
System.out.print("ENTER THE SIZE OF THE ARRAY:");
size = Integer.parseInt(x.readLine());
int s[] = new int[size];
int result[] = new int[size];
System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
for(i = 0;i < size;i++)
{
s[i] = Integer.parseInt(x.readLine());
}
System.out.println("THE ORIGINAL ARRAY:");
for(i = 0;i < size;i++)
{
System.out.print(s[i]+" ");
}
System.out.println();
for(i = 0;i < size-1;i++)
{
for(j = i+1;j < size;j++)
{
if(s[i] < s[j])
{
t = s[i];
s[i] = s[j];
s[j] = t;
  }
 }
}
if((size % 2) == 0)
{
mid = (size/2) - 1;
j = mid - 1;
k = mid + 1;
result[mid] = s[0];
for(i = 1;i < size;i++)
{
if((i % 2) != 0)
{
result[k] = s[i];
k++;
}
else
{
result[j] = s[i];
j--;
  }
 }
}
else
{
mid = size/2;
j = mid - 1;
k = mid + 1;
result[mid] = s[0];
for(i = 1;i < size;i++)
{
if((i % 2) == 0)
{
result[k] = s[i];
k++;
}
else
{
result[j] = s[i];
j--;
  }
 }
}
System.out.println("THE NEW ARRAY:");
for(i = 0;i < size;i++)
{
System.out.print(result[i]+" ");
  }
 }
}



