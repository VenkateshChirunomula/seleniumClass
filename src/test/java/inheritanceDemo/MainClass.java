package inheritanceDemo;

public class MainClass {


	public static void main(String[] args) {
		
		Child_sub_derived csd = new Child_sub_derived();
		
		csd.car="toyota";
		
		csd.carlist();
		csd.childcar();
		
		csd.house="2bhk";
		csd.land="2acres";
		
		csd.childlandandhouse();
		csd.landAndHouse();
		
		Child_sub_derived csd1 = new Child_sub_derived();
		
		csd1.car="rollce roys";
		
		csd1.carlist();
		
		Parent_super_base psb = new Parent_super_base();
		
		psb.car="tata";
		psb.carlist();
		
	
	}
}
