package assignments;

import java.util.ArrayList;

public class UpdateArrayList {

	String custName;
	int custID;
	char custGender;
	boolean custActive;
	String custAddress[];
	ArrayList<String> custAccountType;
	double custROI;

	public static void main(String[] args) {

		UpdateArrayList cust = new UpdateArrayList();
		cust.custName = "David";
		cust.custID = 42;
		cust.custGender = 'M';
		cust.custActive = true;

		cust.custAddress = new String[3];
		cust.custAddress[0] = "Local Address";
		cust.custAddress[1] = "Permanent Address";
		cust.custAddress[2] = "Correspondence Address";

		cust.custAccountType = new ArrayList<String>();
		cust.custAccountType.add("Savings A/c");
		cust.custAccountType.add("Checking A/c");
		cust.custAccountType.add("Loan A/c");

		System.out.println("Details of Customer:");
		System.out.println("Customer Name is " + " " + cust.custName + " " + "his" + " " + cust.custAccountType.get(0)
				+ " " + "is Active");
		System.out.println("Update Savings A/c to Checking a/c for Account holder David");
		cust.custAccountType.set(0, cust.custAccountType.get(1));
		System.out.println(
				"Customer Name is " + " " + cust.custName + " " + "his" + " " + "a/c type has changed to checking a/c");

	}

}
