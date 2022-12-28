/* Interview Question
 * Company : Infosys 
 * Role : Java Developer 
 * Experience : 2.1 Years 
 * CTC Offered : 8.4 LPA
 * 
 * Problem Statement : Get the list of all products that belongs to "Books" category and price > 200 using Java 8 features
 * 
 * Input - List of Products
 * 		
 * 		Product p1 = new Product(101, "Java", "Books", 150);
		Product p2 = new Product(102, "SPRING", "Books", 300);
		Product p3 = new Product(103, "HTML", "Books", 100);
		Product p4 = new Product(104, "CSS", "Books", 250);
		Product p5 = new Product(105, "Nokia", "Phone", 3000);
		Product p6 = new Product(106, "Samsung", "Phone", 1500);
		Product p7 = new Product(107, "Lenovo", "Phone",2500);
		
		List<Products> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

 * Output 
 * 			Product[ ID : 102	Category : Books	Price : 300	BookName : SPRING
 *			Product[ ID : 104	Category : Books	Price : 250	BookName : CSS
 */
package interviewquestions;

import java.util.*;
import java.util.stream.Collectors;

class Product{
	
	int key, price;
	String category, bookName;
	
	Product(int Key, String BookName, String Category, int Price)
	{
		key = Key;
		bookName = BookName;
		category = Category;
		price = Price;
	}
	
	public String toString()
	{
		return "Product[ ID : "+key+ "	Category : "+category+"	Price : "+price+"	BookName : "+bookName;
	}
}

public class InfosysJava8LPA {

	public static void main(String[] args) {

		Product p1 = new Product(101, "Java", "Books", 150);
		Product p2 = new Product(102, "SPRING", "Books", 300);
		Product p3 = new Product(103, "HTML", "Books", 100);
		Product p4 = new Product(104, "CSS", "Books", 250);
		Product p5 = new Product(105, "Nokia", "Phone", 3000);
		Product p6 = new Product(106, "Samsung", "Phone", 1500);
		Product p7 = new Product(107, "Lenovo", "Phone",2500);
		
		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
// Getting result using Stream API and forEach loop
products.stream().filter(p->p.category.equalsIgnoreCase("Books")).filter(p->p.price>200).forEach(p->System.out.println(p));
// Getting result using Stream API and collect API
products.stream().filter(p->p.category.equalsIgnoreCase("Books")).filter(p->p.price>200).collect(Collectors.toList()).forEach(System.out::println);
		
		// ForEach loop and without Java8 features
//		for(Product i: products)
//		{
//			if( i.category == "Books" && i.price > 200)
//			{
//				System.out.println(i);
//			}
//		}
//		
//		// Iterator interface simply outputting the value
//		Iterator<Product> it = products.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());			
				
	}	
}