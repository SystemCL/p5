package lists;

import java.awt.Toolkit;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listadd {

	public static void main(String[] args) {

		/*
		 * List<String> liste = new ArrayList<String>(); liste.add("A");
		 * liste.add("B"); liste.add("C");
		 * 
		 * System.out.println("First: "+liste.size()); liste = new
		 * ArrayList<String>(); liste.add("D");
		 * System.out.println("Second: "+liste.size());
		 */

		// String - Immutable Object
		String string1 = "Hello AAAAAA!";
		System.out.println(string1);
		string1 = "Hello BBBBBB!";
		System.out.println(string1);
		// string1 este o referinta String si primeste adresa noului obiect

		List<String> listc = new ArrayList<String>();
		listc.add("4");
		listc.add("5");
		System.out.println(listc.size());
		doSomething(listc);
		System.out.println(listc.size());

		System.out.println("Upper bounded wildcard");
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));

		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));


		// System.out.println(listd.size());


	}

	public static void doSomething(List<String> listc) {

		listc.add("1");
		listc.add("2");
		listc.add("3");
		listc = new ArrayList<String>();
		listc.add("6");
		// System.out.println(listc.size());
	}

	// Upper Bounded Wildcard
	// Aceeasi metoda sumOfList lucreaza cu subtipurile lui Number: Integer, Float, Double
	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}
	

}


