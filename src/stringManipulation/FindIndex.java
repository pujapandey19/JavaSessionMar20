package stringManipulation;

public class FindIndex {

	public static void getIndex(String str) {
		if(str!=null && str.indexOf(str)>0){
			System.out.println(str.indexOf(0));
		}
		else {
		int a=-1;
		System.out.println(a);
		}
		
		}
		
	
	public static void main(String[] args) {
		
		getIndex("hello");
	}

}
