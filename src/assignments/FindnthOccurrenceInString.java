package assignments;

public class FindnthOccurrenceInString {

	public static void main(String[] args) {
		
			
				String str= "This is my first selenium code and I am super happy";
				int s=str.indexOf('m', 0);//1st occurrence
				System.out.println("1st Occurrence of m is at "+  " "+ s+ " "+ "position");//1st occurrence
				
				int r = str.indexOf('m', s+1);//2nd occurrence
				System.out.println("2nd Occurrence of m is at "+  " "+ r+ " "+ "position");//2nd occurrence
				
				int q = str.indexOf('m', r+1);
				System.out.println("3rd Occurrence of m is at "+  " "+ q+" "+ "position");//3rd occurrence
				
			}

	}


