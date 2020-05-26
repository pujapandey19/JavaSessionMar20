package assignments;

import java.util.ArrayList;

public class TestArrayList {

	int age;
	String name;
	boolean statusActive;
	double salIncrement;
	ArrayList<String>workingEquipments;
	
	public static void main(String[] args) {
		
		TestArrayList wp = new TestArrayList();
		wp.workingEquipments=new ArrayList<String>();
		wp.age= 38;
		wp.name="Delmon";
		wp.statusActive=false;
		wp.workingEquipments.add("ToolBox");
		
	
		
		//System.out.println("My Name is "+" "+wp.name+" "+"I am "+" "+wp.age+" "+"years old"+" "+ "I work with "+ " "+ wp.workingEquipments );
		
		
		
		

	}

}
