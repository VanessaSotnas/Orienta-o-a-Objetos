package objetos;

import java.util.Scanner;
import objetos.Product;

public class program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    	
	    System.out.println("Enter product data:");
	    System.out.print("Name: ");
	    String name = sc.nextLine();
	    System.out.print("Price: ");
	    Double price = sc.nextDouble();
	    System.out.print("Quantity in stock: ");
	    int qntd = sc.nextInt();
	    
	    Product product1 = new Product(name, price, qntd);
	    
	    System.out.println("Product data: " + product1);
	    System.out.println();
	    System.out.print("Enter the number of products to be added in stock: ");
	    qntd = sc.nextInt();
	    product1.addProducts(qntd);
	   
	    System.out.println();
	    System.out.println("Updated data: " + product1);
	   
	    System.out.println();
	    System.out.print("Enter the number of products to be removed from stock: ");
	    qntd = sc.nextInt();
	    product1.removeProducts(qntd);
	    
	    System.out.println();
	    System.out.println("Updated data: " + product1);
	    
	    
		sc.close();

	}

}
