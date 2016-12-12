public class scannerwhile{
	public static void main(String[] args) {
		String data;

		while(true){
			System.out.print("input data");
				data = new java.util.Scanner(System.in).nextLine();

				if(data.equals("")) {
				break;
			}

				System.out.println(data);
			}
		

	}
}