//class to find the perimeter of a parallelogram
class Perimeter
    {
        protected double a;//data members
        protected double b;
        public Perimeter(double length,double breadth)//parameterized constructor
        {
            a=length;
            b=breadth;
        }
        public double calculate()//to calculate the perimeter of the parallelogram
        {
            double perimeter=0;
            perimeter=2*(a+b);
            return perimeter;
        }
        public void show()//to display the result
        {
            double p=calculate();
            System.out.println("length of parallelogram :"+a);
            System.out.println("breadth of parallelogram :"+b);
            System.out.println("perimeter of parallelogram :"+p);
        }
    }//end of class