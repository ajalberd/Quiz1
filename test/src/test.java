//By Andrew Alberding
//I understand the code is clunky but I am still learning!

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double touchdowns;
		double yards;
		double completions;
		double attempts;
		double interceptions;
		System.out.println("Touchdowns?");
		touchdowns = input.nextDouble();
		System.out.println("Yards?");
		yards = input.nextDouble();
		System.out.println("Completions?");
		completions = input.nextDouble();
		System.out.println("Attempts?");
		attempts = input.nextDouble();
		System.out.println("Interceptions?");
		interceptions = input.nextDouble();
		double a = ((completions / attempts) - .3) * 5;
		double b = ((yards / attempts) - 3) * .25;
		double c = ((touchdowns / attempts)) * 20;
		double d = 2.375 - ((interceptions / attempts)) * 25;
		double rating = ((a + b + c + d) / 6) * 100;
		System.out.println(rating);
	}

}