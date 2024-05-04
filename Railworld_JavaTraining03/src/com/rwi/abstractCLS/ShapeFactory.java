package com.rwi.abstractCLS;

public class ShapeFactory {
	static Shape s = null;

	public static Shape getObject(String obj) {
		if (obj == "square") {
			s = new Square();
		} else if (obj == "circle") {
			s = new Circle();
		} else if (obj == "ractangle") {
			s = new Ractangle();
		}
		else {
			return null;
		}
		return s;
	}

}
