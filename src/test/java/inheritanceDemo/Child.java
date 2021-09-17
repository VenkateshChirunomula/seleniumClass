package inheritanceDemo;



public class Child extends Parent{

	public Child(String car) {
		super(car);
	}
	
	public void drive()
	{
		System.out.println("child is driver");
		System.out.println("car is : "+car);
		System.out.println("max speed : "+maxspeed);	
	}
	public void driveChild()
	{
		System.out.println("child is driver");
		System.out.println("car is : "+car);
		System.out.println("max speed : "+maxspeed);
	}

}
