package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {

		List<Shape> sList = new ArrayList<Shape>();

		Shape rec = new Rectangle(5, 6);
		Shape tri = new RectTriangle(6, 2);
		sList.add(rec);
		sList.add(tri);

		for (int i = 0; i < sList.size(); i++) {

			System.out.println("area: " + sList.get(i).getArea());
			System.out.println("perimeter: " + sList.get(i).getPerimeter());

			if (sList.get(i) instanceof Resizeable) {
				((Resizeable) sList.get(i)).resize(0.5);  // Rectangle만 Resizeable 인터페이스이기때문에

				System.out.println("new area: " + sList.get(i).getArea());
				System.out.println("new perimeter: " + sList.get(i).getPerimeter());
			}
		}

	}
}
