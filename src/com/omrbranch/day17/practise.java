package com.omrbranch.day17;

public class practise {

	public static void name(String i) {
		System.out.println("normal method");
		System.out.println("madhan");
		System.out.println();

	}

	public static int text(int a, int b) {
		return a - b;
	}

	public static String school(String c, String d) {
		return c + d;
	}

	public static void main(String[] args) {

		practise p = new practise();
		p.name("kk");

		// return int

		System.out.println("return int");
		int text1 = text(55, 33);
		{
			System.out.println(text1);
		}

		// return string

		System.out.println();
		System.out.println("return String");

		String s = school("apple", "orange");
		{

			System.out.println(s);
		}

		// if ,else if, else

		System.out.println();
		System.out.println("if else elseif method");

		int a = 30;

		if (a > 12) {
			System.out.println("yes");

			if (a > 55) {
				System.out.println("confirm");
			}
		}

		else {
			System.out.println("not working");
		}

		// switch statement

		System.out.println();
		System.out.println("Switch statement int used");

		int day = 3;

		switch (day) {
		case 1:
			System.out.println("day1");
			break;
		case 2:
			System.out.println("day2");
			break;
		case 3:
			System.out.println("day3");
			break;
		default:
			System.out.println("default");
		}

		// Switch statement String

		System.out.println();
		System.out.println("String switch statment");

		String name = "madhan";

		switch (name) {
		case "chennai":

			System.out.println("happy");
			break;

		case "madhan":

			System.out.println("behappy");
			break;

		default:
			System.out.println("default");
		}

		// for loop used

		System.out.println();
		System.out.println("for loop used");

		for (int i = 0; i <= 4; i++) {
			System.out.println(i);
		}

		// while loop used

		System.out.println();
		System.out.println("while loop used");

		int x = 0;
		while (x <= 4) {
			System.out.println(x);
			x++;
		}

		// do-while loop used

		System.out.println();
		System.out.println("do while used");

		int y = 0;
		do {
			System.out.println(y);
			y++;
		} while (y <= 4);

		// break method

		System.out.println();
		System.out.println("Break method");

		for (int i = 0; i <= 6; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}

		// continue method
		
		System.out.println();
		System.out.println("continue method");
		
		for (int i = 0; i <= 4; i++) {
			if (i == 2) {
			continue;
			}
			System.out.println(i);
		}

		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
