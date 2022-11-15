
public class Test {

	public static void main(String[] args) {
		
		Product[] products = {
		
		new Product("Banan", 10),
		new Product("Milk", 25),
		new Product("Apple", 5.5),
		new Product("Chocolate", 30),
		new Product("Coconut", 50)
		};
		
		Product coconut = products[4];
		double oldPrice = coconut.getPrice();
		double newPrice = oldPrice*1.25;
		coconut.setPrice(newPrice);
		
		Product tmpProduct = products[1];
		products[1] = products[2];
		products[2] = tmpProduct;
		
		
		String row1 = "---- Product Inventory ---- \nProducts in stock: " + products.length + "\n";
		String row2 = "Name \t\tPrice\n-----\t\t-----\n";
		String p1 = products[0].getName() + "\t\t" + products[0].getPrice() + "\n";
		String p2 = products[1].getName() + "\t\t" + products[1].getPrice() + "\n";
		String p3 = products[2].getName() + "\t\t" + products[2].getPrice() + "\n";
		String p4 = products[3].getName() + "\t" + products[3].getPrice() + "\n";
		String p5 = products[4].getName() + "\t\t" + products[4].getPrice() + "\n";
		
		String output = row1 + row2 + p1 + p2 + p3 + p4 + p5;
		System.out.println(output);
	}

}
