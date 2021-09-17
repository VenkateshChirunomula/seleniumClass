package inheritanceDemo;

public class Parent {
	
	String car;
	int maxspeed;
	
	public Parent(String car) {
		
		this.car= car;
		this.maxspeed =800;
	}
	
	
	public void drive()
	{
		System.out.println("driver parent..");
		System.out.println("car is :"+car);
		System.out.println("maxspeed:"+maxspeed);
	}
}
