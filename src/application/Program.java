package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	// public static int globalValue = 3;

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort(Program::compareProducts);
		
		list.forEach(System.out::println);
		
		/*
		 * int[] vect = new int[] { 3, 4, 5 }; changeOddValues(vect); // Mude os valores
		 * impares passando vect como argumento
		 * System.out.println(Arrays.toString(vect)); }
		 * 
		 * public static void changeOddValues(int[] numbers) { for (int i = 0; i <
		 * numbers.length; i++) { if(numbers[i] % 2 != 0) { numbers[i] += globalValue; }
		 * } }
		 */
	}

}
