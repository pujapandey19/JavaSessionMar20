package assignments;

public class PrintNumber0To39 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 39; i++) {

			if (i < 10) {
				System.out.print("0" + i + " ");
				
			} else if(i%10==0) {
				System.out.println(i);
			}
			 else {
				System.out.print(i + " ");
			}

		}
	}

	}


