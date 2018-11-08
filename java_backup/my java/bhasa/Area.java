//to calculate the area of a parallelogram using the concept of inheritance
public class Area extends Perimeter
    {
        private double h;//data members
        private double area;
        public Area(double l,double br,double ht)//parameterized constructor
        {
            super(l,br);//to assign the values of super class
            h=ht;
            area=0;
        }
        public void doArea()//to calculate the area of the parallelogram
        {
            area=b*h;
        }
        public void show()//to display the result 
        {
            doArea();
            super.show();//to implement the show() of the super class
            System.out.println("height of parallelogram : "+h);
            System.out.println("area of parallelogram : "+area);
        }
    }