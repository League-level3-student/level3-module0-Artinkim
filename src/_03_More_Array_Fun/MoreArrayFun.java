package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printStringsB(String[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.println(a.length-i);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void printStringsE(String[] a) {
		for(int i = 0;i<a.length;i++) {
			if(i%2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void printStringsR(String[] a) {
		Random rand = new Random();
		ArraList int list = new int[a.length];
		for(int i = 0;i<list.length;i++) {
			list[i] = i;
		}
		
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[list[rand.nextInt(a.length)]]);

		}
	}
	
}
