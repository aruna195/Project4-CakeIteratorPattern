package CPSC;

import java.util.Scanner;

public class CakeIteratorPatternDemo {

	public static void main(String[] args) {
		
		boolean runFlag = true;
		
		while(runFlag) {
			runFlag = false;
			Scanner in = new Scanner(System.in);		
	
			System.out.println("Enter the Cake Flavor: ");
	
			String flavor = in.next();
			
			OrderCakeRepository  ordercakerepo = new OrderCakeRepository(flavor);
			
			BakeCakeIterator bakeCakeIterator = ordercakerepo.getIterator();
			System.out.println("Details for Cake Ordered : " + flavor);
			
			try {
				while(bakeCakeIterator.hasNext()) {
					String name= (String)bakeCakeIterator.next();
					System.out.println(name);
				}
			} catch (Exception e) {
				System.out.println("Error occurred. Enter a valid flavor.");
				runFlag = true;
				
			}
		}
	}

}
