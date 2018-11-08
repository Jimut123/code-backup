

 #include<stdio.h>

int main()
{  
  float x1,x2,y1,y2,m,c;
  printf("enter the value of x1 and y1 \n");
  scanf("%f %f",&x1,&y1);
  printf("enter the value of x2 and y2 \n");
  scanf("%f %f",&x2,&y2);
  if(x1==x2&&y1==y2)
    {
      printf("they are same points infinite number of lines are possible\n");
    }
  else if(x1==x2||y1==y2)
    {
      if(x1==x2)
 printf("the equation of line is x= %f",x1);
      else
 printf("the equation of line is y= %f",y1);
    }
  else
    {
      m= (y2-y1)/(x2-x1);
      c=y2-(m*x2);
      printf("the equation of line is y=%fx+%f \n",m,c);
    }
  return 0;
}
