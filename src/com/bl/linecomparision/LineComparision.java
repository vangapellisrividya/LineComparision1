package com.bl.linecomparision;

public class LineComparision {
	public static void Linelength(int x1, int x2, int y1, int y2, int Linelength) {

		Linelength = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println(" " + Linelength);
	}

	public static void main(String[] args) {
		Linelength(1, 2, 1, 2, 0);

	}
}
