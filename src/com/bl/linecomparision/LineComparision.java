package com.bl.linecomparision;

public class LineComparision {

	private int x1, x2, y1, y2;

	public Integer Linelength() {

		Integer Linelength = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println(" " + Linelength);

		return Linelength;
	}

	public LineComparision(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

	}

	public static void main(String[] args) {
		LineComparision le1 = new LineComparision(1, 2, 1, 2);
		LineComparision le2 = new LineComparision(1, 2, 1, 2);
		Integer Linelength1 = le1.Linelength();
		Integer Linelength2 = le2.Linelength();
		System.out.println(Linelength1.compareTo(Linelength2));

	}

}
