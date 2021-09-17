package inheritanceDemo;

public class MainMethdo2 {

	public static void main(String[] args) {
		
		Overriding o = new Overriding();
		o.method1();
		o.method2();
		System.out.println("===============");
		
		methods m = new Overriding();
		m.method1();
		m.method2();
		System.out.println("===============");
		
		methods m1 = new methods();
		m1.method1();
		m1.method2();
		
		
	}
}
