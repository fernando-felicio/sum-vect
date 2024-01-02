package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter? ");
		int n = scanner.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			
			System.out.println("Enter the " + (i + 1) + "º number: ");
			vect[i] = scanner.nextDouble();
		}
		
				
		double sum = 0;
		for (int i =0; i < vect.length; i ++) {
			sum += vect[i];
		}
		
		double average = sum / vect.length;
		
		System.out.print("Numbers= ");		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf(" %.2f ", vect[i]);			
		}
		
		System.out.printf("%nSum = %.2f%n", sum);
		
		System.out.printf("Average = %.2f%n", average);
		
		
		scanner.close();
		
	}

}
