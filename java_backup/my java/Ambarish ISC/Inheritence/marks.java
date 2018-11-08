package Inheritence;


class marks extends student
{
    int M1,M2,M3,total,total1;
    void input(String n,int r,int s,int a,int b,int c,int t)
    {
      super.input(n,r,s);
      M1=a;
      M2=b;
      M3=c;
      total=t;
    }
    void display()
    {   super.display();
        total1=M1+M2+M3+total;
        System.out.println("Marks1 "+M1);
        System.out.println("Marks2 "+M2);
        System.out.println("Marks3 "+M3);
        System.out.println("Marks4 "+total);
        System.out.println("TOTAL "+total1);
    }
}
