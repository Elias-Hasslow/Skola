
public class Test {

	public static void main(String[] args) {
		
		Product[] products = {
				new Product("Banana", 10),
				new Product("Milk", 25),
				new Product("Apple", 5.5),
				new Product("Chocolate", 30),
				new Product("Coconut", 50),
					
		};
				Product coconut = products[4];
				double oldPrice = coconut.getPrice();
				double newPrice = oldPrice * 1.25;
				coconut.setPrice(newPrice);
				
				Product tmpProduct = products[1];
				products[1] = products[2];
				tmpProduct = products[2];
				
				 
				System.out.println("---- Product Inventory ---- \nProducts in stock: " + products.length 
						+ "\nName \t\tPrice \n----- \t\t---- \n" + products[0].getName() +"\t\t" + products[0].getPrice() 
						+ "\n" +products[1].getName() +"\t\t" + products[1].getPrice() 
						+ "\n" +products[2].getName() +"\t\t" + products[2].getPrice()
						+ "\n" +products[3].getName() +"\t" + products[3].getPrice()
						+ "\n" +products[4].getName() +"\t\t" + products[4].getPrice());
				
	}
}
