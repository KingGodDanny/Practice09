package com.javaex.ex04;

public abstract class Shape {

	// 필드
	private int countSides;

	
	//생성자
	public Shape() {
		super();
	}

	public Shape(int countSides) {
		super();
		this.countSides = countSides;
	}

	
	//메소드(게터세터)
	public int getCountSides() {
		return countSides;
	}
	
	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}

	
	
	//메소드(일반)
	@Override
	public String toString() {
		return "Shape [countSides=" + countSides + "]";
	}
	
	
	public abstract double getArea();
	
	
	public abstract double getPerimeter();
	

}
