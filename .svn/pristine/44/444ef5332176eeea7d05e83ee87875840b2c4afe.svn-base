/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_02_CalcCells.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: ÉÏÎç9:25:47
*/
package com.chinasofti.day15.task03.di01.goodscalc;

import java.util.ArrayList;
import java.util.Collection;

public class Di_02_CalcCells {

	public static void main(String[] args) {
		testRef();
	}

	public static void testRef() {
		Collection<Cell> cells = new ArrayList<Cell>();
		Cell c0 = new Cell(5, 6);
		Cell c1 = new Cell(7, 9);
		cells.add(c0);
		cells.add(c1);
		System.out.println(c0 + "," + c1);
		System.out.println(cells);
		c0.drop();
		c1.drop();
		System.out.println(c0 + "," + c1);
		System.out.println(cells);
	}

}

class Cell {
	int row;
	int col;

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public void drop() {
		row++;
	}

	@Override
	public String toString() {
		return "(" + row + "," + col + ")";
	}
}
