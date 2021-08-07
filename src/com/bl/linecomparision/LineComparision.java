package com.bl.linecomparision;

public class LineComparision {

	public static void Linelength1(int x1, int x2, int y1, int y2, int Linelength1) {

		Linelength1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println(" " + Linelength1);
	}

	public static void Linelength2(int x3, int x4, int y3, int y4, int Linelength2) {
		Linelength2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

		System.out.println(" " + Linelength2);
	}

	Object Linelength2;
	private Object Linelength1;

	public static void main(String[] args) {
		LineComparision le1 = new LineComparision();

		LineComparision le2 = new LineComparision();
		LineComparision.Linelength1(1, 2, 1, 2, 0);
		LineComparision.Linelength2(1, 2, 1, 2, 0);
		if (le1.Linelength1 == le2.Linelength2)

		{
			System.out.println("length is equal ");
		} else {
			System.out.println("length is not equal");
		}

	}

}
