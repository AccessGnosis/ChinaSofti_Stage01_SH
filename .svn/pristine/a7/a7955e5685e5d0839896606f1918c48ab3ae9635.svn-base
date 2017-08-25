/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Point.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 下午4:56:57
*/
package com.chinasofti.day19.generic;

//泛型：广泛的通用类型
//具体指那种类型：不同的调用者使用不同的数据类型
//在Point类中，T表示任意一种数据类型，仅仅是占位符
public class Point<T> {// T表示任意类型，具体的类型由调用者决定
	private T x;
	private T y;

	public Point(T x, T y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

}
