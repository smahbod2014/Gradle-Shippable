
package com.koda.gradletutorial;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Hello gradle!");
		System.out.println("5 + 3 = " + add(5, 3));
		System.out.println("Area of 10 by 5 triangle is " + areaOfTriangle(10.0, 5.0));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static double areaOfTriangle(double base, double height) {
		return base * height / 2;
	}

	public static String concat(String[] strings) {
		String result = "";
		for (int i = 0; i < strings.length; i++) {
			result += strings[i];
		}
		return result;
	}
}
