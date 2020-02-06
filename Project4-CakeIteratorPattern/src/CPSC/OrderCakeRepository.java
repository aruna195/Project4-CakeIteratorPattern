package CPSC;


public class OrderCakeRepository implements OrderCakeContainer {
	public String chocolateAttributes[] = {"Type: Regular", "Size: Half ", "Layers: Single", "Theme: Birthday" };
	public String marbleAttributes[] = {"Type: Eggless", "Size: Full ", "Layers: Double", "Theme: Milestone Birthday"};
	public String names[];
	
	private String cakeFlavor;
	
	public OrderCakeRepository (String cakeFlavor) {
		this.cakeFlavor = cakeFlavor;
	}

	   @Override
	   public BakeCakeIterator getIterator() {
		   if(cakeFlavor.equalsIgnoreCase("Chocolate")){
			   names = chocolateAttributes;
		   } else if (cakeFlavor.equalsIgnoreCase("Marble")) {
			   names = marbleAttributes;
		   }
		   
	      return new BakeCakeNameIterator();
	   }

	   private class BakeCakeNameIterator implements BakeCakeIterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
}
	

	