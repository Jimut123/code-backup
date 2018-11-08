// Project folder:  ...\Source_IX\Chapter 17\AreaRect
	// Program to find the area of a rectangle
	class AreaRect {
		int length, breadth;
	  	void show(int x, int y)
  		{
  			length = x;
	    		breadth = y;
  		}
	  	int calculate()
  		{
  			return(length * breadth);
	  	}
		public static void main(String[] args)
		{
			AreaRect rectangle = new AreaRect();
		    	int a = 10;	// Length
		    	int b = 8;	// Breadth
		    	rectangle.show(a, b);
		    	System.out.println("You have entered these values : " +  a  + 
					" and " +  b);
		    	int area = rectangle.calculate();
		    	System.out.println("Area of a rectange is  : " + area);
  		}
	}