package question1;

import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Processor p[] = new Processor[2];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int r = s.nextInt();
		p[0] = new Circle(r);
		p[0].process();
		
		System.out.println("Enter the number");
		int num = s.nextInt();
		p[1]= new Factorial(num);
		p[1].process();
	}}

