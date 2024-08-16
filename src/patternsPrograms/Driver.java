package patternsPrograms;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ImplementationOfPatterns patterns = new ImplementationOfPatterns();
		
		System.out.println("Enter a General size for pattern: ");
		int num = sc.nextInt();
		System.out.println("Enter a Symbol for pattern: ");
		char symbol = sc.next().charAt(0);

		System.out.println("\t\t1) >>>>>> Square Pattern <<<<<<");
		patterns.starPatterns(num, symbol);

		System.out.println("\n\n\t\t2) >>>>>> Right Angle Triangle Pattern- I <<<<<<");
		patterns.rightAngledTriangle(num, symbol);

		System.out.println("\n\n\t\t15) >>>>>> Invers of Right Angle Triangle Pattern- I <<<<<<");
		patterns.inversOfRightAngledTriangle(num, symbol);
		
		System.out.println("\n\n\t\t26) >>>>>> First Space then Right Angle Triangle Pattern- I <<<<<<");
		patterns.firstSpaceRightAngledTriangle(num, symbol);
		
		System.out.println("\n\n\t\t30) >>>>>> Inverse of First Space then Right Angle Triangle Pattern- I <<<<<<");
		patterns.inversOfFirstSpaceRightAngledTriangle(num, symbol);
		
		System.out.println("\n\n\t\t35) >>>>>> Pyramid Pattern- I <<<<<<");
		patterns.pyramidPattern(num, symbol);
		
		System.out.println("\n\n\t\t40) >>>>>> Invers of Pyramid Pattern- I <<<<<<");
		patterns.inversOfPyramidPattern(num, symbol);
		
		System.out.println("\n\n\t\t45) >>>>>> Daimond Pattern- I <<<<<<");
		patterns.diamondPattern(num, symbol);
		
		System.out.println("\n\n\t\t50) >>>>>> Swastika Pattern <<<<<<");
		patterns.swastikaPattern(num, symbol);
	}

}
