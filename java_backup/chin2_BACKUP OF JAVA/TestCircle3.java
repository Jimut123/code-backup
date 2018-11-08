public class TestCircle3 extends Circle3 
{
    public static void main(String[] args)
    {
        Circle3 myCircle = new Circle3(5.0);
        System.out.println("The area of the circle of radius "+myCircle.getRadius() + " is " +myCircle.getArea() );
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "+myCircle.getRadius() + " is " +myCircle.getArea() );
        System.out.println("The number of objects created is "+Circle3.getNumberOfObjects() );
    }
}
 class Circle3 {
    public Circle3() 
    {
         int numberOfObjects;
    }
    public Circle3(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    /** Return radius */
     public double getRadius(){
       return radius;
     }

 /** Set a new radius */
    public void setRadius(double newRadius){
       radius = (newRadius >= 0) ? newRadius : 0;
    }

 /** Return numberOfObjects */
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

 /** Return the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}