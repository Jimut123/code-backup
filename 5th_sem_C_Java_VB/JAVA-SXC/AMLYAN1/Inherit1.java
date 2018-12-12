import java.util.*;
class Inherit1 extends Inherit
{
	int x,y,z;
	Scanner sc = new Scanner(System.in);
	static void input1()
	{
		super.input();
		x = sc.nextInt();
		y = sc.nextInt();
	}
	void Sum1()
	{
		super.Sum();
		z = x+y;
		System.out.printf("z = "+z);
	}

	public void main(String[] args)
	{
		input1();
		Sum1();
	}
}
