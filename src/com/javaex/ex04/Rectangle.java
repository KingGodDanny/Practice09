package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
   
	//필드
	private double width;
	private double height;
	
	
	//생성자
	public Rectangle() {
		super();
	}


	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//메소드(게터세터)
	
	
	//메소드(일반)
	
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return ( width+height ) * 2;
	}
	
	public void resize(double s) {
        width = width * s;
        height = height * s;
    }
	
}