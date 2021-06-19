package com.javaex.ex04;

public class RectTriangle extends Shape {
   
	//필드
	private double width;
	private double height;
	
	
	//생성자
	public RectTriangle() {
		super();
	}

	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	//메소드(게터세터)
	
	//메소드(일반)
	public double getArea() {
		return width * height * (0.5);
	}
	
	public double getPerimeter() {
		return width + height + Math.sqrt( ( width*width )+( height*height ) ); 
	}

	
	
}