#include<stdio.h>
#include<conio.h>

void func1(int);
int func2(int,int,int);

int a[100][100],i,j,r,r1,c,c1;
main()
{
      printf("\nEnter the matrix limit :\n");
      scanf("%d",&n);
      printf("\nEnter the matrix elements :\n");
      for(i=0;i<n;i++)
      {
       scanf("%d",&a[i]);
       if(a[i][j]>1)
       {
                    printf("\nERROR!!!!!!!!\nGive inputs b/w 1 and 0 only!!!!!!!");
                    main();
       }
      printf("\nYour matrix :\n");
      for(i=0;i<n;i++)
      printf("%d, ",a[i]);
      i=j=0;
      printf("\n");
      func1(i);
      getch();
}
void func1(int i)
{
     if(i==n)
     {
     

disp(n);
input(n);
}
void disp(int n)
{
System.out.println("\nyour matrix :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ("+i+","+j+"), ");
System.out.println("");
}
}
void input(int n)
{
System.out.println("\ngive the index from where you want to delete the integer '1' :::");
System.out.println("give the row :");
r=ob.nextInt();
System.out.println("give the column :");
c=ob.nextInt();
if(a[r][c]==1)
{
System.out.println("your choice of index do contain an integer '1' ::::");

del(n,r,c);
}
else
{
System.out.println("your choice of index does not contain an integer '1' !!!!!!!!!!!!!");
input(n);
}
del(n,r,c);
System.out.println("\nafter the updation :");
disp(n);
}
void del(int n, int r, int c)
{
if(r==n || r<0)
return;
else
if(c==n || c<0)
return;
else
if(a[r][c]==0)
return;
else
if(a[r][c]==1)
{
a[r][c]=0;
disp(n);
del(n,r,c+1);
del(n,r,c-1);
del(n,r+1,c);
del(n,r-1,c);
del(n,r+1,c+1);
del(n,r-1,c-1);
del(n,r-1,c+1);
del(n,r+1,c-1);
}
}
}
