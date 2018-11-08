package testpaper.proj;

class obj_arr
{
public static void main(int n)
{
marks a[]=new marks [n];
for(int i=0;i<n;i++)
{
a[i]=new marks();
a[i].input();
a[i].display();
}
}
}
