
public class Main {

	public static void main(String[] args) {
		
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

		cars[0] = "Mustang";
		System.out.println(cars[3]);
		
		String[] brands = new String[3];
		
		brands[0] = "Supreme";
		brands[1] = "Nike";
		brands[2] = "Adidas";
		
		for(int i=0; i<brands.length; i++) {
			
			System.out.println(brands[i]);
			
		}
	}

}
