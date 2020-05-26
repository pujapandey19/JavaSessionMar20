package stringManipulation;

public class ReturnSpecificAvailIndex {

	static String arr[]= {"Hi","Hello","Bye"};
	public static int getAvailableIndex(String st[],String str) {
		for(int i=0;i<st.length;i++) 
			if(st[i].equals(str)) {
				return i;
			}
		
			
		
		
			
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		
		getAvailableIndex(arr,"Hi");


}
}
